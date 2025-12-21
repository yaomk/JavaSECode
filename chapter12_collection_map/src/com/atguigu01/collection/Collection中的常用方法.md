# Collection 常用方法
> Collection 中定义了15个抽象方法。

## 常用方法

* `add(E obj)`: 添加元素对象到当前集合中。
* `addAll(Collection other)`: 添加 other 集合中的所有元素对象到当前集合中，即 this = this ∪ other。
* `int size()`: 获取当前集合中实际存储的元素的个数。
* `boolean isEmpty()`: 判断当前集合是否为空集合。
* `boolean contains(Object obj)`: 判断当前集合中是否存在一个与 obj 对象 equals 返回 true 的元素。
* `boolean containsAll(Collection coll)`: 判断 coll 集合中的元素是否在当前集合中都存在。即 coll 集合是否当前集合的子集。
* `boolean equals(Object obj)`: 判断当前集合与obj是否相等。
* `void clear()`: 清空集合元素。
* `boolean remove(Object obj)`: 从当前集合中删除第一个找到的与 obj 对象 equals 返回 true 的元素。
* `boolean removeAll(Collection coll)`: 从当前集合中删除所有与 coll 集合中相同的元素。即 this = this - this ∩ coll。
* `boolean retainAll(Collection coll)`: 从当前集合中删除两个集合中不同的元素，使得当前集合中仅保留与 coll 集合中的元素相同的元素，即当前元素中仅保留两个集合的交集。即this = this ∩ coll。
* `Object[] toArray()`: 返回包含当前集合中所有元素的数组。
* `toArray(T[] a)`: 返回包含当前集合中所有元素的数组。
* `int hashCode()`: 获取集合对象的哈希值。
* `iterator()`: 返回迭代器对象，用于遍历集合。

## 集合与数组的相互转换
* 集合 -> 数组：`toArray()`
* 数组 -> 集合：`Arrays.asList(T... a)`

### 向 `Collection` 中添加元素的要求
* **要求元素所属的类一定要重写 `equals()`方法！**
* 原因：
  * 因为 `Collection` 中的相关方法（例如：`contains()`, `remove()`）在使用时，要调用所在类的 `equals()`。