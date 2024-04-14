package com.atguigu2.common_algorithm.exer4;

/**
 * ClassName: ArrayExer04
 * Description: 复制、赋值
 * 使用简单数组
 * (1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
 * (2)使用大括号{}，把array1初始化为8个素数:2,3,5,7,11,13,17,19。
 * (3)显示array1的内容。
 * (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。
 * (5)打印出array1。
 *
 * @Author yao
 * @Create 2024/4/14 下午12:15
 * @Version 1.0
 */
public class ArrayExer04 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 7, 11, 13, 17, 19};
        String arr1Str = "arr1: [";
        for (int i = 0; i < arr1.length; i++) {
            arr1Str += arr1[i] +(i == arr1.length - 1 ? "]" : ", ");
        }
        System.out.println(arr1Str);
        String arr2Str = "arr2: [";
        // arr2 赋值 arr1，引用的是同一块堆空间的地址
        int[] arr2 = arr1;
        // 重新开辟出来一块堆空间
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr3.length; i++) {
            // 赋值
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if(i % 2 == 0){
                arr2[i] = i;
            }
            arr2Str += arr2[i] +(i == arr2.length - 1 ? "]" : ", ");
        }
        System.out.println(arr2Str);
        System.out.println("arr1 = " + arr1); // [I@3feba861
        System.out.println("arr2 = " + arr2); // [I@3feba861
        System.out.println("arr3 = " + arr3); // [I@5b480cf9
    }
}
