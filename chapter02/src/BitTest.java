/*
 * 测试运算符的使用5：位运算符
 * 1. 位运算符：>>(右移) <<(左移) >>>(无符号位右移) &(按位与) |(按位或) ^(按位异或) ~(按位取分)
 *
 * 2. 说明：
 * ① 都是针对数值类型的变量或常量进行运算，运算的结果也是数值
 * ② << ：在一定范围内，每向左移动一位，结果就是在原有的基础上 * 2.（对于正数、负数都适用）
 * ③ >> : 在一定范围内，每向右移动一位，结果就是在原有的基础上 / 2.（对于正数、负数都适用）
 * ④ >>> : 往右移动后，左边空出来的位直接补 0。
 *         例如：69 >>> 4 相当于 69/16 = 4
 *              -69 >>> 4 ,结果为 268435451
 *
 * 3. 面试题：高效的方式计算 2 * 8 ？
 *    2 << 3 或 4 << 2 或 8 << 1
 */
public class BitTest {
  public static void main(String[] args) {
    // 0000 0000 0000 0000 0000 0000 0000 0111
    // 0000 0000 0000 0000 0000 0000 0000 1110 左移一位
    int num1 = 7; // int 类型 4字节，32位
    System.out.println("num1 << 1 : " + (num1 << 1)); // 14
    System.out.println("num1 << 2 : " + (num1 << 2)); // 28
    System.out.println("num1 << 3 : " + (num1 << 3)); // 56
    System.out.println("num1 << 28 : " + (num1 << 28)); // 1879048192
    System.out.println("num1 << 29 : " + (num1 << 29)); // -536870912，左移29位，最高位为1，变成负值

    // -7的二进制：
    //原码： 1000 0111
    //反码： 1111 1000
    //补码： 1111 1001 计算机中以二进制补码形式存储
    //左移： 1111 0010
    //反码： 1111 0001
    //原码： 1000 1110 结果为：-14
    byte num2 = -7;
    System.out.println("num2 << 1 : " + (num2 << 1)); // -14
    System.out.println("num2 << 2 : " + (num2 << 2)); // -28
    System.out.println("num2 << 3 : " + (num2 << 3)); // -56


    System.out.println(9 & 7); // 1
    System.out.println(-9 & 7); // 7
    System.out.println(9 | 7); // 15
    System.out.println(-9 | 7); // -9
    System.out.println(9 ^ 7); // 14
    System.out.println(-9 ^ 7); // -16
    System.out.println(~9); // -10
    System.out.println(~ -9); // 8
  }
}
