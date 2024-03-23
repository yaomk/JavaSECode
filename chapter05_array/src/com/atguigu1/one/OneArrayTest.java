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

        // 其他正确的方式
        int[] arr = new int[4];
        int arr1[] = new int[4]; // c语音的格式来定义数据
        int[] arr2 = {1,2,3,4}; // 类型推断

        // 错误的方式
        // int[] arr3 = new int[3]{1,2,3};
        // int[3] arr3 = new int[];

        // 2. 数组元素的调用
        // 通过角标的方式，获取数组的元素
        // 角标的范围从 0 开始，到数组的长度 - 1结束
        System.out.println("prices[0] = " + prices[0]);
        System.out.println("prices[2] = " + prices[2]);
        // System.out.println("prices[3] = " + prices[3]); // 报异常：ArrayIndexOutOfBoundsException

        foods[0] = "西湖醋鱼";
        foods[1] = "龙须菜";
        foods[2] = "麻婆豆腐";
        // foods[3] = "麻婆豆腐"; // 报异常：ArrayIndexOutOfBoundsException

        // 3. 数组的长度：用来描述数组容器中容量的大小
        // 使用length属性表示
        System.out.println("foods.length = " + foods.length);
        System.out.println("prices.length = " + prices.length);

        // 4. 如何遍历数组
        for (int i = 0; i < foods.length; i++) {
            System.out.println("food[" + i + "] = " + foods[i]);
        }
        for (double price : prices) {
            System.out.println("prices[i] = " + price);
        }
    }
}
