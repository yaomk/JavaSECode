package com.atguigu3.search_sort.exer1;

/**
 * ClassName: ArrayExer01_1
 * Description:数组的扩容
 * 现有数组 int[] arr = new int[]{1,2,3,4,5};
 * 现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作？
 *
 * @Author yao
 * @Create 2024/4/20 上午11:38
 * @Version 1.0
 */
public class ArrayExer01_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        // 扩容1倍容量
        //int[] newArr = new int[arr.length * 2];
        // 利用左移
        int[] newArr = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;
        arr = newArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
