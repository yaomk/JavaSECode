/*
 * 测试基本数据类型变量间的运算规则。
 * 1. 这里提到可以做运算的基本数据类型有7种，不包含boolean类型。
 * 2. 运算规则包括：
 *    ① 自动类型提升
 *    ② 强制类型转换
 *
 * 3. 此 VariableTest3.java 用来测试自动类型提升
 *
 * 规则：当容量小的变量与容量大的变量做运算时，结果自动转换为容量大的数据类型。
 *
 *      byte/short/char -> int -> long -> float -> double
 *      特别的：byte、short、char 类型的变量之间做运算，结果为 int 类型。
 *
 * 说明：此时的容量小或大，并非指占用的内存空间的大小，而是指表示数据的范围的大小。
 *      long（8字节）、float（4字节）
 *
 */

public class VariableTest3 {
  public static void main(String[] args) {
    int i1 = 10;
    int i2 = i1;
    long l1 = i1;

    float f1 = l1;
    System.out.println(f1);

    byte b1 = 12;
    int i3 = b1 + i1;

    // 编译不通过：cannot convert from int to byte
    // byte b2 = b1 + i1;
    // ****************************************************
    // 特殊的情况1：byte、short 之间做运算，结果为 int。
    byte b3 = 12;
    short s1 = 10;
    // 编译不通过：cannot convert from int to short
    // short s2 = b3 + s1;
    i3 = b3 + s1;

    byte b4 = 10;
    // 编译不通过：cannot convert from int to byte
    // byte b5 = b4 + b3;

    // 特殊情况2：char
    char c1 = 'a'; // ASCII 为 97
    // 编译不通过：cannot convert from int to char
    // char c2 = c1 + b3;
    int i4 = c1 + b3;
    char c2 = 'b'; // ASCII 为 98
    int i5 = c1 + c2;
    System.out.println(i5); // 195

    // ****************************************************
    // 练习1：
    long long1 = 123L;
    long long2 = 123; // 理解为：自动类型提升
    // long long3 = 123123123123; // 123123123123理解为 int 类型，因为超出了 int 范围，所以报错。
    long long4 = 123123123123L; // 此时的 123123123123L 就是使用了 8字节存储的 long 类型的值。

    // 练习2：
    float float1 = 12.3F;
    // float float2 = 12.3; // 不满足自动类型提升的规则（double -> float）。所以报错。

    // 练习3：
    // 规定1：整形常量，规定是 int类型。
    byte byte1 = 10;
    // byte byte2 = byte1 + 1; // 编译不通过，数字 1，整型常量，int类型。
    int int1 = byte1 + 1;
    // 规定2：浮点型常量，规定是 double类型。
    double double1 = byte1 + 12.3;
  }
}
