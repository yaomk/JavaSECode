package com.atguigu13.idea.debug;

/**
 * ClassName: Debug04Test
 * Description:
 *
 * @Author yao
 * @Create 2024/9/12 15:30
 * @Version 1.0
 */
public class Debug04Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {
            //条件断点
            System.out.println(i);
        }
    }
}
