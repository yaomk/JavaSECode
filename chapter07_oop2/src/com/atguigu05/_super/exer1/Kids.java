package com.atguigu05._super.exer1;

/**
 * ClassName: Kids
 * Description:
 * 定义类Kids继承ManKind，并包括
 *   成员变量int years0ld;
 *   方法printAge()打印years0ld的值。
 *   employed()方法重写
 * @Author yao
 * @Create 2024/7/6 上午10:31
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {}

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    public Kids(int sex, int salary, int yearsOld) {
        this.yearsOld = yearsOld;
        setSex(sex);
        setSalary(salary);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println(yearsOld);
    }

    public void employed() {
        super.employed();
        System.out.println("Kids should study and no job.");
    }
}
