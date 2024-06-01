package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Description:
 *定义一个类PassObject，在类中顶一个方法printAreas()，该方法的定义如下：
 * public void printAreas(Circle c, int time)
 *
 * 在printAreas方法中打印输出1到time之间每个整数半径值，以及对应的面积。
 * 例如：time为5，则输出半径1,2,3,4,5 以及对应的圆面积
 *
 * @Author yao
 * @Create 2024/6/1 下午5:49
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject p = new PassObject();
        Circle c = new Circle();
        p.printAreas(c, 5);

        System.out.println("now radius is:" + c.radius);
    }
    public void printAreas(Circle c, int time) {
        System.out.println("Radius\t\tArea");
        int i = 1;
        for (; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t\t" + c.findArea());
        }
        c.radius = i;
    }
}
