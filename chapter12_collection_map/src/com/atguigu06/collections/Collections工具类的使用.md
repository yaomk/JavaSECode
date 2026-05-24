## Collections 概述

`Collections` 是一个操作 `Set`、`List` 和 `Map` 等集合的工具类。

## 常用方法

`Collections` 中提供了一系列静态的方法对集合元素进行排序、查询和修改等操作，还提供了对集合对象设置不可变、对集合对象实现同步控制等方法（均为
`static` 方法）：

### 排序操作：

* `reverse(List)`: 反转 `List` 中元素的顺序
* `shuffle(List)`: 对 `List` 集合元素进行随机排序
* `sort(List)`: 根据元素的自然排序对指定 `List` 集合元素按升序排序
* `sort(List, Comparator)`: 根据指定的 `Comparator` 产生的顺序对 List 集合元素进行排序
* `swap(List, int, int)`: 将指定 `List` 集合中的 `i` 处元素和 `j` 处元素进行交换

### 查找

* `Object max(Collection)`: 根据元素的自然顺序，返回给定集合中的最大元素（返回排序后最右边的元素）
* `Object max(Collection, Comparator)`: 根据指定的 `Comparator` 顺序，返回给定集合中的最大元素
* `Object min(Collection)`: 根据元素自然顺序，返回给定集合中的最小元素（返回排序后最左边的元素）
* `Object min(Collection, Comparator)`: 根据指定的 `Comparator` 顺序，返回给定集合中的最小元素
* `int binarySearch(List l, T key)`: 在 `List` 集合中查找某个元素的下表，但是 `List` 的元素必须是 `T` 或 `T 
  的子类对象`，而且必须是可比较大小的，即支持自然排序的。而且集合也事先必须是有序的，否则结果不确定。
* `int binarySearch(List l, T key, Comparator c)`: 在 `List` 集合中查找某个元素的下标，但是 `List` 的元素必须是 `T` 或
  `T 的子类对象`，而且集合也事先必须是按照
  `Comparator c` 比较器规则进行排序过的，否则结果不确定
* `int frequency(Collection c, Object o)`: 返回指定集合中指定元素的出现次数

### 复制、替换

* `void copy(List dest, List src)`: 将 `src` 中的内容复制到 `dest` 中
* `boolean replaceAll(List l, Object oldVal, Object newVal)`: 使用新值替换 `List` 对象的所有旧值
* 提供了多个 `unModifiableXxx()` 方法，该方法返回指定 `Xxx` 的不可修改的试图。

### 添加

* `boolean addAll(Collection c, T... elements)`: 将所有指定元素添加到指定 `Collection` 中

### 同步

* `Collections` 类中提供了多个 `synchronizedXxx()` 方法：该方法可使指定集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题。

## 面试题

1. 区分 `Collection` 和 `Collections`
    * `Collection`：集合框架中用于存储一个一个元素的接口，又分为 `List` 和 `Set` 等子接口。
    * `Collections`：用于操作集合框架的一个工具类。此时的集合框架包括：`List`、`Set`、`Map`。