/*
 * 测试运算符的使用4：逻辑运算符的使用
 * & && | || ! ^
 *    逻辑且：&、 &&
 *    逻辑或：|、||
 *    逻辑非：!
 *    逻辑异或：^（相同为0/false，不同为1/true）
 * 说明：
 * 逻辑运算符针对的都是boolean类型的变量进行的操作
 * 逻辑运算符的结果也是boolean类型
 * 逻辑运算符常使用在条件判断结构、循环结构
 *
 */

public class LogicTest {
  public static void main(String[] args) {

    /*
     * 区分 & 和 &&
     * 这里 & 可以看做是位运算符：按位与，更方便理解
     * 如果 & 左边为 false，则右边的操作也会执行
     * 如果 && 左边为 false，不会执行右边的操作
     */
    boolean b1 = true;
    int num1 = 10;
    if(b1 & num1++ > 0) {
      System.out.println("逻辑判断为 true 的执行结果");
    } else {
      System.out.println("逻辑判断为 false 的执行结果");
    }
    System.out.println("num1此时的值为 " + num1); // 11

    boolean b2 = true;
    int num2 = 10;
    if(b2 && num2++ > 0) {
      System.out.println("逻辑判断为 true 的执行结果");
    } else {
      System.out.println("逻辑判断为 false 的执行结果");
    }
    System.out.println("num2此时的值为 " + num2); // 11

    boolean b3 = false;
    int num3 = 10;
    if(b3 & num3++ > 0) {
      System.out.println("逻辑判断为 true 的执行结果");
    } else {
      System.out.println("逻辑判断为 false 的执行结果");
    }
    System.out.println("num3此时的值为 " + num3); // 11

    boolean b4 = false;
    int num4 = 10;
    if(b4 && num4++ > 0) {
      System.out.println("逻辑判断为 true 的执行结果");
    } else {
      System.out.println("逻辑判断为 false 的执行结果");
    }
    System.out.println("num4此时的值为 " + num4); // 10
  }
}
