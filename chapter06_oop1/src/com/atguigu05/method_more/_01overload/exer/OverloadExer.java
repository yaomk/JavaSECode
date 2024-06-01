package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: OverloadExer
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 上午10:40
 * @Version 1.0
 */
public class OverloadExer {
    // 练习1：
    // 编写程序：定义三个重载方法并调用，方法名为 mOL
    // 三个方法分别接受一个int参数，两个int参数，一个字符串参数。
    // 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。

    public void mOL(int i) {
        System.out.println(i * i);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String s) {
        System.out.println(s);
    }

    // 练习2：
    // 定义三个重载方法max()
    // 第一个方法求两个int值中的最大值
    // 第二个方法求两个double值中的最大值
    // 第三个方法求三个double值中的最大值，并分别调用三个方法

    public int max(int i, int j) {
        return Math.max(i, j);
    }
    public double max(double i, double j) {
        return Math.max(i, j);
    }
    public double max(double i, double j, double k) {
        return Math.max(Math.max(i, j), k);
    }
}
