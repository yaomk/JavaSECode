
/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 例如：12和20的最大公约数为4，最小公倍数为60.
 *
 * 约数：12为例，约数有 1,2,3,4,6,12
 *      20为例，约数有 1,2,4,5,10,20
 *
 * 倍数：12为例，倍数有 12,24,36,48,60,72, ...
 *      20为例，倍数有 20,40,60,80, ...
 */
// 导入 Scanner 类包
import java.util.Scanner;

public class ForTest2 {
  public static void main(String[] args) {
    // 初始化 Scanner 类实例
    Scanner scannerIns = new Scanner(System.in);
    System.out.print("请输入正整数m: ");
    // 调用 Scanner 类实例的方法，获取指定类型的变量
    int m = scannerIns.nextInt();
    System.out.print("请输入正整数n: ");
    int n = scannerIns.nextInt();

    /* 获取最大公约数 */
    // 获取m，n之间的最小值
    int min = m > n ? n : m;
    // 方式1：
    int result = 1;
    for (int i = 1; i <= min; i++) {
      if (m % i == 0 && n % i == 0) {
        result = i;
      }
    }
    System.out.println("m :" + m + "，n: " + n + "最大公约数位：" + result);
    // 方式2：推荐
    for (int i = min; i >= 1; i--) {
      if (m % i == 0 && n % i == 0) {
        System.out.println("m :" + m + "，n: " + n + "最大公约数位：" + i);
        break; // 一旦执行，就跳出当前循环结构
      }
    }

    /* 获取最小公倍数 */
    int max = m > n ? m : n;
    for (int i = max; i <= m * n; i++) {
      if (i % m == 0 && i % n == 0) {
        System.out.println("m :" + m + "，n: " + n + "最小公倍数：" + i);
        break;
      }
    }
    // 关闭 scanner，避免内存泄漏
    scannerIns.close();
  }
}