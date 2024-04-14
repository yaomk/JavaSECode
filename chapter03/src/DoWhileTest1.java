/*
 * 题目：模拟ATM取款
 *
 * 声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
 *
 * ========ATM========
 *    1、存款
 *    2、取款
 *    3、显示余额
 *    4、退出
 * 请选择（1-4）：
 */

import java.util.Scanner;

public class DoWhileTest1 {
  public static void main(String[] args) {
    // 定义余额
    double balance = 0;
    boolean loopControl = true;
    Scanner scannerIns = new Scanner(System.in);
    do {
      System.out.println("========ATM========");
      System.out.println("    1、存款");
      System.out.println("    2、取款");
      System.out.println("    3、显示余额");
      System.out.println("    4、退出");
      System.out.print("请选择（1-4）：");
      int userInput = scannerIns.nextInt();
      switch (userInput) {
        case 1: {
          System.out.println();
          System.out.print("请输入存款金额：");
          double money = scannerIns.nextDouble();
          if(money > 0) {
            balance += money;
            System.out.println("存款成功！您当前的余额为：" + balance);
            System.out.println();
          } else {
            System.out.println("输入有误");
          }
        }
          break;
        case 2: {
          System.out.println();
          System.out.print("请输入取款金额：");
          double money = scannerIns.nextDouble();
          if (money > balance) {
            System.out.println("余额不足");
          } else {
            balance -= money;
            System.out.println("取款成功！您当前的余额为：" + balance);
            System.out.println();
          }
        }
          break;
        case 3: {
          System.out.println();
          System.out.println("您当前的余额为：" + balance);
          System.out.println();
        }
          break;
        case 4:
          scannerIns.close();
          loopControl = false;
          break;
        default:
          break;
      }
    } while (loopControl);
  }
}
