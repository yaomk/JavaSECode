package com.atguigu08._interface;

interface Flyable { // 接口
    // 全局常量
    public static final int MIN_SPEED = 0;
    // 可以省略 public static final
    int MAX_SPEED = 7900;

    // 方法 可以省略 public abstract
    public abstract void fly();
}

interface Attackable {
    void attack();
}

interface AA {
    void method1();
}

interface BB {
    void method2();
}

interface CC extends AA, BB { // 接口可以多继承
    void method3();
}

/**
 * ClassName: InterfaceTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/2 10:33
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEED);

        //Flyable.MAX_SPEED = 7899; // 不能修改
        Bullet b1 = new Bullet();
        b1.fly();
        b1.attack();

        Flyable f1 = new Bullet(); // 多态性
        f1.fly();

    }
}

abstract class Plane implements Flyable {

}

class Bullet implements Flyable, Attackable {
    @Override
    public void fly() {
        System.out.println("让子弹飞一会");
    }

    @Override
    public void attack() {
        System.out.println("子弹可以击穿木板");
    }
}

class DD implements CC {
    @Override
    public void method3() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}