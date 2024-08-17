package com.atguigu07.object.toString;

import java.io.File;
import java.util.Date;

/**
 * ClassName: ToStringTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/17 09:52
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("tom", 12);
        System.out.println(u1.toString()); //com.atguigu07.object.toString.User@3b07d329
        System.out.println(u1); //com.atguigu07.object.toString.User@3b07d329

        String str = new String("hello world!");
        System.out.println(str.toString());

        File file = new File("D:\\test.txt");
        System.out.println(file);

        Date date = new Date();
        System.out.println(date);
    }
}

class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    //手动实现toString()
    //@Override
    //public String toString() {
    //    return "User{name = " + name + ", age = " + age + "}";
    //}

    //idea生成
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
