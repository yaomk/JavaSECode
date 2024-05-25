package com.atguigu04.example.exer3;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author yao
 * @Create 2024/5/25 上午11:26
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 2.3;
        System.out.println("面积为：" + c1.findArea());
        System.out.println("面积为：" + Circle.findArea1(2.3));
    }
}
