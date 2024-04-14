/*
 * 基本数据类型与 Sting 的运算
 *
 * 一、关于 String 类的理解
 * 1. String类，属于引用数据类型。
 * 2. String类型的变量，可以使用一对 "" 双引号的方式进行赋值。
 * 3. String声明的字符串内部，可以包含零个或多个字符。
 *
 * 二、String与基本数据类型变量间的运算
 * 1. 这里的基本数据类型包括 boolean 在内的8种。
 * 2. Sting 与基本数据类型变量间只能做连接运算，使用“+”表示。
 * 3. 运算的结果是 String 类型。
 */
public class StringTest {
  public static void main(String[] args) {
    String str1 = "Hello World!";

    System.out.println("str1");
    System.out.println(str1);

    String str2 = "";
    System.out.println(str2);

    String str3 = "a"; // char c1 = 'a'; 不可混为一谈

    int num1 = 10;
    boolean b1 = true;
    String str4 = "hello";
    String str5 = str4 + num1 + b1;
    // System.out.print(num1 + b1 + str4); 编译不通过
    System.out.println(str5); // "hellotrue10"

    String str6 = num1 + "";

    // 如何将 Sting 类型的变量转换为基本数据类型？
    int num2 = 10;
    String str7 = num2 + ""; // "10"，将 int 类型转化为 String 类型
    // int num3 = (int)str7; 编译不通过，不能通过强制类型转换，一个是基本类型，一个是引用类型（是一个类）
    // 如何实现？使用 Intege

    int num4 = Integer.parseInt(str7);
    System.out.println(num4 + 1);
  }
}
