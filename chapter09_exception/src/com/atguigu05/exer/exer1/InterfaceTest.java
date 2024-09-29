package com.atguigu05.exer.exer1;

/**
 * ClassName: InterfaceTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/3 09:45
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(2);
        ComparableCircle circle2 = new ComparableCircle(10);
        Circle circle3 = new Circle(1);
        int compareValue = 0;
        try {
            compareValue = circle1.compareTo(circle2);
            System.out.println(circle1.compareTo(circle3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(compareValue);
        if (compareValue > 0) {
            System.out.println("circle1 半径大");
        } else if (compareValue < 0) {
            System.out.println("circle2 半径大");
        } else {
            System.out.println("circle1 和 circle2 半径一样大");
        }
    }
}
