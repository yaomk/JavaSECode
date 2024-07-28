package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Woman
 * Description:
 *
 * @Author yao
 * @Create 2024/7/28 下午12:04
 * @Version 1.0
 */
public class Woman extends Person {
    @Override
    public void eat() {
        System.out.println("女人饭量少");
    }

    @Override
    public void toilet() {
        System.out.println("女人去女厕所");
    }

    public void makeup() {
        System.out.println("女人厕所补妆");
    }
}
