package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Man
 * Description:
 *
 * @Author yao
 * @Create 2024/7/28 下午12:02
 * @Version 1.0
 */
public class Man extends Person {
    @Override
    public void eat() {
        System.out.println("男人饭量大");
    }

    @Override
    public void toilet() {
        System.out.println("男人去男厕所");
    }

    public void smoke() {
        System.out.println("男人厕所抽烟");
    }
}
