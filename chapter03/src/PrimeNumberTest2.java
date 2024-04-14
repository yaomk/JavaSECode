/*
 * 题目：遍历100000以内所有的质数。体会不同算法实现，其性能的差别。
 *
 * 质数：只能被1和它本身整除的自然数。比如：2,3,5,7,11,13,17,19...
 *      --> 换句话说：从2开始到这个自然数-1为止，不存在此自然数的约数。
 */
public class PrimeNumberTest2 {
  public static void main(String[] args) {
    // 获取当前系统的时间
    long startTime = System.currentTimeMillis();
    boolean flag;
    int count = 0; // 记录质数的个数
    for (int i = 2; i <= 100000; i++) {
      flag = true;
      // for (int j = 2; j <= i - 1; j++) {
      for (int j = 2; j <= Math.sqrt(i); j++) { // 二：取 i 的算术平方根为截止条件
        // 为什么 j <= Math.sqrt(i) ?
        // example: 当 i= 25；
        // 将 25 分成一半： i/2 = 12.5；i/12.5 = 2；所以可减小循环范围，2~12.5之间。
        // 当 等于 5 时，5² = 25，为边界的最大值，可再次缩小范围， 2~5之间。
        if (i % j == 0) {
          flag = false; // 如果能够整除则将flag置为true，表明该 i 不是质数
          break; //一： 针对非质数有效果
        }
      }
      if (flag) {
        count++;
      }
    }
    // 获取当前系统的时间
    long endTime = System.currentTimeMillis();
    System.out.println("共耗时：" + (endTime - startTime) + "ms"); // 14441ms -> 1788ms(加上break) -> 23ms(Math.sqrt(i))
    System.out.println("100000 以内的质数个数count:" + count);
  }
}
