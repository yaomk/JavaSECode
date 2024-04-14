/*
 * 循环结构之一：do-while循环
 *
 * 1. java中三种循环结构：for、while、do-while
 * 2. 凡是循环结构，就一定有4个要素：
 * ①：初始化条件
 * ②：循环条件 --> 一定是boolean类型的变量或表达式
 * ③：循环体
 * ④：迭代部分
 *
 * 2.do-while的格式
 *
 * ①
 * do{
 *  ③
 *  ④
 * }while(②)
 *
 * 执行过程：① - ③ - ④ - ② - ③ - ④ - ② - .... - ②
 *
 * 3.说明：
 *  1.do-while循环至少会执行一次循环体
 *  2. for、while、do-while循环三者之间可以相互转换的
 */
public class DoWhileTest {
  public static void main(String[] args) {

    // 需求：遍历100以内的偶数，并输出偶数的个数和总和

    int i = 1;
    int sum = 0; // 总和
    int count = 0; // 个数

    do {
      if(i % 2 == 0) {
        System.out.println(i);
        sum += i;
        count++;
      }
      i++;
    } while (i <= 100);
    System.out.println("100以内的偶数个数为："+count + ", 和为："+sum);

    // do-while循环至少执行一次循环体
    int num1 = 10;
    while(num1 > 10) {
      System.out.println("while: hello");
      num1--;
    }

    int num2 = 10;
    do {
      System.out.println("do-while:hello");
      num2--;
    } while (num2 > 10);
    System.out.println("num2:" + num2);
  }
}
