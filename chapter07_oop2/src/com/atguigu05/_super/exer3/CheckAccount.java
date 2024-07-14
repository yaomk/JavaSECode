package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccount
 * Description:
 *
 * @Author yao
 * @Create 2024/7/14 上午11:04
 * @Version 1.0
 */
public class CheckAccount extends Account {
    private double overdraft;

    //public CheckAccount(int id, double balance, double annualInterestRate) {
    //    super(id, balance, annualInterestRate);
    //}


    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 针对可透支的账户的取钱的操作
     * @param amount 要取的钱数
     */
    @Override
    public void withdraw(double amount) {
        if(amount <= this.getBalance()) {
            super.withdraw(amount);
        } else if(this.getBalance() + this.overdraft >= amount) {
            //double balance = this.getBalance();
            //super.withdraw(balance);
            //this.overdraft -= amount - balance;

            this.overdraft -= amount - this.getBalance();
            super.withdraw(this.getBalance());
        } else {
            System.out.println("超过可透支限额！");
        }
    }
}
















