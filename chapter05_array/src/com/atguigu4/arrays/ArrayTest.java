package com.atguigu4.arrays;

import java.util.Arrays;

/**
 * ClassName: ArrayTest
 * Description:Arrays的使用
 * Arrays 类所在位置：在 java.util 包下
 * java.util.Arrays 类即为操作数组的工具类，包含了用来操作数组（比如排序和搜索）的各种方法。
 *
 * @Author yao
 * @Create 2024/4/27 上午10:03
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        //1. boolean equals(int[] a, int[] b); 比较两个数组的元素是否依次相等
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,5,4};
        //比较的是内存地址
        System.out.println(arr1 == arr2);

        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals); // true
        System.out.println(Arrays.equals(arr1,arr3)); // false

        //2. Sting toString(int[] a); 输出数组元素信息
        System.out.println(Arrays.toString(arr1));

        //3. void fill(int[] a, int[] b); 将指定值填充到数组的每个元素
        Arrays.fill(arr1, 10);

        //4. void sort(int[] a); 使用快速排序算法实现排序
        int[] arr4 = {34,54,3,2,65,7,34,5,76,34,67};
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(new int[3]));

        //5. int binarySearch(int[] a, int[] b); 二分查找，使用前提，当前数组必须是有序的
        int index1 = Arrays.binarySearch(arr4, 54);
        int index2 = Arrays.binarySearch(arr4, 33);
        System.out.println("index1 = " + index1 + "\t" +"index2 = " + index2);
        if(index2 < 10) {
            System.out.println("未找到");
        }
    }
}
