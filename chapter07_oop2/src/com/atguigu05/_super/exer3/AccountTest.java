package com.atguigu05._super.exer3;

/**
 * ClassName: AccountTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/14 上午11:12
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account act = new Account(1122, 20000, 0.045);

        act.withdraw(30000);
        System.out.println("您的账户余额为：" + act.getBalance());

        act.withdraw(2500);

        act.deposit(3000);
        System.out.println("您的账户余额为：" + act.getBalance());

        System.out.println("月利率为：" + act.getMonthlyInterest());
    }
}
