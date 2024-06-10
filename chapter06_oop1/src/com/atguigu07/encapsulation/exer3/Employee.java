package com.atguigu07.encapsulation.exer3;

/**
 * ClassName: Employee
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 上午11:02
 * @Version 1.0
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return this.gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getInfo() {
        return name + "\t" + gender + "\t" + age + "\t" + phoneNumber;
    }
}
