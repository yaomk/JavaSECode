package com.atguigu04.override;

/**
 * ClassName: Student
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午9:26
 * @Version 1.0
 */
public class Student extends Person {

    String school;

    public void study() {
        System.out.println("人学习");
    }
    public void show1() {
        //System.out.println("age: " + age);
        System.out.println("age: " + getAge());
    }

    @Override
    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }
}
