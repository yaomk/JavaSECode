package com.atguigu02.project;

/**
 * ClassName: Customer
 * Description:
 * 客户类
 * @Author yao
 * @Create 2024/6/29 上午10:31
 * @Version 1.0
 */
public class Customer {
    //姓名
    private String name;
    //性别
    private char gender;
    //年龄
    private int age;
    //联系方式
    private String phone;
    //邮箱
    private String email;

    public Customer() {
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
