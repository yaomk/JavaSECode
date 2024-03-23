package com.atguigu1.one;

/**
 * 一维数组的基本使用
 * ClassName: OneArrayTest
 * Description:
 *
 * @Author yao
 * @Create 2024/3/23 15:17
 * @Version 1.0
 */
public class OneArrayTest {
    public static void main(String[] args) {
        // 1.数组的声明与初始化
        // 复习：变量的定义格式：数据类型 变量名 = 变量值
        int num1 = 10;
        int num2; // 声明
        num2 = 20; // 初始化

        // 1.1 声明数组
        double[] prices;
        // 1.2 数组的初始化
        // 静态初始化：数组变量的赋值与数组元素的赋值操作同时进行。
        prices = new double[]{12, 12.3, 43.31};

        // String[] foods;
        // foods = new String[]{"西湖醋鱼", "龙须菜", "麻婆豆腐"};

        // 数组的声明和初始化
        // 动态初始化：数组变量的赋值与数组元素的赋值操作分开进行。
        String[] foods = new String[3];
    }
}
