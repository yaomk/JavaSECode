package com.atguigu04.example.exer3;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author yao
 * @Create 2024/5/25 上午11:24
 * @Version 1.0
 */
public class Circle {
    // 属性
    double radius; // 半径
    // 方法
    public double findArea() {
        return 3.14 * radius * radius;
    }
    public static double findArea1(double r) {
        return 3.14 * r * r;
    }
}
