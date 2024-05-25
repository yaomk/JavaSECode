package com.atguigu04.example.exer4;

/**
 * ClassName: MyArraysTest
 * Description:
 *
 * @Author yao
 * @Create 2024/5/25 上午11:39
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        MyArrays arrs = new MyArrays();
        int[] arr = {4,3,2,1};
        System.out.println("最大值为：" + arrs.getMax(arr));
        System.out.println("最小值为：" + arrs.getMin(arr));
        System.out.println("总和为：" + arrs.getSum(arr));
        System.out.println("平均值为：" + arrs.getAvg(arr));

        System.out.print("排序前的数组：");
        arrs.print(arr);
        arrs.sort(arr);
        System.out.print("排序后的数组：");
        arrs.print(arr);
        arrs.reverse(arr);
        System.out.print("反转后的数组：");
        arrs.print(arr);

        int target = 3;
        System.out.println("要查找的元素：" + target + "，在数组中的索引为：" + arrs.linearSearch(arr, 3));

    }
}
