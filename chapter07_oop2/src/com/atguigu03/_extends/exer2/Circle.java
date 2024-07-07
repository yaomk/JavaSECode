package com.atguigu03._extends.exer2;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午10:43
 * @Version 1.0
 */
public class Circle {
    private double radius; // 半径

    public Circle() {
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 求圆的面积
     * @return 面积
     */
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
