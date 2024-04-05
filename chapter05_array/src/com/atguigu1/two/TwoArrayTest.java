package com.atguigu1.two;

/**
 * ClassName: TwoArrayTest
 * Description:
 *
 * @Author yao
 * @Create 2024/4/3 10:28
 * @Version 1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        // 1.数组的声明与初始化
        // 复习
        int[] arr1 = new int[]{1, 2, 3};
        // 方式1：静态初始化：数组变量的赋值和数组元素的赋值同时进行
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8}};
        // 方式2：动态初始化1：数组变量的赋值和数组元素的赋值分开进行
        String[][] arr3 = new String[1][2];
        // 方式2：动态初始化2
        double[][] arr4 = new double[2][];

        // 其他正确的写法：
        int[][] arr5 = new int[][]{{1, 2, 3}, {4, 5}};
        int[] arr6[] = new int[][]{{1, 2, 3}, {4, 5}};
        int arr7[][] = {{1, 2, 3}, {4, 5}}; // 类型推断
        String arr8[][] = new String[3][3];

        // 2. 数组元素的调用
        // 针对arr2来说，外层元素{1,2,3}、{4,5,6} 内层元素：1,2,3,4,5,6
        System.out.println("arr2[0][0] = " + arr2[0][0]); // 1
        System.out.println("arr2[1][1] = " + arr2[1][1]); // 5

        // 调用外层元素
        System.out.println("arr2[0] = " + arr2[0]); // [I@568db2f2

        // 测试arr3，arr4
        arr3[0][1] = "Tom";
        System.out.println("arr3[0][1] = " + arr3[0][1]); // "Tom"
        System.out.println("arr3[0] = " + arr3[0]); // [Ljava.lang.String;@378bf509

        arr4[0] = new double[4];
        arr4[0][0] = 1.0;
        System.out.println("arr4[1][0] = " + arr4[0][0]);

        // 3. 数组的长度
        System.out.println("arr2.length = " + arr2.length); // 2
        System.out.println("arr2[0].length = " + arr2[0].length); // 3
        System.out.println("arr2[1].length = " + arr2[1].length); // 3

        // 4. 如何遍历数组
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("arr2[" + i + "][" + j + "] = " + arr2[i][j] + '\t');
            }
            System.out.println();
        }
    }
}
