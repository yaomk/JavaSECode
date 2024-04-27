package com.atguigu5.exception;

/**
 * ClassName: ArrayExceptionTest
 * Description:测试数组中常见的异常
 * 数组的使用中常见的异常小姐
 *  数组角标越界的异常：ArrayIndexOutOfBoundsException
 *  空指针异常：NullPointerException
 *
 * @Author yao
 * @Create 2024/4/27 上午11:24
 * @Version 1.0
 */
public class ArrayExceptionTest {
    public static void main(String[] args) {
        // 1. 数组角标越界异常 ArrayIndexOutOfBoundsException
        int[] arr = new int[3];
        // 角标的有效范围：0,1,2
        // System.out.println(arr[3]);
        // System.out.println(arr[-1]);

        // 2. 空指针异常 NullPointerException
        // 情况一
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);
        arr1 = null;
        //System.out.println(arr1[0]);
        // 情况二
        int[][] arr2 = new int[3][];
        System.out.println(arr2[0]); // null
        //System.out.println(arr2[0][0]); // NullPointerException
        // 情况三
        String[] arr3 = new String[3];
        //System.out.println(arr3[0].toString()); // NullPointerException
    }
}
