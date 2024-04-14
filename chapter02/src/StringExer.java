public class StringExer {
  public static void main(String[] args) {
    /*
    * 要求填写自己的姓名，年龄，性别，体重，婚姻状况（已婚用true表示，未婚用false表示），联系方式等。
    */
    String name = "李逵";
    int age = 25;
    char gender = '男';
    double weight = 130.9;
    boolean isMerried = false;
    String phone = "13939093931";

    String info = "name= " + name + ", age= " + age + ", gender= " + gender + ", weight= " + weight + ", isMerried= " + isMerried + ", phone= " + phone;
    System.out.println(info);

    // 练习1：
    // String str1 = 4; 编译不通过，必须带双引号
    String str2 = 3.5f + "";
    System.out.println(str2); // 输出 3.5
    System.out.println(3+4+"hello!"); // 输出 7hello!
    System.out.println("hello!"+3+4); // 输出 hello!34
    System.out.println('a'+1+"hello!"); // 输出 98hello!
    System.out.println("hello!"+'a'+1); // 输出 hello!a1

    // 练习2：
    System.out.println("*    *"); // 输出：*    *
    System.out.println("*\t*"); // 输出：*  *
    System.out.println("*"+ "\t" + "*"); // 输出：*  *
    System.out.println('*' + "\t" + "*"); // 输出：*  *
    System.out.println('*' + '\t' + "*"); // 输出：51*
    System.out.println('*' + "\t" + '*'); // 输出：*  *
    System.out.println("*" + '\t' + '*'); // 输出：*  *
    System.out.println('*' + '\t' + '*'); // 输出：93
  }
}
