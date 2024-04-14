/*
 * 题目：找出100以内的所有的素数（质数）？100000以内呢？
 *
 * 质数：只能被1和它本身整除的自然数。比如：2,3,5,7,11,13,17,19...
 *      --> 换句话说：从2开始到这个自然数-1为止，不存在此自然数的约数。
 */
public class PrimeNumberTest1 {
  public static void main(String[] args) {
    boolean flag;
    int count = 0; // 记录质数的个数
    for (int i = 2; i <= 100; i++) {
      flag = true;
      for (int j = 2; j <= i - 1; j++) {
        if (i % j == 0) {
          flag = false; // 如果能够整除则将flag置为true，表明该 i 不是质数
          break;
        }
      }
      if (flag) {
        count++;
        System.out.println(i);
      }
    }
    System.out.println("100以内的质数个数count:" + count);
  }
}
