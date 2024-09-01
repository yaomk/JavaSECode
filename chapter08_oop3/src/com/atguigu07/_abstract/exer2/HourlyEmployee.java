package com.atguigu07._abstract.exer2;

/**
 * ClassName: HourlyEmployee
 * Description:
 * 参照 SalariedEmployee 类定义 HourlyEmployee 类，实现按小时计算工资的员工处理
 * private成员变量wage和hour
 * 提供必要的构造器
 * 实现父类抽象方法earnings()，该方法返回wage*hour
 * toString() 方法输出员工类型信息及员工name，number，birthday
 *
 * @Author yao
 * @Create 2024/9/1 11:59
 * @Version 1.0
 */
public class HourlyEmployee extends Employee {
    private double wage; // 单位小时的工资
    private int hour; // 月工作的小时数

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name='" + getName() + "', " +
                "number=" + getNumber() + ", " +
                "birthday=" + getBirthday().toDateString() + ", " +
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}
