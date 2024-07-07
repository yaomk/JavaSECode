package com.atguigu03._extends;

/**
 * ClassName: ExtendsTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午9:27
 * @Version 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "tome";
        //p1.age = 2;
        p1.eat();
        System.out.println(p1.toString());

        Student s1 = new Student();
        s1.name = "toy";
        s1.eat();
        s1.show1();

        System.out.println(s1.getClass());
        //获取s1所属类的父类
        System.out.println(s1.getClass().getSuperclass());
        //获取p1所属类的父类
        System.out.println(p1.getClass().getSuperclass());
    }
}
