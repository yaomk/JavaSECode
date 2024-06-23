package com.atguigu01._this.exer2;

/**
 * ClassName: Account
 * Description:
 *
 * @Author yao
 * @Create 2024/6/23 下午12:21
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    // 存款
    public void deposit(double amt) {
        if(amt > 0) {
            balance += amt;
            System.out.println("成功存入：" + amt);
        }
    }
    // 取款
    public void withdraw(double amt) {
        if(balance >= amt && amt > 0) {
            balance -= amt;
            System.out.println("成功取出：" + amt);
        } else {
            System.out.println("余额不足");
        }
    }
}
