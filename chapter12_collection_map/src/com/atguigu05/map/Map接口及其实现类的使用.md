## Map 及其实现类对比

```text
java.util.Map: 存储一对一对的数据（key-value键值对，(x1,y1)、(x2,y2) --> y=f(x)，类似于高中的函数）
    |---- HashMap: 主要实现类；线程不安全的，效率高；可以添加 null 的 key 和 value 值，底层使用 数组+单向链表/红黑树优化 结构存储（jdk8）
        |---- LinkedHashMap: 是 HashMap 的子类；在 HashMap 使用的数据结构的基础上，增加了一对双向链表，用于记录添加的元素的先后顺序，进而在遍历元素时，就可以按照添加的顺序显示。开发中，对于频繁的遍历操作，建议使用此类。
    |---- TreeMap: 底层使用红黑树存储；可以按照添加的 key-value 中的 key 元素的指定的属性的大小进行遍历。需要考虑使用①自然排序②定制排序。 
    |---- Hashtable: 古老实现类；线程安全的，效率低；不可以添加null的key和value值，底层使用数组+单向链表结构存储
        |---- Properties: 其 key 和 value 都是 String 类型。常用来处理属性文件。

```

## HashMap 中元素的特点
* `HashMap` 中所有的 `key` 彼此之间是不可重复的、无序的。所有的key就构成一个 `Set` 集合。`key` 所在的类要重写 `hashCode()` 和 `equals()`。
* `HashMap` 中的 `value` 彼此之间是可重复的、无序的。所有的 `value` `就构成了一个Collection` 集合。`value` 所在的类要重写 `equals()`。
* `HashMap` 中的一个 `key-value`，就构成了一个 `entry`。
* `HashMap` 中所有的 `entry` 彼此之间是可不重复的、无序的。所有的 `entry` 就构成了一个 `Set` 集合。

## Map 中常用方法
* 添加、修改操作：
  * `Object put(Object key, Object value)`: 将指定 key-value 添加到到（或修改）当前 map 对象中
  * `void putAll(Map m)`: 将 m 中的所有 key-value 添加到当前 map 中
* 删除操作：
  * `Object remove(Object key)`: 删除指定 key 对应的 key-value 对，并返回 value
  * `void clear()`: 清空当前 map 对象中的所有数据
* 元素查询操作：
  * `Object get(Object key)`: 返回指定 key 对应的 value
  * `boolean containsKey(Object key)`: 判断当前 map 中是否包含指定的 key
  * `boolean containsValue(Object value)`: 判断当前 map 中是否包含指定的 value
  * `int size()`: 返回当前 map 中 key-value 对的个数
  * `boolean isEmpty()`: 判断当前 map 中是否为空
  * `boolean equals(Object obj)`: 判断当前 map 对象是否和参数对象 m 对象相等
* 元素图操作方法：
  * `Set keySet()`: 返回当前 map 对象中的所有 key 构成的 Set 集合
  * `Collection values()`: 返回当前 map 存储的所有 value 构成的 Collection 集合
  * `Set entrySet()`: 返回当前 map 存储的所有 key-value 对的 Set 集合

### 常用方法小结：
* 增：
  * `put(Object key, Object value)`
  * `putAll(Map m)`
* 删：
  * `Object remove(Object key)`
* 改：
  * `put(Object key, Object value)`
  * `putAll(Map m)`
* 查：
  * `Object get(Object key)`
* 长度：
  * `size()`
* 遍历：
  * `遍历 key 集：Set keySet()`
  * `遍历 value 集：Collection values()`
  * `遍历 entry 集：Set entrySet()`

### 面试题：
1. 区别 `HashMap` 和 `Hashtable`。
    * 线程安全：`Hashtable` 线程安全（方法同步），`HashMap` 非线程安全
    * `null` 值处理：`HashMap` 允许 `null` 键和 `null` 值；`Hashtable` 不允许 `null` 键或 `null` 值，会抛 `NullPointerException`
    * 性能：`HashMap` 性能更优（无同步开销）
    * 底层结构：`HashMap` 数组 + 链表 + 红黑树优化；`Hashtable` 仅数组 + 链表
2. 区别 `HashMap` 和 `LinkedHashMap`。
   * 有序性：`HashMap` 无序；`LinkedHashMap` 保持插入顺序（或访问顺序） 
   * 底层结构：HashMap 为数组 + 链表/红黑树；`LinkedHashMap` 在此基础上增加双向链表维护顺序
   * 内存占用：`LinkedHashMap` 每个节点多两个引用（前后指针），占用更多内存
   * 应用场景：`HashMap` 用于无需排序场景；`LinkedHashMap` 适用于需要保持插入顺序
3. HashMap的底层实现（① `new HashMap()` ② `put(key, value)`）。
   * JDK 1.7：数组 + 链表
   * JDK 1.8+：数组 + 链表/红黑树（链表长度≥8且数组长度≥64时转红黑树）
   * 哈希表结构，数组中的每个空位称为 **“桶（bucket）”**，每个桶可存储一个键值对。
     * 为解决 `hash` 冲突，java 中采用 **“链式地址”** 的方法， 数组为主干，将单个元素转换为链表，将键值对作为链表节点，将所有发生冲突的键值对都存储在同一链表中。
   * 关键参数：初始容量16，负载因子0.75，扩容阈值为容量×负载因子。存储的键值对数量达到或超过这个阈值，系统会将哈希表扩容至原先的 2 倍。（例如：初始容量为16，当 `HashMap` 中实际存储的键值对数量达到或超过这个阈值时（16*0.75=12），就会触发扩容。）
     * **负载因子（load factor）** 是哈希表的一个重要概念，其定义为哈希表的元素数量除以桶数量，用于衡量哈希冲突的严重程度，**也常作为哈希表扩容的触发条件**。