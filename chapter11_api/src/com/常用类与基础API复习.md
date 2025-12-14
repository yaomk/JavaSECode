# 随堂复习与企业真题（常用类与基础API）

## 随堂复习

### String 类
* String 类的声明：final 修饰，实现了 Comparable 接口
* String 的不可变性
* String 的两种定义方式：
  * 字面量的定义方式：`String s = "hello";`
  * new 的方式：`String s = new String("hello");`
* String 的内存解析：字符串常量池、堆内存的使用
* `String s = new String("hello");`在内存中创建的对象的个数。（两个，一个堆内存，一个字符串常量池中）
* String 的连接操作：`+`
  * 常量 + 常量、变量 + 常量、变量 + 变量、concat(String otherString)
  * `String intern()`: 返回字符串常量池中的对象
* 熟悉 String 的构造器、与其他结构之间的转换、常用方法
  * 编码和解码：
    * 编码：字符、字符串 -> 字节、字节数组。对应着解码集
    * 解码：字节、字节数组 -> 字符、字符串。对应着编码集
    * 规则：解码集必须使用当初编码时使用的编码集，只要不一致，就可能出现乱码！
* String 相关的算法问题。

### StringBuffer、StringBuilder 类
* 面试题：String、StringBuffer、StringBuilder 的区别
* 知道什么场景下使用 StringBuffer、StringBuilder

### jdk8 之前的日期、时间API
* System 的 currentTimeMillis()
* 两个 Date 的使用
* SimpleDateFormat 用于格式化、解析
* Calendar 日历类的使用

### jdk8 中更新的日期、时间API
* LocalDate、LocalTime、LocalDateTime -> 类似于 Calendar
* instant -> 类似于 Date
* DateTimeFormatter -> 类似于 SimpleDateFormat

### 比较器（重点）
* 自然排序涉及到 Comparable
  * compareTo(Object obj)
* 定制排序涉及到 Comparator
  * compare(Object obj1, Object obj2)

### 其他 Api（了解）
System类，Runtime类，Math类，BigInteger类，BigDecimal类，Random类

## 企业真题
1. 以下两种方式创建 String 对象有什么不同？
   ```java
   String str = new String("hello");
   String str = "hello";
   ```
2. `String s = new String("hello");` 创建了几个 String Object？
   两个。
3. `String a = "abc";`, `String b = "a" + "bc";` 问a==b？
4. String 中 “+” 怎么实现？
   ```text
   常量 + 常量：结果仍然存储在字符串常量池中，返回此字面量的地址。
   变量 + 常量、常量 + 变量：创建一个 StringBuilder 的实例，通过 append() 添加字符串，最后调用 toString() 返回一个字符串。（toString() 内部 new 一个 String 的实例）
   ```
5. Java中String是不是 final 的？
   * 类似的问题：String 是否可以被继承？
   * 是否可以继承 String？
6. String 为什么不可变，在内存中的具体形态？
   ```
   规定不可变。String：提供字符串常量池。
   ```
7. String 可以在 switch 中使用吗？
   可以，从 JDK7开始可以使用
8. String 中有哪些方法？
9. subString() 到底做了什么？
   ```text
   String str = "hello";
   String subStr = str.subString(1,3); // 底层是 new 的方式返回一个 subStr，实体内容是 "el"
   ```
10. java 中操作字符串有哪些类？他们之间有什么区别？
    * 类似的问题：String、StringBuffer、StringBuilder的区别？
   ```
   * String：不可变的字符串序列，底层使用 char[]（JDK8及以前），底层使用byte[]（JDK9及以后）
   * StringBuffer：可变的字符序列；JDK1.0声明，线程安全的，效率低；底层使用 char[]（JDK8及以前），底层使用byte[]（JDK9及以后）
   * StringBuilder：可变的字符序列；JDK5.0声明，线程不安全的，效率高；底层使用 char[]（JDK8及以前），底层使用byte[]（JDK9及以后）

   ```
11. String 的线程安全问题。
   线程是不安全的
12. StringBuilder 和 StringBuffer 的线程安全问题。
13. Comparable 和 Comparator 的区别和使用场景？
14. Comparable 接口 和 Comparator 接口实现比较。