package com.atguigu04.override;

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

    public void eat() {
        System.out.println("人吃饭");
    }
    public void sleep() {
        System.out.println("人睡觉");
    }
    public void show() {
        System.out.println("age: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
