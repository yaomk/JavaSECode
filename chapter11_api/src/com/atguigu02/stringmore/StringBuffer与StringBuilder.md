## 1.三个类的对比
* String：不可变的字符串序列，底层使用 char[]（JDK8及以前），底层使用byte[]（JDK9及以后）
* StringBuffer：可变的字符序列；JDK1.0声明，线程安全的，效率低；底层使用 char[]（JDK8及以前），底层使用byte[]（JDK9及以后）
* StringBuilder：可变的字符序列；JDK5.0声明，线程不安全的，效率高；底层使用 char[]（JDK8及以前），底层使用byte[]（JDK9及以后）

## 2.StringBuffer/StringBuilder的可变性分析（源码分析）

回顾：

`String s1 = new String(); // char[] value = new char[0];`

`String s2 = new String("abc"); // char[] value = new char[]{'a','b','c'};`

* 针对StringBuilder来说：
  * 内部的属性有：
  * char[] value; // 存储字符序列
  * int count; // 实际存储的字符的个数
* `StringBuilder strB1 = new StringBuilder(); // char[] value = new char[16];`
* `StringBuilder strB2 = new StringBuilder("abc"); // char[] value = new char[16 + "abc".length()]`
* 一旦 count 要超过 value.length 时，就会触发扩容操作，默认扩容为**原有容量的2倍+2**，并将原有 value 数组中的元素复制到新的数组中。

## 3.源码启示
* 如果开发中需要频繁的针对于字符串进行增删改等操作，建议使用 `StringBuffer/StringBuilder` 替换 `String`
* 如果开发中，不涉及到线程安全问题，建议使用 `StringBuilder` 替换 `StringBuffer`。因为 `StringBuilder` 效率高
* 如果开发中大体确定要操作的字符的个数，建议使用带 `int capacity` 参数的构造器。因为可以避免底层多次扩容操作，性能更高

## 4.StringBuffer/StringBuilder 常用方法

### 增
* append(xx)

### 删除
* delete(int start, int end)
* deleteCharAt(int index)

### 改
* replace(int start, int end, String str)
* setCharAt(int index, char c)

### 查
* charAt(int index)

### 插入
* insert(int index, xx)

### 长度
* length()

### 效率对比
* 效率从高到底排列：StringBuilder > StringBuffer > String