package com.atguigu07._abstract;

/**
 * ClassName: Student
 * Description:
 *
 * @Author yao
 * @Create 2024/9/1 10:01
 * @Version 1.0
 */
public class Student extends Person {
    String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public Student() {
    }

    @Override
    public void eat() {
        System.out.println("学生应该吃有营养的食物");
    }

    @Override
    public void sleep() {
        System.out.println("学生应该保证充足的睡眠");
    }

    @Override
    public void breath() {
        System.out.println("学生呼吸新鲜空气");
    }
}
