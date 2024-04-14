/*
 * 随机生成一个 1~100 以内的数，猜这个随机数是多少？
 * 从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不在猜了，并统计一共猜了多少次。
 *
 * 提示：生成一个 [a,b] 范围内的随机数：(int)(Math.random() * (b - a + 1) + a)
 */

import java.util.Scanner;

public class WhileTest1 {
  public static void main(String[] args) {
    // 步骤一：生成100以内随机数
    int randomNum = (int)(Math.random() * 100) + 1;
    // 步骤二：使用 Scanner，从键盘获取数据
    System.out.print("请输入 1~100 以内的正整数：");
    Scanner scannerIns = new Scanner(System.in);
    // 步骤三：循环判断从键盘获取的数据与随机数的大小，并记录循环次数
    int sum = 1;
    int guessNum = scannerIns.nextInt();
    while(guessNum != randomNum) {
      if(guessNum > randomNum) {
        System.out.println("猜大了");
      } else {
        System.out.println("猜小了");
      }
      System.out.print("请重新输入 1~100 以内的正整数：");
      guessNum = scannerIns.nextInt();
      sum++;
    }
    System.out.println("生成的随机数为" + randomNum);
    System.out.println("恭喜，你猜对了，共猜了" + sum + "次");
    // 步骤四：关闭 Scanner
    scannerIns.close();
  }
}
