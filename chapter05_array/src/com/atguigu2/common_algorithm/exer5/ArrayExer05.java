package com.atguigu2.common_algorithm.exer5;

/**
 * ClassName: ArrayExer05
 * Description:
 * 定义数组：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67}
 * 如何实现数组元素的反转存储？
 *
 * @Author yao
 * @Create 2024/4/20 上午10:52
 * @Version 1.0
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        // 反转前遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // 反转：方式一
        for (int i = 0; i < arr.length / 2; i++) {
            // 交换两个元素
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // 方式二: 不推荐
        int[] arr1 = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            arr1[i] = arr[arr.length - 1 - i];
        }
        arr = arr1;
        // 方式三
        for(int i = 0, j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // 反转后遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
