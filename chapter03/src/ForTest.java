/*
 * 循环结构之一：for循环
 *
 * 1. java中三种循环结构：for、while、do-while
 * 2. 凡是循环结构，就一定有4个要素：
 * ①：初始化条件
 * ②：循环条件 --> 一定是boolean类型的变量或表达式
 * ③：循环体
 * ④：迭代部分
 *
 * 3. for循环的格式
 * for(①;②;④) {
 *    ③
 * }
 * 执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②
 */
public class ForTest {
  public static void main(String[] args) {
    // 需求1：输出5行HelloWorld
    for(int i = 0; i < 5; i++) {
      System.out.println("HelloWorld!");
    }

    // 需求2：for循环的执行过程
    int num = 1;
    for(System.out.print("①");ConditionFn(num); System.out.print("④"),num++) {
      System.out.print("③"); // 输出：①②③④ ②③④ ②③④ ②
    }
    System.out.println();

    // 需求3：遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
    int count = 0,sum = 0;
    for(int i = 1; i <= 100; i++) {
      if(i % 2 == 0) {
        System.out.println(i);
        count++;
        sum += i;
      }
    }
    System.out.println("1-100偶数的个数为" + count + "，偶数和为：" + sum);
  }
  static Boolean ConditionFn(int num) {
    System.out.print("②");
    return num <= 3;
  }
}
