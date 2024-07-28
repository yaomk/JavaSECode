package com.atguigu06.polymorphism;

/**
 * ClassName: Man
 * Description:
 *
 * @Author yao
 * @Create 2024/7/21 上午10:26
 * @Version 1.0
 */
public class Man extends Person {
    boolean isSmoking;
    int id = 1002;

    @Override
    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk() {
        System.out.println("男人笔挺的走路");
    }

    public void work() {
        System.out.println("男人要工作");
    }
}
