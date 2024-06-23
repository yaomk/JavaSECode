package com.atguigu01._this;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/23 上午11:50
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("Jack", 22);
        System.out.println(u1.name);
    }
}

class User {
    String name;
    int age;
    public User() {
        //模拟对象创建时，需要的初始化代码
        System.out.println("初始化执行的代码：public User()");
    }
    public User(String name) {
        //表示调用当前空参的构造器
        this();
        System.out.println("初始化执行的代码：public User(String name)");
        this.name = name;
    }
    public User(String name, int age) {
        //表示调用有一个形参的构造器
        this(name);
        System.out.println("初始化执行的代码：public User(String name, int age)");
        //this.name = name;
        this.age = age;
    }
    private void init() {
        //模拟对象创建时，需要的初始化代码
        System.out.println("初始化执行的代码");
    }
}