/*
 * 测试运算符的使用1：算术运算符的使用
 * 1. + - / % ++ -- (正负号，加减乘除，取余，自增一，自减一)
 *
 * 测试运算符的使用2：赋值运算符的使用
 * 2. += -= *= /= %= ，不会改变变量本身的数据类型
 * 当‘=’两侧数据类型不一致，可以使用自动类型提升或者强制类型转换
 * 可以连续赋值
 *
 * 测试运算符的使用2：比较运算符的使用
 * 3. == != > < >= <= instanceof
 * > < >= <= 适用于除boolean类型之外的其他7种基本数据类型
 * == != 可以适用于引用数据类型
 */
public class AriTest {
  public static void main(String[] args) {
    // 除法：/
    int m1 = 12;
    int n1 = 5;
    int result = m1 / n1;
    System.out.println(result); // 打印结果为：2
    System.out.println(m1 / n1 * n1); // 打印结果为：10

    // 取模（或取余）：%
    System.out.println(m1 % n1); // 打印结果为：2
    // 开发中，经常用来判断某个数 num1 是否能够整除另外一个数 num2。num1 % num2 == 0.
    // 比如：判断 num1 是否偶数：num1 % 2 == 0

    // 结论：取模以后，结果与被模数的符号相同
    int i1 = -12;
    int j1 = 5;
    System.out.println(i1 % j1); // 打印结果为：-2

    int i2 = 12;
    int j2 = -5;
    System.out.println(i2 % j2); // 打印结果为：2

    int i3 = -12;
    int j3 = -5;
    System.out.println(i3 % j3); // 打印结果为：-2

    // 自增
    int a1 = 10;
    int b1 = a1++;
    int b2 = ++a1;
    System.out.println("a1=" + a1 + ",b1=" + b1 + ",b2=" + b2); // 打印结果为：a1=12,b1=10,b2=12

    // 练习1：
    int i = 10;
    // i++;
    ++i;
    System.out.println("i = " + i); // 打印结果为：11

    // 练习2：
    short s1 = 10;
    // s1 = s1 + 1; 编译不通过，short类型 + 常量，结果为 int 类型

    s1 = (short)(s1 + 1);
    s1++;

    // 结论：自增、自减运算，不会改变变量的数据类型！
    byte byte1 = 127;
    byte byte2 = 127;
    System.out.println(byte1++); // 打印结果为：127;
    System.out.println(++byte2); // 打印结果为：-128;

    // ********************************************************
    long long1 = 10; // 自动类型提升
    short short1 = (short)10.5; // 强制类型转换
    // 连续赋值
    int int1, int2;
    int1 = int2 = 10;
    System.out.println("int1 = " + int1 + " int2=" + int2);

    short1 += 10; //相当于 short1 = (short)(short1 + 10);
    System.out.println(short1);

    char char1 = 'a';
    System.out.println(char1 += 1);

    // 练习：
    int n = 10;
    n += n++ + ++n; // n = n + (n++) + (++n); 10 + (10) + (12)
    System.out.println(n); // 32

    // ********************************************************
    int cm1 = 10;
    int cm2 = 20;
    System.out.println(cm1 > cm2); // false
    System.out.println(cm1 == cm2); // false
    System.out.println(cm1 = cm2); // 20,把 cm2 赋值给 cm1，并打印 cm1

  }
}
