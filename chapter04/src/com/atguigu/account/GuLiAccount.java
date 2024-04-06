package com.atguigu.account;

import com.atguigu.util.Utility;

/**
 * ClassName: GuLiAccount
 * Description: 谷粒记账软件
 *
 * @Author yao
 * @Create 2024/3/23 11:15
 * @Version 1.0
 */
public class GuLiAccount {
    public static void main(String[] args) {
        boolean flag = true;
        String info = "";
        int balance = 10000;
        while (flag) {
            System.out.println("-----------------谷粒记账软件-----------------\n");
            System.out.println("                  1 收支明细");
            System.out.println("                  2 登记收入");
            System.out.println("                  3 登记支出");
            System.out.println("                  4 退    出\n");
            System.out.print("                  请选择(1-4)：");
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("\n-----------------当前收支明细记录-----------------");
                    System.out.println("收支\t\t账户金额\t\t收支金额\t\t说    明");
                    System.out.println(info);
                    System.out.println("--------------------------------------------------\n");
                    break;
                case '2': {
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    if (money > 0) {
                        balance += money;
                    }
                    System.out.print("本次收入说明：");
                    String desc = Utility.readString();
                    if (money > 0) {
                        info += "收入\t\t" + balance + "\t\t" + money + "\t\t" + desc + "\n";
                    }
                    System.out.println("---------------------登记完成---------------------\n");
                    break;
                }
                case '3': {
                    System.out.print("本次支出金额：");
                    int money = Utility.readNumber();
                    if (money > 0) {
                        balance -= money;
                    }
                    System.out.print("本次支出说明：");
                    String desc = Utility.readString();
                    if (money > 0) {
                        info += "支出\t\t" + balance + "\t\t" + money + "\t\t" + desc + "\n";
                    }
                    System.out.println("---------------------登记完成---------------------\n");
                    break;
                }
                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        flag = false;
                        Utility.close();
                    }
                    break;
            }
        }
    }
}
