
/*
 * 案例：编写程序：从键盘输入年、月、日，要求通过程序输出输入的日期为该年的第几天。
 */
// 导入Scanner包
import java.util.Scanner;

public class SwitchCaseExer {
  public static void main(String[] args) {
    // 1. 使用scanner类获取用户输入的年月日，假设用户输入的数据是合法的
    // 实例化
    Scanner scannerInstance = new Scanner(System.in);
    System.out.print("请输入年份：");
    // 获取用户输入的年
    int year = scannerInstance.nextInt();
    System.out.print("请输入月份：");
    // 获取用户输入的月
    int month = scannerInstance.nextInt();
    System.out.print("请输入日：");
    // 获取用户输入的日
    int day = scannerInstance.nextInt();
    // 总天数
    int sumDays = 0;

    boolean isLeapYear = (year % 4) == 0;
    int februaryDays = isLeapYear ? 29 : 28;
    // 2. 使用 switch-case实现分支结构

    // 方式1：不推荐这种写法，存在数据冗余
    switch (month) {
      case 1:
        sumDays = day;
        break;
      case 2:
        sumDays = 31 + day;
        break;
      case 3:
        sumDays = 31 + februaryDays + day;
        break;
      case 4:
        sumDays = 31 + februaryDays + 31 + day;
        break;
      case 5:
        sumDays = 31 + februaryDays + 31 + 30 + day;
        break;
      case 6:
        sumDays = 31 + februaryDays + 31 + 30 + 31 + day;
        break;
      case 7:
        sumDays = 31 + februaryDays + 31 + 30 + 31 + 30 + day;
        break;
      case 8:
        sumDays = 31 + februaryDays + 31 + 30 + 31 + 30 + 31 + day;
        break;
      case 9:
        sumDays = 31 + februaryDays + 31 + 30 + 31 + 30 + 31 + 31 + day;
        break;
      case 10:
        sumDays = 31 + februaryDays + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
        break;
      case 11:
        sumDays = 31 + februaryDays + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
        break;
      case 12:
        sumDays = 31 + februaryDays + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
        break;
    }
    System.out.println("方式1：" + year + "年" + month + "月" + day + "日，是该年的第" + sumDays + "天。");

    sumDays = 0;
    // 方式2：利用case穿透
    switch (month) {
      case 12:
        sumDays += 30;
      case 11:
        sumDays += 31;
      case 10:
        sumDays += 30;
      case 9:
        sumDays += 31;
      case 8:
        sumDays += 31;
      case 7:
        sumDays += 30;
      case 6:
        sumDays += 31;
      case 5:
        sumDays += 30;
      case 4:
        sumDays += 31;
      case 3:
        sumDays += februaryDays;
      case 2:
        sumDays += 31;
      case 1:
        sumDays += day;
      default:
        break;
    }

    System.out.println("方式2：" + year + "年" + month + "月" + day + "日，是该年的第" + sumDays + "天。");
    // 关闭，避免内存泄漏
    scannerInstance.close();
  }
}
