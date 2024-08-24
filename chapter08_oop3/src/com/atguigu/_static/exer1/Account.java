package com.atguigu._static.exer1;

/**
 * ClassName: Account
 * Description:
 * 编写一个类实现银行账户的概念，包含的属性有账号，密码，存款余额，利率，最小余额
 * 定义封装这些属性的方法，账号自动生成
 *
 * @Author yao
 * @Create 2024/8/24 10:01
 * @Version 1.0
 */
public class Account {
    private static double interestRate; // 利率
    private static double minBalance; // 最小余额
    private static int initId = 1000; // 用于自动生成id的基数
    private int id; // 账号
    private String password; // 密码
    private double balance; // 余额

    public Account() {
        this.id = initId++;
        this.password = "000000";
    }

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
