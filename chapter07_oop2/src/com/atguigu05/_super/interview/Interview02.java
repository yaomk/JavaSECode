package com.atguigu05._super.interview;

/**
 * ClassName: Interview02
 * Description:
 *
 * @Author yao
 * @Create 2024/7/14 上午11:50
 * @Version 1.0
 */
public class Interview02 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo()); // father
        //属性不会被重写，也就是 s 中存在两个info, 一个为 info，另一个为 Father.info
        //就近原则，getInfo() 没有被子类重写，所以打印出 father
        System.out.println(s.getInfo()); // father
        s.test(); // father father

        System.out.println();
        s.setInfo("大儿子");
        System.out.println(f.getInfo()); // 大儿子
        System.out.println(s.getInfo()); // 大儿子
        s.test(); // 大儿子 大儿子
    }
}

class Father {
    private String info = "father";

    public void setInfo(String info) {
        this.info = info;
    }
    public String getInfo() {
        return this.info;
    }
}

class Son extends Father {
    private final String info = "son";

    public void test() {
        System.out.print(this.getInfo());
        System.out.print("  ");
        System.out.println(super.getInfo());
    }

    //public String getInfo() {
    //    return this.info;
    //}
}