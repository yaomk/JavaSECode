package com.atguigu3.search_sort.exer2;

import java.util.Scanner;

/**
 * ClassName: BinarySearchTest
 * Description:二分法查找
 * 定义数组：int[] arr = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
 * 查找元素5是否在上述数组中出现过？如果出现过，输出对应的索引值
 *
 * 二分法查找
 * 优点：执行效率高。执行的时间复杂度 O(logN)
 *
 * @Author yao
 * @Create 2024/4/21 上午10:54
 * @Version 1.0
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        Scanner scannerIns = new Scanner(System.in);
        System.out.print("请输入要查找的元素：");
        // 目标元素
        int target = scannerIns.nextInt();
        // 目标元素的默认索引
        int targetIndex = -1;
        int preIndex = 0; // 默认的起始索引
        int postIndex = arr.length - 1; // 默认的结束索引
        while (preIndex <= postIndex) {
            // 获取中间元素的索引值
            int middleIndex = (preIndex + postIndex) / 2;
            if (target == arr[middleIndex]) {
                targetIndex = middleIndex;
                break;
            } else if (target < arr[middleIndex]) {
                postIndex = middleIndex - 1;
            } else {
                preIndex = middleIndex + 1;
            }
        }
        System.out.println("目标元素：" + target + ", 索引为 " + targetIndex);
        scannerIns.close();
    }
}
