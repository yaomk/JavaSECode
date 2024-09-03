package com.atguigu08._interface.exer3;

/**
 * ClassName: Bicycle
 * Description:
 *
 * @Author yao
 * @Create 2024/9/3 10:10
 * @Version 1.0
 */
public class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车通过人力脚蹬行驶");
    }
}
