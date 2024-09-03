package com.atguigu08._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Description:
 *
 * @Author yao
 * @Create 2024/9/3 09:39
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (o == this) return 0;
        if (o instanceof Circle circle) {

            // 错误的方式，例如0.3强转为int为0
            //return (int)(this.getRadius() - circle.getRadius());

            // 方式1：
            //if(circle.getRadius() > this.getRadius()) {
            //    return -1;
            //}else if(circle.getRadius() < this.getRadius()) {
            //    return 1;
            //} else {
            //    return 0;
            //}

            // 方式2：
            return Double.compare(this.getRadius(), circle.getRadius());
        }
        //return 0;
        throw new RuntimeException("输入的类型不匹配");
    }
}
