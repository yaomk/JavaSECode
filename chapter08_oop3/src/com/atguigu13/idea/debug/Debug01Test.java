package com.atguigu13.idea.debug;

/**
 * ClassName: Debug01Test
 * Description:
 *
 * @Author yao
 * @Create 2024/9/12 11:42
 * @Version 1.0
 */
public class Debug01Test {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ", n = " + n);
        // 行内断点
        swap(m, n);
        System.out.println("m = " + m + ", n = " + n);

        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr);
        char[] charArr = {'a', 'b', 97};
        System.out.println(charArr);
    }

    public static void swap(int m, int n) {
        int temp = n;
        n = m;
        m = temp;
    }
}
