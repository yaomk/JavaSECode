package com.atguigu05.method_more._01overload;

/**
 * ClassName: InterviewTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 上午10:49
 * @Version 1.0
 */
public class InterviewTest {
    public static void main(String[] args) {
        // 重载，调用了不同的println()方法
        int[] arr = new int[]{1,2,3};
        System.out.println(arr); // 地址值

        char[] arr1 = new char[]{'a', 'b', 'c', 'e'};
        System.out.println(arr1); // abc

        boolean[] arr2 = {true, false, true};
        System.out.println(arr2); // 地址值
    }
}
