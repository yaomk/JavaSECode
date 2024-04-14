package com.atguigu2.common_algorithm.exer1;

/**
 * ClassName: ArrayExer01
 * Description:定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，并输出出来。
 * 要求：所有随机数都是两位数：[10,99]
 *
 * @Author yao
 * @Create 2024/4/14 上午10:39
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int minNum = 0;
        int maxNum = 0;
        int sum = 0;
        int averageValue = 0;
        String arrStr = "arr1: [";
        for(int i = 0; i< arr1.length; i++){
            arr1[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;
            minNum = i == 0 ? arr1[i] : Math.min(minNum, arr1[i]);
            maxNum = Math.max(maxNum, arr1[i]);
            sum += arr1[i];
            arrStr += arr1[i] + (i == 9 ? "]":", ");
        }
        System.out.println(arrStr);
        System.out.println("minNum = " + minNum);
        System.out.println("maxNum = " + maxNum);
        System.out.println("sum = " + sum);
        System.out.println("averageValue = " + sum/arr1.length);
    }
}
