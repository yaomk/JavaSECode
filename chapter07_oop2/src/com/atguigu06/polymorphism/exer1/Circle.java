package com.atguigu06.polymorphism.exer1;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author yao
 * @Create 2024/7/28 上午11:08
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius; // 半径

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
