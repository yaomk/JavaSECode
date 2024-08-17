package com.atguigu07.object.toString.exer;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author yao
 * @Create 2024/8/17 10:16
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        // 不写相当于 super()
        //color = "white";
        //weight = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
        // 不写相当于 super()
        //color = "white";
        //weight = 1.0;
        this.radius = radius;
    }

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

    public double findArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
