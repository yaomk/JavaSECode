package com.atguigu02.reference.data;

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
public class Employee {
    private String name;
    private int number;

    public Employee() {
        System.out.println("空参构造器");
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int number) {
        this.number = number;
    }

    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Employee(int number, String name) {
        this.name = name;
        this.number = number;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
