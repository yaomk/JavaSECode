package com.atguigu05._super.exer1;

/**
 * ClassName: ManKind
 * Description:
 * 定义一个ManKind类，包括
 * 成员变量int sex和int salary;
 * 方法 void manOrWoman():根据sex的值显示“man"(sex==1)或者"woman"(sex==0);
 * 方法 void employed():根据salary的值显示"no job"(salary==0)或者”job"(salary!=0)。
 * @Author yao
 * @Create 2024/7/6 上午10:26
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void manOrWoman() {
        if(sex == 1) {
            System.out.println("man");
        } else if(sex == 0) {
            System.out.println("woman");
        }
    }
    public void employed() {
        if(salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }
}
