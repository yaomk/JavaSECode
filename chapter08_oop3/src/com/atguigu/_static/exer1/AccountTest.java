package com.atguigu._static.exer1;

/**
 * ClassName: AccountTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/24 10:08
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        System.out.println(acct1);

        Account acct2 = new Account("123456", 10);
        System.out.println(acct2);

        Account.setInterestRate(0.0015);
        Account.setMinBalance(10);
        System.out.println("银行存款利率为：" + Account.getInterestRate());
        System.out.println("银行存款最小额度为：" + Account.getMinBalance());
    }
}
