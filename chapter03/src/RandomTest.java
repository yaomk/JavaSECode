/*
 * 如何获取一个随机数？
 * 1. 可以使用 java 提供的api：Math类的random()
 * 2. random()调用后，会返回一个 [0.0, 1.0) 范围的 double 型的随机数
 *
 * 3.需求：获取[0, 100]的随机整数
 *        (int)(Math.random() * (100 + 1))
 * 4.需求：获取[1, 100]的随机整数
 *        (int)(Math.random() * 100) + 1
 * 5.需求：获取[a, b]的随机整数
 *        (int)(Math.random() * (b - a + 1)) + a
 */
public class RandomTest {
  public static void main(String[] args) {
    double num1 = Math.random();
    System.out.println("num1 = " + num1);
    // 获取[0, 100]范围内整数
    int int1 = (int)(num1 * 101); // [0.0, 1.0) -> [0.0, 101.0) -> [0, 100]
    System.out.println("int1 = " + int1);
    // 获取[1, 100]范围内整数
    int int2 = (int)(num1 * 100) + 1; // [0.0, 1.0) -> [0.0, 100.0) -> [0, 99] + 1 -> [1, 100]
    System.out.println("int2 = " + int2);
    // 获取[20, 50]范围内整数
    int int3 = (int)(num1 * 31) + 20; // [0.0, 1.0) -> [0.0, 31.0) -> [0, 30] + 20 -> [20, 50]
    System.out.println("int3 = " + int3);
  }
}
