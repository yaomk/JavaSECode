/*
 * 逻辑运算符练习
 */
public class LogicExer {
  public static void main(String[] args) {
    // 练习1：
    int x = 1;
    int y = 1;
    if(x++ == 2 & ++y == 2) {
      x = 7;
    }
    System.out.println("x=" + x + " y=" + y); // x=2 y=2

    // 练习2：
    int x1 = 1, y1 = 1;
    if(x1++ == 2 && ++y1 == 2) {
      x1 = 7;
    }
    System.out.println("x1=" + x1 + " y1=" + y1); // x1=2 y1=1

    // 练习3：
    boolean b1 = true, b2 = false;
    short z = 42;
    if(z++ == 42 && (b2 = true)) {
      z++;
    }
    if(b1 = false || ++z == 45) {
      z++;
    }
    System.out.println("z=" + z); // z=46
  }
}
