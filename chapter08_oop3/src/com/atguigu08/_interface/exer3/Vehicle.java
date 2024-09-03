package com.atguigu08._interface.exer3;

/**
 * ClassName: Vehicle
 * Description: 交通工具抽象类
 *
 * @Author yao
 * @Create 2024/9/3 10:09
 * @Version 1.0
 */
public abstract class Vehicle {
    private String brand; // 品牌
    private String color; // 颜色

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void run();
}
