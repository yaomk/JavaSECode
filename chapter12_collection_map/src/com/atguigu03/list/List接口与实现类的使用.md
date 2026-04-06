### List 接口中存储数据的特点
* 用于存储有序的、可以重复的数据。
* 使用 List 提到数组，“动态”数组。

### List 中常用的方法：
* Collection 中声明的15个方法。
* 因为 List 是有序的，进而就有索引，进而就会增加一些针对索引操作的方法。
  * 插入元素：
    * `void add(int index, Object ele)`: 在index位置插入ele元素
    * `boolean addAll(int index, Collection eles)`: 从 index 位置开始将 eles 中的所有元素添加进来
  * 获取元素
    * `Object get(int index)`: 获取指定 index 位置的元素
    * `List subList(int fromIndex, int toIndex)`: 返回从 fromIndex 到 toIndex 位置的子集合
  * 获取元素索引
    * `int indexOf(Object obj)`: 返回 obj 在集合中首次出现的位置
    * `int lastIndexOf(Object obj)`: 返回 obj 在当前集合中末次出现的位置
  * 删除和替换元素
    * `Object remove(int index)`: 移除指定 index 位置的元素，并返回此元素
    * `Object set(int index, Object ele)`: 设置指定 index 位置的元素为 ele

### List 方法总结
* 增
  * `add(Object obj)`
  * `addAll(Collection coll)`
* 删
  * `remove(Object obj)`
  * `remove(int index)`
* 改
  * `set(int index, Object ele)`
* 查
  * `get(int index)`
* 插
  * `add(int index, Object ele)`
  * `addAll(int index, Collection eles)`
* 遍历
  * `iterator()`: 使用迭代器进行遍历
  * 增强for循环
  * 一般的for循环

### List 及其实现类特点
`java.util.Collection`: 存储一个一个的数据
* 子接口：`List` 存储有序的、可重复的数据（“动态”数组）
  * `ArrayList`：`List` 的主要实现类：线程不安全的、效率高；底层使用的是`Object[]` 数组存储
    * 在添加数据，查找数据时，效率较高；在插入、删除数据时，效率较低。
  * `LinkedList`：底层使用双向链表的方式进行存储
    * 在添加数据，查找数据时，效率较低；在插入、删除数据时，效率较高。在对集合中的数据进行频繁的删除、插入操作时，建议使用此类。
  * `Vector`：`List` 的古老实现类（已经很少使用）：线程安全的、效率低；底层使用的是`Object[]` 数组存储

#### 面试题
##### `ArrayList`，`Vector` 的区别？
1. 线程安全性
   * `Vector` 的方法（如 add()、get()、remove() 等）默认是同步的，因此是线程安全的，但会带来性能开销。
   * `ArrayList` 的方法不是同步的，因此在单线程环境下性能更好；若需在多线程下使用，可手动同步：`List list = Collections.synchronizedList(new ArrayList<>());`
2. 性能
   * `ArrayList` 性能更高：因为无需获取锁，方法调用开销小。
   * `Vector` 性能较低：每个方法调用都涉及同步锁，即使不需要线程安全也会带来额外开销。
   * > 在现代 Java 中，除非有明确的线程安全需求，否则优先使用 ArrayList。
3. 容量增长机制
   * `ArrayList` 容量增长步长固定比例 1.5 倍
   * 可指定增长步长；若未指定，则新容量 = 原容量 × 2

##### `ArrayList`，`LinkedList` 的区别？
1. 底层数据结构
   * `ArrayList` 数据结构为：动态数组（可自动扩容的数组），实现接口：`List`, `RandomAccess`, `Cloneable`, `Serializable`
   * `LinkedList` 数据结构为：双向链表（维护头尾节点，每个节点有 prev/next 引用），实现接口：`List`, `Deque`, `Cloneable`, `Serializable`
2. 随机访问（按索引 get/set）性能
   * `ArrayList`：O(1)。内部通过数组下标直接定位，速度极快。
   * `LinkedList`：O(n)。需要从头部或尾部逐个遍历直到目标索引，效率低。
3. 插入与删除操作
   * 性能取决于位置和是否涉及索引定位。
   * | 操作     | ArrayList          | LinkedList               |
     |--------|--------------------|--------------------------|
     | 尾部添加   | O(1) 均摊（偶尔扩容 O(n)） | 	O(1)                    |
     | 头部添加   | O(n)（所有元素后移）       | O(1)                     |
     | 中间插入   | O(n)（移动元素）         | O(n)（需先遍历到索引，但插入本身 O(1)） |
     | 尾部删除   | O(1)               | O(1)                     |
     | 头部删除   | O(n)               | O(1)                     |
     | 中间删除   | O(n)               | O(n)（遍历定位）               |
     | 删除指定元素 | O(n)（查找+移动）        | O(n)（查找+断开链接）            |
    * > 关键点：`LinkedList` 在头尾操作上极快，但在中间位置增删时，由于需要遍历找到索引，整体复杂度依然是 O(n)。`ArrayList` 除了尾部操作外，中间/头部的增删都需要移动大量元素。
4. 内存占用
   * `ArrayList`：仅存储对象引用的数组（若容量为 `capacity`，实际大小 `size`）。额外内存开销小（一个数组对象 + 少量字段）。
   * `LinkedList`：每个元素都包装为一个 `Node` 对象，包含：元素值 + 前驱引用 + 后继引用。存储同样数量的元素，内存开销通常是 `ArrayList` 的数倍。
5. 迭代器遍历性能
   * `ArrayList`：通过普通 for 循环（索引）或增强 for 循环遍历都很快，因为连续内存利于 CPU 缓存。
   * `LinkedList`：避免使用普通 for 循环按索引遍历（每次 `get(i)` 都 O(n)，总复杂度 O(n²)）。应使用迭代器或增强 for 循环（通过节点链遍历，每个元素访问 O(1)）。
   * ```
     // 错误用法（极慢）
     for (int i = 0; i < list.size(); i++) {
     list.get(i);   // LinkedList 中 O(n) 每次
     }
     // 正确用法（快）
     for (Integer num : linkedList) {
     // 使用迭代器内部遍历
     }
     ```
