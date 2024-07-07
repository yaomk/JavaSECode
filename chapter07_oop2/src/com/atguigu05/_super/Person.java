package com.atguigu05._super;

/**
 * ClassName: Person
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午9:25
 * @Version 1.0
 */
public class Person {
    String name;
    private int age;
    String id = "Person 类中属性id";

    public Person() {
        System.out.println("Person()...");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
    }
    public void sleep() {
        System.out.println("人睡觉");
    }
    public void showAge() {
        System.out.println("age: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
