package com.atguigu06.polymorphism;

/**
 * ClassName: Woman
 * Description:
 *
 * @Author yao
 * @Create 2024/7/21 上午10:27
 * @Version 1.0
 */
public class Woman extends Person {
    boolean isBeauty;

    @Override
    public void eat() {
        System.out.println("女人应该少吃，减肥");
    }

    @Override
    public void walk() {
        System.out.println("女人窈窕的走路");
    }

    public void goShopping() {
        System.out.println("女人喜欢逛街。。。");
    }
}
