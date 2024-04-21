package com.atguigu3.search_sort.exer2;

/**
 * ClassName: LinearSearchTest
 * Description:
 * 定义数组：int[] arr1 = {34,54,3,2,65,7,34,5,76,34,67}
 * 查找元素5是否在上述数组中出现过？如果出现过，输出对应的索引值
 *
 * 顺序查找：
 * 优点：算法简单
 * 缺点：执行效率低。执行的时间复杂度O(n)
 *
 * @Author yao
 * @Create 2024/4/21 上午10:45
 * @Version 1.0
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr1 = {34,54,3,2,65,7,34,5,76,34,67};
        int index = -1;
        int target = 5;
        // 线性查找
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == target) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("未找到 target = " + target);
        } else{
            System.out.println("target = " + target + ", 的索引值为 " + index);
        }
    }
}
