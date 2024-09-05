package com.atguigu10._enum.exer1;

// jdk5.0 使用 enum 关键字定义枚举类的方式定义单例模式
enum Bank2 {
    CPB
}

enum GirlFriend {
    //public static final GirFriend TOM = new GirlFriend(18);
    TOM(18);
    private final int age;

    private GirlFriend(int age) {
        this.age = age;
    }
}

/**
 * ClassName: BankTest1
 * Description:
 *
 * @Author yao
 * @Create 2024/9/5 11:59
 * @Version 1.0
 */
public class BankTest1 {
    public static void main(String[] args) {
        System.out.println(GirlFriend.TOM);
    }
}

// jdk5.0之前的使用枚举类定义单例模式
class Bank1 {
    public static final Bank1 instance = new Bank1();

    private Bank1() {
    }
}