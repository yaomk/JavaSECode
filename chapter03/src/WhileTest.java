/*
 * 循环结构之一：while循环
 *
 * 1. java中三种循环结构：for、while、do-while
 * 2. 凡是循环结构，就一定有4个要素：
 * ①：初始化条件
 * ②：循环条件 --> 一定是boolean类型的变量或表达式
 * ③：循环体
 * ④：迭代部分
 *
 * 3. while循环的格式
 * ①
 * while(②) {
 *    ③
 *    ④
 * }
 * 执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②
 *
 * 4. for循环与while循环可以相互转换！
 *
 * 5. for循环与while循环的小区别：初始化条件的作用域范围不同。while循环中的初始化条件在while循环结束后，依然有效。
 */
public class WhileTest {
  public static void main(String[] args) {
    // 需求1：遍历50次 HelloWrod
    int i = 1;
    while(i <= 50) {
      System.out.println("Hello World!");
      i++;
    }
    // 需求2：遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
    int num = 1;
    int count = 0; // 记录偶数的个数
    int sum = 0; // 记录偶数的和
    while(num <= 100) {
      if(num % 2 == 0) {
        count++;
        sum += num;
      }
      num++;
    }
    System.out.println("1~100以内的偶数个数为：" + count + ", 所有的偶数和为：" + sum);
  }
}
