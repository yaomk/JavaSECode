package com.atguigu04.example.exer4;

/**
 * ClassName: MyArrays
 * Description:
 * 根据上一章数组中常用算法操作，自定义一个操作int[]的工具类
 * 涉及到的方法有：求最大值，最小值，总和，平均数，遍历数组，复制数组，数组反转，数组排序（默认从小到大排序），查找
 *
 * @Author yao
 * @Create 2024/5/25 上午11:36
 * @Version 1.0
 */
public class MyArrays {
    /**
     * 获取int[]数组的最大值
     * @param arr 要获取最大值的数组
     * @return 数组的最大值
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    /**
     * 获取int[]数组的最小值
     * @param arr 要获取最小值的数组
     * @return 数组的最小值
     */
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    /**
     * 获取int[]数组的总和
     * @param arr 要获取总和的数组
     * @return 数组的总和
     */
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    /**
     * 获取int[]数组的平均值
     * @param arr 要获取平均值的数组
     * @return 数组的平均值
     */
    public int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    /**
     * 打印数组
     * @param arr 待打印的数组
     */
    public void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
        }
        System.out.println("]");
    }

    /**
     * 复制数组
     * @param arr 要复制的数组
     * @return arr的复制体
     */
    public int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 反转数组
     * @param arr 要反转的数组
     */
    public void reverse(int[] arr) {
        for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 使用冒泡排序算法，对数组排序
     * @param arr 待排序的数组
     */
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 使用线性查找的算法，查找指定的元素
     * @param arr 待查找的数组
     * @param target 要查找的元素
     * @return target元素在arr数组中的索引位置，若未找到，则返回-1
     */
    public int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(target == arr[i]) {
                return i;
            }
        }
        //只要代码执行到此为止，一定是没找到
        return -1;
    }
}
