package com.atguigu04.example.exer1;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author yao
 * @Create 2024/5/25 上午11:02
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 12;
        p1.gender = '男';

        p1.study();

        System.out.println(p1);
        p1.addAge(2);
        System.out.println("age = " + p1.showAge()); // 14

        Person p2 = new Person();
        System.out.println(p2.age); // 0
        p2.addAge(10);
        System.out.println(p2.showAge()); // 10

        System.out.println(p1.showAge()); // 14
    }
}
