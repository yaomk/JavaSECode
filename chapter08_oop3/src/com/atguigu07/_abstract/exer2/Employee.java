package com.atguigu07._abstract.exer2;

/**
 * ClassName: Employee
 * Description:
 * private成员变量name，number，birthday，其中birthday为MyDate对象
 * 提供必要的构造器
 * abstract 方法 earnings(), 返回工资数额
 * toString() 方法输出对象name,birthday和number
 *
 * @Author yao
 * @Create 2024/9/1 11:38
 * @Version 1.0
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }

    // 返回工资数额
    public abstract double earnings();
}
