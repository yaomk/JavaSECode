import java.util.Scanner;

public class StringClassTest {
  public static void main(String[] args) {
    String str1 = "是是是";
    System.out.println();
    System.out.println(str1 == "是是是"); // true
    System.out.println(str1.equals("是是是")); // true
    System.out.println();

    Scanner scanIns = new Scanner(System.in);
    System.out.print("请输入：");
    String str2 = scanIns.next();
    System.out.println();
    System.out.println(str2 == "是是是"); // false
    System.out.println(str2.equals("是是是")); // true
    System.out.println();
    scanIns.close();

    String str3 = new String("aaa");
    String str4 = new String("aaa");
    System.out.println(str3);
    System.out.println(str4);
    System.out.println(str3 == str4); // false

    // str3 和 str4 都是使用 new 关键字创建的，这意味着它们是在堆内存中作为两个独立的对象创建的，尽管它们的内容相同（都是 "aaa"），但它们是不同的对象实例，因此 str3 == str4 的结果是 false。

  }
}
