package com.atguigu1.two.exer1;

/**
 * ClassName: ArrayExer01
 * Description: 练习：获取arr数组中所有元素的和，使用for循环
 *
 * @Author yao
 * @Create 2024/4/6 上午11:24
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        //int[][] arr1 = {{3,5,8},{12,9},{7,0,6,4}}; // 类型推断
        int result = 0;
        // 遍历求和
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result += arr[i][j];
            }
        }
        System.out.println("result = " + result);
    }
}
