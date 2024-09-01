package com.atguigu07._abstract;

/**
 * ClassName: Worker
 * Description:
 *
 * @Author yao
 * @Create 2024/9/1 10:37
 * @Version 1.0
 */
public abstract class Worker extends Person {
    @Override
    public void eat() {
        System.out.println("工人吃饭");
    }
}
