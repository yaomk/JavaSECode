package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Person
 * Description:
 *
 * @Author yao
 * @Create 2024/7/28 上午11:46
 * @Version 1.0
 */
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\nage: " + age;
    }
}
