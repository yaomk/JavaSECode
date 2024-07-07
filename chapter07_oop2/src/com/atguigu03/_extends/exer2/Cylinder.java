package com.atguigu03._extends.exer2;

/**
 * ClassName: Cylinder
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午10:43
 * @Version 1.0
 */
public class Cylinder extends Circle {
    private double length; //高

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 求圆柱体积
     * @return 体积
     */
    public double findVolume() {
        return findArea() * length;
    }
}
