package com.atguigu07.object.toString.exer;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/17 10:28
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle("red", 2.0, 3.4);

        System.out.println(c1); // Circle{radius=2.3, color='white', weight=1.0}
        System.out.println(c1.toString());// Circle{radius=2.3, color='white', weight=1.0}

        System.out.println("颜色是否相等？" + c1.getColor().equals(c2.getColor())); // false
        System.out.println("半径是否相等？" + c1.equals(c2)); // false

    }
}
