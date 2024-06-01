package com.atguigu05.method_more._03valuetransfer.exer2;

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
        MyArrays myArrs = new MyArrays();
        int[] arr = {4,3,2,1};
        System.out.println("最大值为：" + myArrs.getMax(arr));
        System.out.println("最小值为：" + myArrs.getMin(arr));
        System.out.println("总和为：" + myArrs.getSum(arr));
        System.out.println("平均值为：" + myArrs.getAvg(arr));

        System.out.print("排序前的数组：");
        myArrs.print(arr);
        myArrs.sort(arr);
        System.out.print("排序后的数组：");
        myArrs.print(arr);
        myArrs.reverse(arr);
        System.out.print("反转后的数组：");
        myArrs.print(arr);

        int target = 3;
        System.out.println("要查找的元素：" + target + "，在数组中的索引为：" + myArrs.linearSearch(arr, 3));

        myArrs.sort(arr, "asc");
        myArrs.print(arr);

    }
}
