package com.atguigu06.polymorphism.exer1;

/**
 * ClassName: GeometricObject
 * Description: 几何形状
 *
 * @Author yao
 * @Create 2024/7/28 上午11:03
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }
}
