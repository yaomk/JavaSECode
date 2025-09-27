# String 类的理解（以 JDK 8 为例说明）

## 类的声明

```java
public final class String implements java.io.Serializable, Comparable<String>, CharSequence {
}
```

* `final:String`: 是不可被继承的
* `java.io.Serializable`: 可序列化的接口。凡是实现此接口的类的对象就可以通过网络或本地流进行数据的传输。
* `Compareable`: 凡是实现此接口的类，其对象都可以比较大小。

## 内部声明的属性

jdk8中：

`private final char value[]`: 存储字符串数据的容器

* `final`：指明此 value 数据一旦初始化，其地址就不可变。

jdk9开始：为了节省内存空间，做了优化

`private final byte value[]`: 存储字符串数据的容器

### 字符串常量的存储位置

* 字符串常量都存储在字符串常量池（StringTable）中
* 字符串常量池不允许存放两个相同的字符串常量
* 字符串常量池，在不同的jdk版本中，存放位置不同：
    * jdk7之前：字符串常量池存放在方法区
    * jdk7及之后：字符串常量池存放在堆空间

### String 的不可变性的理解

* 当对字符串变量重新赋值时，需要重新指定一个字符串常量的位置进行赋值，不能在原有的位置修改。
* 当对现有的字符串进行拼接操作时，需要重新开辟空间保存拼接以后的字符串，不能在原有的位置修改。
* 当调用字符串的 `replace()` 替换现有的某个字符串时，需要重新开辟空间保存修改以后的字符串，不能在原有的位置修改。

### String 实例化的两种方式

* `String s1 = "hello"`;
* `String s2 = new String("hello")`;

### 【面试题】

`String s1 = new String("hello");`在内存中创建了几个对象？

* 两个！
* 一个是堆空间中 new 的对象。另一个是在字符串常量池中生成的字面量。

### String的连接操作：`+`

* 情况1：`常量 + 常量`：结果仍然存储在字符串常量池中，返回此字面量的地址。注：此时的常量可能是字面量，或是 **final 修饰的常量**。
* 情况2：`常量 + 变量` 或 `变量 + 变量`：都会通过 new 的方式创建一个新的字符串，返回堆空间此字符串对象的地址。
* 情况3：调用字符串的 `intern()`：返回的都是字符串常量池中字面量的地址。
* 情况4：`concat()`：源码得知 concat 方法返回一个通过 new 的方式创建的新的字符串，返回堆空间中此字符串对象的地址。

### String 的构造器和常用方法

#### 构造器

* `public String()`: 初始化新创建的 String 对象，已使其表示空字符序列。
* `public String(String original)`: 初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列，换句话说：新创建的字符串是该参数字符串的副本。
* `public String(char[] value)`: 通过当前参数中的字符数组来构造新的 String。
* `public String(char[], int offset, int count)`: 通过字符数据的一部分来构造新的 String。
* `public String(byte[] bytes)`: 通过使用平台默认字符集解码当前参数中的字节数组来构造新的 String。
* `public String(byte[****] bytes, String charsetName)`: 通过使用指定的字符集解码当前参数中的字节数组来构造新的 String。

#### 常用方法

* `boolean isEmpty()`: 字符串是否为空
* `int length()`: 返回字符串的长度
* `String concat()`: 拼接
* `boolean equals(Object obj)`: 比较字符串是否相等，区分大小写
* `boolean equalsIgnoreCase(Object obj)`: 比较字符串是否相等，不区分大小写
* `int compareTo(String other)`: 比较字符串大小，区分大小写，按照 Unicode 编码值比较大小
* `int compareToIgnoreCase(String other)`: 比较字符串大小，不区分大小写
* `String toLowerCase()`: 将字符串中大写字母转为小写字母
* `String toUpperCase()`: 将字符串中小写字母转为大写字母
* `String trim()`: 去掉字符串前后的空白字符
* `public String intern()`: 结果在常量池中共享
* `boolean contains(CharSequence s)`: 是否包含 s
* `int indexOf(xx)`: 从前往后查找当前字符串中的xx，返回首次出现时的索引，没有则返回-1。
* `int indexOf(String str, int fromIndex)`: 返回指定子字符串在此字符串中首次出现处的索引，从指定的索引开始。
* `int lastIndexOf()`: 从后往前查找当前字符串中xx，返回最后一次出现的索引，没有则返回-1。
* `int lastIndexOf(String str, int fromIndex)`: 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。

####  字符串截取相关

* `String substring(int beginIndex)`: 返回一个新的字符串，它是此字符串从 beginIndex 处开始截取到最后的一个子字符串。
* `String substring(int beginIndex, int endIndex)`: 返回一个新的字符串，它是此字符串从 beginIndex 开始截取到
  endIndex（不包含）的一个子字符串。（左闭右开）

#### 和字符、字符数组相关

* `char charAt(index)`: 返回 index 位置的字符。
* `char[] toCharArray()`: 将此字符串转为一个新的字符串数组。
* `static String valueOf(char[] data)`: 返回指定数组中表示该字符序列的 String。
* `static String valueOf(char[] data, int offset, int count)`: 返回指定数组中表示该字符序列的 String。
* `static String copyValueOf(char[] data)`: 返回指定数组中表示该字符序列的 String。
* `static String copyValueOf(char[] data, int offset, int count)`: 返回指定数组中表示该字符序列的 String。
* `boolean StartsWith(xx)`: 测试此字符串是否以指定的前缀开始。
* `boolean StartsWith(String prefix, int toffset)`: 测试此字符串从指定索引位置开始的子字符串是否以指定的前缀开始。
* `boolean endsWith(xx)`: 测试此字符串是否以指定的后缀结束。

#### 字符串替换相关

* `String replace(char oldChar, char newChar)`: 返回一个新的字符串，它是通过 newChar 替换此字符串中出现的所有 oldChar 得到的。不支持正则。
* `String replace(charSequence target, CharSequence replacement)`: 使用指定的字面值替换序列此字符串所有匹配字面值目标序列的子字符串。
* `String replaceAll(String regex, String replacement)`: 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
* `String replaceFirst(String regex, String replacement)`: 使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
