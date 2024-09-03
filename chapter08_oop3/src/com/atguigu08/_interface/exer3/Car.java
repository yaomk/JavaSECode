package com.atguigu08._interface.exer3;

/**
 * ClassName: Car
 * Description:
 *
 * @Author yao
 * @Create 2024/9/3 10:13
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower {
    private String carNumber;

    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("汽车通过内燃机驱动行驶");
    }

    @Override
    public void power() {
        System.out.println("汽车通过汽油提供动力");
    }
}
