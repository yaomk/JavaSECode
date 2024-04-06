package com.atguigu1.two.exer2;

/**
 * ClassName: ArrayExer02
 * Description:
 * 声明：int[] x,y[];在给 x,y 变量赋值以后，以下选项能否通过编译
 * 提示：
 * 一维数组： int[] x 或者 int x[]
 * 二维数组： int[][] y 或者 int[] y[] 或者 int y[][]
 *
 * @Author yao
 * @Create 2024/4/6 上午11:32
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        // 复习：赋值操作
        // 赋值符号：=
        int a1 = 10;
        int a2 = a1;
        byte b1 = (byte)a1; // 强制类型转换
        long l1 = a1; // 自动类型提升

        // 举例：数组
        int[] arr1 = new int[10];
        byte[] arr2 = new byte[10];
        //arr1 = arr2; // 编译不通过，原因：int[] byte[]，是两种不同类型的引用变量

        System.out.println("arr1 = " + arr1); // [I@682a0b20
        System.out.println("arr2 = " + arr2); // [B@214c265e
        
        int[][] arr3 = new int[3][2];
        //arr3 = arr1; // 编译不通过
        arr3[0] = arr1;
        System.out.println("arr3[0] = " + arr3[0]); // [I@682a0b20
        System.out.println("arr1 = " + arr1); // [I@682a0b20
        // *********************************

        // 声明
        int[] x, y[]; // 相当于：int[] x; int[] y[];
        // 赋值初始化
        x = new int[]{1,2};
        y = new int[2][];

        // x[0] = y; // 不通过，x 是一维数组
        y[0] = x; // 通过，y 是二维数组
        System.out.println("y[0][1] = " + y[0][1]); // 2
        //y[0][0] = x; // 不通过
        // x[0][0] = y; // 不通过
        y[0][0] = x[0]; // 通过，赋值
        System.out.println("y[0][0] = " + y[0][0]); // 1
        //x = y; // 不通过
    }
}
