/**
 * 如何交换两个int类型的变量的值？Sring呢？
 */
public class BitExer {

  public static void main(String[] args) {
    int m = 10;
    int n = 20;
    System.out.println("m = " + m + ",n = " + n);

    // 交换两个变量的值
    // 方式一：声明一个临时变量
    int temp = m;
    m = n;
    n = temp;
    System.out.println("m = " + m + ",n = " + n);

    // 方式二：不需要声明临时变量，缺点：适用性差（不适用非数值类型，可能会超出int类型）
    m = 10;
    n = 20;
    m = m + n; // 30 = 10 + 20
    n = m - n; // 10 = 30 - 20
    m = m - n; // 20 = 30 - 10
    System.out.println("m = " + m + ",n = " + n);

    // 方式三：不需要声明临时变量，缺点：适用性差（不适用非数值类型）
    m = 10;
    n = 20;
    m = m ^ n;
    n = m ^ n; // m ^ n ^ n = m
    m = m ^ n;
    System.out.println("m = " + m + ",n = " + n);

    // 0000 1010 m
    // 0001 0100 n
    // 0001 1110 m=m^n
    // 0000 1010 n=m^n
    // 0001 0100 m=m^n
  }
}