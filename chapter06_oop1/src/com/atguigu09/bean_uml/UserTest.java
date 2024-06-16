package com.atguigu09.bean_uml;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/16 上午10:33
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.age);
        User u2 = new User(2);
        System.out.println(u2.age);
    }
}

class User {
    // 属性(或实例变量)
    String name;
    int age = 10;
    public User() {}
    public User(int a) {
        age = a;
    }
}