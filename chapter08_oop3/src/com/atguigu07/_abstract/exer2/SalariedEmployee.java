package com.atguigu07._abstract.exer2;

/**
 * ClassName: SalariedEmployee
 * Description:
 * 该类包括：private成员变量monthlySalary
 * 提供必要的构造器
 * 实现父类抽象方法 earnings(),该方法返回monthlySalary值
 * toString() 方法输出员工类型信息和员工的name，number，birthday
 *
 * @Author yao
 * @Create 2024/9/1 11:49
 * @Version 1.0
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + this.getName() + "'" + ", " +
                "number=" + this.getNumber() + ", " +
                "birthday=" + this.getBirthday().toDateString() + ", " +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
