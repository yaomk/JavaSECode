package com.atguigu03.threadsafe.exer2;

/**
 * ClassName: AccountTest
 * Description:
 * 有两个储户分别向同一个账户存3000块，每次存1000，存三次。每次存完后打印账户余额。
 *
 * @Author yao
 * @Create 2024/10/15 12:09
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account();

        Customer cus1 = new Customer(acct, "甲");
        Customer cus2 = new Customer(acct, "乙");

        cus1.start();
        cus2.start();
    }
}

class Account { // 账户
    private double balance; // 余额

    public synchronized void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "存钱：" + amt + "，余额为：" + balance);
    }
}

class Customer extends Thread {
    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    public Customer(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.deposit(1000);
        }
    }
}
