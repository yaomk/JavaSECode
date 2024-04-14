/**
 * 如何从键盘获取不同类型（基本类型、String类型）的变量：使用 Scanner 类
 *
 * 1、使用Scanner获取不同类型数据的步骤：
 * 步骤1：导包 import java.util.Scanner;
 * 步骤2：提供（或创建）一个 Scanner 类的实例
 * 步骤3：调用 Scanner 类中的方法，获取指定类型的变量（nextXxx()）
 * 步骤4：关闭资源，调用 Scanner 类的 close()
 */
/**
 * java.lang.Sting; 不需要导包，lang包：Java 编程语言进行程序设计的基础类。
 */
/*
 * 2.案例:小明注册某交友网站，要求录入个人相关信息。如下:
 * 请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。
 */
// 步骤1：导包
import java.util.Scanner;
public class ScannerTest {
  public static void main(String[] args) {
    // 步骤2：创建一个 Scanner 类的实例
    Scanner scanInstance = new Scanner(System.in);

    System.out.println("欢迎来到某某交友网站，请录入信息");

    System.out.print("请输入你的网名：");
    // 步骤3：调用 Scanner 类中的方法，获取指定类型的变量
    String name = scanInstance.next();

    System.out.print("请输入你的年龄：");
    int age = scanInstance.nextInt();

    System.out.print("请输入你的体重(kg)：");
    double weight = scanInstance.nextDouble();

    System.out.print("是否单身（是：true，否：false）？");
    boolean isSigle = scanInstance.nextBoolean();

    System.out.print("请输入你的性别(男/女)：");
    // Scanner 类中没有提供获取 char 类型的方法，需要使用 charAt(0)，获取指定字符串中的第一个字符
    char gender = scanInstance.next().charAt(0);

    System.out.print("是否很帅？(是/否)");
    String isHandsome = scanInstance.next();

    // isHandsome变量值为“是”时，因为 String 是一个类，isHandsome == "是" 该条件语句为 false
    // 需要比较字符串是否“相等”，可以使用 String的equals()方法
    if(isHandsome == "是") {
      System.out.println("你好帅啊");
    } else{
      boolean result = isHandsome.equals("是");
      System.out.println("isHandsome.equals(\"是\"); 的结果为：" + result);
      System.out.println("你好衰啊");
    }

    System.out.println("注册成功！");
    System.out.println("您的信息为：");
    System.out.println("网名：" + name +"，年龄："+ age + "，体重：" + weight + "kg，是否单身：" + isSigle + "，性别：" + gender);

    // garbage colletor(gc:垃圾回收器)
    // 步骤4：关闭资源，避免内存泄漏。
    scanInstance.close();
  }
}
