package com.atguigu08.constructor.exer2;

/**
 * ClassName: Account
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 下午3:47
 * @Version 1.0
 */
public class Account {
    private int id; // 账号
    private double balance; //余额
    private double annualInterestRate; // 年利率

    public Account(int a, double b, double c) {
        id = a;
        balance = b;
        annualInterestRate = c;
    }
    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }
    public void setBalance(double b) {
        balance = b;
    }
    public double getBalance() {
        return balance;
    }
    public void setAnnualInterestRate(double c) {
        annualInterestRate = c;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    // 取钱
    public void withdraw(double amount) {
        if(amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("成功取出：" + amount);
        } else {
            System.out.println("取款失败");
        }
    }
    // 存钱
    public void deposit(double amount) {
        if(amount > 0) {
            System.out.println("成功存入：" + amount);
        }
    }
}




