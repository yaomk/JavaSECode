package com.atguigu01._static;

/**
 * ClassName: ChineseTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/18 11:21
 * @Version 1.0
 */
public class ChineseTest {
    public static void main(String[] args) {
        ChineseTest.test();

        System.out.println(Chinese.nation);
        Chinese.show();

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 18;
        c1.nation = "China";
        System.out.println(c1);

        Chinese c2 = new Chinese();
        c2.name = "刘翔";
        c2.age = 18;
        System.out.println(c2);

        System.out.println(c1.nation);
        System.out.println(c2.nation);

        c2.nation = "CHN";
        System.out.println(c1.nation);
        System.out.println(c2.nation);

        c1.show();
        c1.method2();

        System.out.println();
        System.out.println(Chinese.getType());
    }

    public static void test() {
        System.out.println("static 方法");
    }
}

class Chinese {
    // 静态变量、类变量
    static String nation = "中国";
    private static int type = 1;
    // 非静态变量、实例变量
    String name;
    int age;

    public static int getType() {
        return Chinese.type;
    }

    public static void setType(int type) {
        Chinese.type = type;
    }

    public static void show() {
        System.out.println("I am chinese");
        System.out.println(nation);
        //this.love();
        Chinese.love(); // 静态方法内，不能使用this或super，前缀是当前类，可以省略。
    }

    public static void love() {
        System.out.println("I love China");
    }

    public void method2() {
        System.out.println("非静态方法");
        System.out.println(nation);
        show();
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}