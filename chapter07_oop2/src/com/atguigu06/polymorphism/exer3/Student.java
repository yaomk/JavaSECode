package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Student
 * Description:
 *
 * @Author yao
 * @Create 2024/7/28 上午11:48
 * @Version 1.0
 */
public class Student extends Person {
    protected String school = "pku";

    @Override
    public String getInfo() {
        return "Name: " + name + "\nage: " + age + "\nschool: " + school;
    }
}
