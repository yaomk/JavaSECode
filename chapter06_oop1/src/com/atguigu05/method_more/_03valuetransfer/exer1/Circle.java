package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: Circle
 * Description:
 * 定义个circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回面积
 *
 * @Author yao
 * @Create 2024/6/1 下午5:45
 * @Version 1.0
 */
public class Circle {
    double radius; // 半径

    public double findArea() {
        return radius * radius * Math.PI;
    }
}
