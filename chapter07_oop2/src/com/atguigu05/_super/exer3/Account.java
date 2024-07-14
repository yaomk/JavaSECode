package com.atguigu05._super.exer3;

/**
 * ClassName: Account
 * Description:
 *
 * @Author yao
 * @Create 2024/7/14 上午11:04
 * @Version 1.0
 */
public class Account {
    private int id; // 账号id
    private double balance; // 余额
    private double annualInterestRate; // 年利率

    //空参构造器
    //public Account() {}

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    //public void setBalance(double balance) {
    //    this.balance = balance;
    //}

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获取月利率
     * @return 月利率
     */
    public double getMonthlyInterest() {
        return this.annualInterestRate / 12;
    }

    //取钱
    public void withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("余额不足！");
        }
    }

    //存钱
    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
    }
}
