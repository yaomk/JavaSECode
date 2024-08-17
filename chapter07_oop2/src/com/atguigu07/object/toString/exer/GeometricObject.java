package com.atguigu07.object.toString.exer;

/**
 * ClassName: GeometricObject
 * Description:
 *
 * @Author yao
 * @Create 2024/8/17 10:16
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject() {
        color = "white";
        weight = 1.0;
    }

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
}
