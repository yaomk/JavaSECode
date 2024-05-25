package com.atguigu04.example.exer2;

/**
 * ClassName: Exer02
 * Description:
 * 1. 编写程序，声明一个method1方法，在方法中打印一个10*8的*型矩阵，在main方法中调用该方法
 * 2. 编写程序，声明一个method2方法，除打印一个10*8的*型矩阵，并计算该矩形的面积，并将其作为返回值，在main方法中调用该方法，并打印面积
 * 3. 编写程序，声明一个method3方法，在method3方法中提供m和n两个参数，方法中打印一个m*n的矩阵，并计算该矩形的面积，并将其作为返回值，在main方法中调用该方法，并打印面积
 *
 * @Author yao
 * @Create 2024/5/25 上午11:09
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {
        //method1(); // 方法的‘级别’不同，一个有static修饰，一个没有

        // 创建Exer02的对象
        Exer02 exer = new Exer02();
        exer.method1();
        System.out.println();

        int area = exer.method2();
        System.out.println("method2返回的矩形面积为：" + area);
        System.out.println();

        int area1 = exer.method3(4, 8);
        System.out.println("method3返回的矩形面积为：" + area1);
    }
    public void method1() {
        for (int i = 0; i < 10; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int method2() {
        for (int i = 0; i < 10; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public int method3(int m, int n) {
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
