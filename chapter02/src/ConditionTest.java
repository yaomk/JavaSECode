/**
 * 测试运算符的使用6：条件运算符
 * 1. (条件表达式) ? 表达式1 : 表达式2
 * 说明：
 * 如果需要将表达式结果赋值，表达式1 和 表达式2 需要是相同的类型或能兼容的类型
 */
public class ConditionTest {

  public static void main(String[] args) {
    int m = 10;
    int n = 20;
    double result = m > n ? 10 : 20.0;
    System.out.println(result);
  }
}