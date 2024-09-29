package com.atguigu05.exer.exer1;

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
    public int compareTo(Object o) throws Exception {
        if (o == this) return 0;
        if (o instanceof Circle circle) {
            return Double.compare(this.getRadius(), circle.getRadius());
        }
        //throw new RuntimeException("输入的类型不匹配");
        throw new Exception("输入的类型不匹配");
        //System.out.println("此语句不会被执行，编译报错");
    }
}
