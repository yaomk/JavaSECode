package com.atguigu1.two;

/**
 * ClassName: TwoArrayTest1
 * Description: 二维数组的默认值与内存分析
 *
 * @Author yao
 * @Create 2024/4/5 上午11:07
 * @Version 1.0
 */
public class TwoArrayTest1 {
    public static void main(String[] args) {
        // 5. 数组元素的默认初始化值
        // 以动态初始化方式1说明
        int[][] arr1 = new int[3][2];
        // 外层元素默认值
        System.out.println(arr1[0]); // [I@4eec7777
        System.out.println(arr1[1]); // [I@3b07d329
        // 内层元素默认值
        System.out.println(arr1[0][0]); // 0

        boolean[][] arr2 = new boolean[3][2];
        // 外层元素默认值
        System.out.println(arr2[0]); // [Z@41629346
        System.out.println(arr2[0][0]); // false

        String[][] arr3 = new String[3][2];
        System.out.println(arr3[0]); // [Ljava.lang.String;@404b9385
        System.out.println(arr3[0][0]); // null

        // ****************************
        // 以动态初始化方式2说明：
        int[][] arr4 = new int[3][];
        // 外层元素默认值：
        System.out.println(arr4[0]); // null
        // 内存元素默认值：
        System.out.println(arr4[0][0]); // 报错：NullPointerException

        String[][] arr5 = new String[3][];
        // 外层元素默认值：
        System.out.println(arr5[0]); // null
        // 内存元素默认值：
        System.out.println(arr5[0][0]); // 报错：NullPointerException
    }
}
