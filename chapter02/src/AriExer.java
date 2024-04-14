public class AriExer {
  public static void main(String[] args) {
    /*
    * 随意给出一个整数，打印显示它的个位数，十位数，百位数的值格式如下:
    * 数字xxx的情况如下
    * 个位数
    * 十位数:
    * 百位数
    * 例如:
    * 数字153的情况如下
    * 个位数:3
    * 十位数:5
    * 百位数:1
    */
    int num = 153;

    int ge = num % 10;
    int shi = num / 10 % 10;
    int bai = num / 100;
    System.out.println("个位数：" + ge);
    System.out.println("十位数：" + shi);
    System.out.println("百位数：" + bai);

    /*
     * 练习2：为提抗洪水，展示连续作战89小时，计算共多少天多少小时？
     */
    int hours = 89;

    int day = hours / 24;
    int hour = hours % 24;
    System.out.println("共奋战了"+day+"天"+hour+"小时");

    // 练习3：
    int i = 1;
    int j = i++ + ++i * i++;
    System.out.println("j=" + j); // 10 = 1 + 3 * 3

    // 练习4：
    int m = 2;
    m = m++; // 1.先取 m 的值 “2” 放入操作数栈；2.m再自增，m=3；3.再把操作数栈中的“2”赋值给 m，结果为 2
    System.out.println(m); // 2
  }
}
