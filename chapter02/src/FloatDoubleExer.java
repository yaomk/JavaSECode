// package chapter02;
/* 案例1：定义圆周率并赋值为3.14，现有三个圆半径分别为1.2, 2.5, 6，求他们的面积。 */
public class FloatDoubleExer {
  public static void main(String[] args) {
    double pi = 3.14;

    double radius1 = 1.2;
    double radius2 = 2.5;
    int radius3 = 6;

    double area1 = pi * radius1 * radius1;
    double area2 = pi * radius2 * radius2;
    double area3 = pi * radius3 * radius3;

    System.out.println("半径为" + radius1 + "的圆，则面积为：" + area1);
    System.out.println("半径为" + radius2 + "的圆，则面积为：" + area2);
    System.out.println("半径为" + radius3 + "的圆，则面积为：" + area3);
  }
}

/*
 * 案例2：将华氏度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。
 * ℃ = (℉ - 32) / 1.8
 */
class FloatDoubleExer1 {
  public static void main(String[] args) {
    double hua = 80;
    double she = (hua - 32) / 1.8;

    System.out.println("华氏度" + hua + "℉ ，对应的摄氏度为" + she + "℃ 。");
  }
}