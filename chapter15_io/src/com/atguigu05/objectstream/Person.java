package com.atguigu05.objectstream;

import java.io.Serial;
import java.io.Serializable;

/**
 * ClassName: Person
 * Description:
 *
 * @Author yao
 * @Create 2026/10/25 11:25
 * @Version 1.0
 */
public class Person implements Serializable { // Serializable: 属于一个标识接口
    @Serial
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    // int id;
    Account account;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        // this.id = id;
    }

    public Person(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public int getId() {
    //     return id;
    // }
    //
    // public void setId(int id) {
    //     this.id = id;
    // }

    // @Override
    // public String toString() {
    //     return "Person{" +
    //             "name='" + name + '\'' +
    //             ", age=" + age +
    //             '}';
    // }

    // @Override
    // public String toString() {
    //     return "Person{" +
    //             "name='" + name + '\'' +
    //             ", age=" + age +
    //             ", id=" + id +
    //             '}';
    // }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account=" + account +
                '}';
    }
}

class Account implements Serializable {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}