package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccountTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/14 上午11:32
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount cAct = new CheckAccount(1122, 20000, 0.045, 5000);

        cAct.withdraw(5000);
        System.out.println("您的账号余额为：" + cAct.getBalance());
        System.out.println("您的可透支额度为：" + cAct.getOverdraft());
        System.out.println();

        cAct.withdraw(18000);
        System.out.println("您的账号余额为：" + cAct.getBalance());
        System.out.println("您的可透支额度为：" + cAct.getOverdraft());
        System.out.println();

        cAct.withdraw(3000);
        System.out.println("您的账号余额为：" + cAct.getBalance());
        System.out.println("您的可透支额度为：" + cAct.getOverdraft());
    }
}
