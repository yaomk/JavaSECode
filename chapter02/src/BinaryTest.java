/*
 * java中二进制，八进制，十进制，十六进制的表示
 * 计算机中数据的存储使用二进制的补码形式存储，最高位为符号位
 *
 * 十进制 dec（decimal）
 *    - 数字组成：0-9
 *    - 进位规则：满十进一
 *
 * 二进制 bin（binary）
 *    - 数字组成：0-1
 *    - 进位规则：满二进一，以 0b 或 0B 开头
 *
 * 八进制 oct（octal）
 *    - 数字组成：0-7
 *    - 进位规则：满八进一，以数字 0 开头
 *
 * 十六进制 hex（hexadecimal）
 *    - 数字组成：0-9，a-f
 *    - 进位规则：满十六进一，以 0x 或 0X 开头表示，此处的 a-f 不区分大小写
 */
public class BinaryTest {
  public static void main(String[] args) {
    int num1 = 53; // 十进制

    int num2 = 0b110101; // 二进制

    int num3 = 065; // 八进制

    int num4 = 0x35; // 十六进制

    System.out.println(num1); // 53
    System.out.println(num2); // 53
    System.out.println(num3); // 53
    System.out.println(num4); // 53
  }
}
