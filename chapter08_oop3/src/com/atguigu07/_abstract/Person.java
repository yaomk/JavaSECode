package com.atguigu07._abstract;

/**
 * ClassName: Person
 * Description:
 *
 * @Author yao
 * @Create 2024/9/1 10:01
 * @Version 1.0
 */
public abstract class Person extends Creature { // 抽象方法
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public abstract void eat(); // 抽象方法，没有方法体，需要子类实现

    public void sleep() {
        System.out.println("睡觉");
    }

    ;
}
