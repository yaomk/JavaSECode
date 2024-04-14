
// 嵌套循环输出菱形
//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *

public class ForForTest {
  public static void main(String[] args) {
    // 可以将菱形分为两部分，空格用-代替

    // --------*
    // ------* * *
    // ----* * * * *
    // --* * * * * * *
    // * * * * * * * * *

    // i(第几行) j(-个数) k(*个数) 2i + j = 10
    // 1        8        1       2i - 1 = k
    // 2        6        3
    // 3        4        5
    // 4        2        7
    // 5        0        9

    for(int i = 1; i <= 5; i++) {
      for(int j = 1;j <= 10 - 2 * i ; j++) {
        System.out.print("-");
      }
      for(int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // 下半部分
    // --* * * * * * *
    // ----* * * * *
    // ------* * *
    // --------*

    for(int i = 1; i<=4; i++){
      for(int j = 1; j <= 2 * i; j++){
        System.out.print("-");
      }
      for(int k = 1; k <= 9 - 2 * i ; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
