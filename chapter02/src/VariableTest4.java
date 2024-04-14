/*
 * 此 VariableTest.java 用来测试强制类型转换
 *
 * byte/short/char -> int -> long -> float -> double
 * 自动变量提升的逆运算
 *
 * 规则：
 * 1。如果需要将容量大的变量的类型转换为容量小的变量的类型，需要使用强制类型转换
 * 2. 强制类型转换需要使用强转符：()。在 () 内指明要转换为的数据类型。
 * 3. 强制类型转换过程中，可能导致精度损失。
 */
public class VariableTest4 {
  public static void main(String[] args) {
    double d1 = 12; // 自动类型提升
    // int i1 = d1; 编译失败

    int i2 = (int)d1;
    System.out.println(i2);

    long l1 = 123;
    // short s1 = l1; 编译失败
    short s2 = (short)l1;
    System.out.println(s2);

    // 练习：
    int i3 = 12;
    float f1 = i3; // 自动类型提升
    System.out.println(f1); // 12.0

    float f2 = (float)i3; // 编译可以通过，只不过可以省略，自动类型提升

    // 精度损失的例子1：
    double d2 = 12.9;
    int i4 = (int)d2;
    System.out.println(i4); // 结果为 12，相当于直接截断。

    // 精度损失的例子2：
    int i5 = 128;
    byte b1 = (byte)i5;
    System.out.println(b1); // 结果为 -128，128二进制为 1000 0000，int类型转byte，直接截断舍去高位，第一位为符号位，所以为负值

    // 实际开发中的强制类型转换
    short s3 = 128;
    method(s3); // 自动类型提升
    long l2 = 12L;
    method((int)l2);
  }

  public static void method(int num) {
    System.out.println("method fun arg num = " + num);
  }

  public static void exercise() {
    short s = 5;
    // s = s - 2; 不能通过编译，2 常量，类型为 int

    byte b = 3;
    // b = b + 4; 不能通过编译
    b = (byte)(b+ 4); // 可以通过编译

    char c = 'a';
    int i = 5;
    float d = 3.1415F;
    double result = c + i + d; // 可以通过编译

    byte b1 = 5;
    short s1 = 3;
    // short t = b1 + s1; 不能通过编译，结果是 int 类型
  }
}
