package com.atguigu3.search_sort.exer1;

/**
 * ClassName: ArrayExer01_2
 * Description:数组的缩容
 * 现有数组 int[] arr = {1,2,3,4,5,6,7}; 需要删除数组中索引为4的元素
 * 数组元素依次紧密排列的
 *
 * @Author yao
 * @Create 2024/4/20 上午11:49
 * @Version 1.0
 */
public class ArrayExer01_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int deleteIndex = 4;
        //方式一：被删除的元素后面元素依次‘前移’
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //方式二：创建新数组
        int[] newArr = new int[arr.length];
        for(int i = 0; i < deleteIndex; i++){
            newArr[i] = arr[i];
        }
        for(int i = deleteIndex; i < arr.length - 1; i++){
            newArr[i] = arr[i + 1];
        }
        arr = newArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
