package com.atguigu04.block;

/**
 * ClassName: BlockTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/25 10:10
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.info);
        System.out.println(Person.info);

        Person p1 = new Person();
        Person p2 = new Person();
        p1.eat();
    }
}

class Person {
    static String info = "Chinese people";

    // 静态代码块
    static {
        System.out.println("静态代码块1");
        System.out.println("info = " + info);
        System.out.println();
    }

    static {
        System.out.println("静态代码块2");
        System.out.println();
    }

    String name;
    int age;

    // 非静态代码块
    {
        System.out.println("非静态代码块1");
        age = 1;
        System.out.println(this);
    }

    {
        System.out.println("非静态代码块2");
        System.out.println();
    }

    public Person() {
    }

    void eat() {
        System.out.println("eat() invoke");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}