package com.atguigu06.polymorphism;

/**
 * ClassName: Person
 * Description:
 *
 * @Author yao
 * @Create 2024/7/21 上午10:25
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public void eat() {
        System.out.println("人吃饭");
    }

    public void walk() {
        System.out.println("人走路");
    }
}
