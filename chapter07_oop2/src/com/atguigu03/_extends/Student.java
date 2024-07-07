package com.atguigu03._extends;

/**
 * ClassName: Student
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午9:26
 * @Version 1.0
 */
public class Student extends Person {
    //String name;
    //int age;

    String school;

    //public void eat() {
    //    System.out.println("人吃饭");
    //}
    //public void sleep() {
    //    System.out.println("人睡觉");
    //}
    public void study() {
        System.out.println("人学习");
    }
    public void show1() {
        //System.out.println("age: " + age);
        System.out.println("age: " + getAge());
    }
}
