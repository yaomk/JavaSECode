## Map 实现类源码分析

### HashMap 中元素的特点

* `HashMap` 中所有的 `key` 彼此之间是不可重复的、无序的。所有的key就构成一个 `Set` 集合。`key` 所在的类要重写 `hashCode()`
  和 `equals()`。
* `HashMap` 中的 `value` 彼此之间是可重复的、无序的。所有的 `value` 就构成了一个 `Collection` 集合。`value` 所在的类要重写
  `equals()`。
* `HashMap` 中的一个 `key-value`，就构成了一个 `entry`。
* `HashMap` 中所有的 `entry` 彼此之间是可不重复的、无序的。所有的 `entry` 就构成了一个 `Set` 集合。

### HashMap 源码解析

#### 1. jdk7 中创建对象和添加数据过程（JDK1.7.0_07为例）：

```
// 创建对象的过程中，底层会初始化数组 Entry[] table = new Entry[16]; 默认容量为 16. (2的n次幂 2ⁿ) 
HashMap<String, Integer> map = new HashMap<>();

map.put("AA", 18); // "AA"和18 封装到一个 entry 对象中。然后考虑添加进入 table 中。
```

##### 添加/修改的过程：

* 将`（key1,value1)` 添加到当前的 `map` 中：

1. 首先，需要调用 `key1` 所在类的 `hashCode()` 方法，计算 `key1` 对应的 `哈希值1`，此 `哈希值1` 经过某种算法（`hash()`）之后，得到
   `哈希值2`。
2. `哈希值2` 在经过某种算法（`indexFor()`）之后，就确定了 `(key1, value1)` 在数组中 `table` 中的`索引位置 i`。
    * 如果此 `索引位置 i` 的数组上没有元素，则 `(key1, value1)` 添加成功。
    * 如果此 `索引位置 i` 的数组上有元素 `(key2, value2)`，则需要继续比较 `key1` 和 `key2`  `哈希值2`。 ---> 即`哈希冲突`。
        * 如果 `key1` 的 `哈希值2` 与 `key2` 的 `哈希值2` 不相同，则 `(key1, value1)` 添加成功。
        * 如果 `key1` 的 `哈希值2` 与 `key2` 的 `哈希值2` 相同，则需要继续比较 `key1` 和 `key2` 的 `equals()`。要调用
          `key1` 所在类的 `equals()`，将 `key2` 作为参数传递进去。
            * 调用 `equals()`，返回 `false`：则 `(key1, value1)` 添加成功。
            * 调用 `equals()`，返回 `true`：则认为 `key1` 和 `key2` 是相同的，默认情况下，`value1` 替换原有的 `value2`。

说明：

* `索引位置 i` 如果已有元素时，将 `(key1, value1)` 元素与现有的 `(key2, value2)` 构成单向链表结构，`(key1, value1)` 指向
  `(key2, value2)`。（链表头插法）

随着不断的添加元素，在满足如下的条件的情况下，会考虑扩容：

* `(size >= threshold) && (null != table[i])` 当元素的个数达到临界值（数组的长度 * 加载因子）时，就考虑扩容。
* 默认的临界值：`threshold = 16 * 0.75 = 12`。默认扩容为原来的 `2` 倍。

#### 2. jdk8 与jdk7的不同之处（以JDK1.8.0_271为例）：

* 在 `jdk8` 中，当我们创建了 `HashMap` 实例后，底层并没有直接初始化 `table` 数组。当首次添加 `(key,value)` 时，进行判断，如果发现
  `table` 尚未初始化，则对数组进行初始化。
* 在 `jdk8` 中，`HashMap` 底层定义了 `Node` 内部类，替换 `jdk7` 中的 `Entry` 内部类。意味着我们创建的数组是 `Node[]`。
* 在 `jdk8` 中，如果当前的 `(key, value)` 经过一系列判断以后，可以添加到当前的数组 `角标 i` 中，如果此时 `角标 i` 位置上有元素，在
  `jdk7` 中是将新的 `(key, value)`
  指向已有的旧的元素（头插法），而在 `jdk8` 中是旧的元素指向新的 `(key, value)` 元素。（尾插法）
* `jdk7`：数组 + 单项链表
* `jdk8`：数组 + 单向链表 + 红黑树
    * 什么时候会使用单向链表变为红黑树：如果数组 `索引 i` 位置上的元素的个数达到 `8`，并且数组的长度达到 `64` 时，我们就将此
      `索引 i` 位置上的多个元素改为使用红黑树结构进行存储。
    * 什么时候会使用红黑树变为单向链表：当使用红黑树的 `索引 i` 位置上的元素的个数低于 `6` 时，就会将红黑树结构退化为单项链表。
    * 为什么要使用红黑树？红黑树进行 `put()/get()/remove()` 的操作的时间复杂度为 `O(logN)`，性能更好。而单向链表为 `O(N)`。
    * 为什么不直接使用红黑树（或为什么红黑树需要退化为单项链表）？
        * 红黑树存储占用空间大，并且维护成本高（需要保持树平衡，需要进行左旋、右旋、变色等复杂操作）。
        * HashMap 中实现的一个桶中链表长度达到 `8` 的概率极小，树化被视为应对极端情况（如`严重的哈希冲突或DoS攻击`
          ）的“保险措施”，而不是常态。

#### jdk8 中 HashMap 源码中的属性

```java
static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // 默认的初始容量 16
static final int MAXIMUM_CAPACITY = 1 << 30; // 最大容量 1 << 30
static final float DEFAULT_LOAD_FACTOR = 0.75f; // 默认加载因子
static final int TREEIFY_THRESHOLD = 8; // 默认树化阈值 8，当链表的长度达到这个值后，要考虑树化
static final int UNTREEIFY_THRESHOLD = 6; // 默认反树化阈值 6，当树中节点的个数达到此阈值后，要考虑变为链表

// 当单个的链表的节点个数达到 8，并且 table 的长度达到 64，才会树化。
// 当单个链表的节点个数达到 8，但 table 的长度小于 64，会先扩容。
static final int MIN_TREEIFY_CAPACITY = 64; // 最小树化容量 64

transient Node<K, V>[] table; // 数组
transient int size; // 记录有效映射关系的对数，也是 Entry 对象的个数
int threshold; // 阈值，当 size 达到阈值时，考虑扩容
final float loadFactor; // 加载因子，影响扩容的频率

```













