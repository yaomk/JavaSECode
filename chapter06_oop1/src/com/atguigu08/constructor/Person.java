package com.atguigu08.constructor;

/**
 * ClassName: Person
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 下午3:11
 * @Version 1.0
 */
public class Person {
    String name;
    int age;

    //构造器
    public Person() {
        System.out.println("person()...");
    }
    public Person(int a) {
        age = a;
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep(int hour) {
        System.out.println("每天睡觉"+hour+"小时");
    }
}
