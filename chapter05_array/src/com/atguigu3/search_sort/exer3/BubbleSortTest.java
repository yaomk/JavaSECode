package com.atguigu3.search_sort.exer3;

/**
 * ClassName: BubbleSortTest
 * Description:冒泡排序
 * 排序思想：
 * 1. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 2. 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 3. 针对所有的元素重复以上的步骤，除了最后一个。
 * 4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 *
 * @Author yao
 * @Create 2024/4/21 上午11:52
 * @Version 1.0
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // 外层循环比较n-1轮，例如只有一个元素的数组不用进入循环
        for (int i = 0; i < arr.length - 1; i++){
            // 内层循环
            for(int j = 0; j < arr.length - 1 - i; j++){
                // 如果第一个元素比第二个元素大，则交换他们的位置
                if(arr[j] > arr[j+1]){
                    Swap(arr, j, j+1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println();
        BubbleSortOptimize_1();
        System.out.println();
        System.out.println();
        BubbleSortOptimize_2();
    }
    static void Swap(int[] arr, int preIdx, int postIdx) {
        int temp = arr[preIdx];
        arr[preIdx] = arr[postIdx];
        arr[postIdx] = temp;
    }
    // 优化1：如果内层循环没有交换过位置，则说明数组已经有序，直接停止循环即可
    static void BubbleSortOptimize_1(){
        int[] arr = {34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // 内层循环是否交换过位置
        boolean flag = false;
        // 外层循环比较n-1轮，例如只有一个元素的数组不用进入循环
        for (int i = 0; i < arr.length - 1; i++){
            // 内层循环
            for(int j = 0; j < arr.length - 1 - i; j++){
                // 如果第一个元素比第二个元素大，则交换他们的位置
                if(arr[j] > arr[j+1]){
                    Swap(arr, j, j+1);
                    flag = true;
                }
            }
            // 没交换过位置直接退出循环
            if(!flag) break;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    // 记录内层循环最后一次交换位置的索引，表明从该索引后的排序已完成，不用再遍历
    // 例如 {1,2,4,3,5,6,7}，第一次外层循环，内层循环共需遍历7次。最后一次交换的索引为2，记录该索引（该索引后排序已完成）
    // 第二次外层循环，内层循环不用再遍历到 length - 1 - i;直接遍历到上次的记录索引的位置即可
    static void BubbleSortOptimize_2(){
        int[] arr = {34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int len = arr.length;
        // 内层循环最后遍历的索引值
        int lastIdx = len - 1;
        while(len > 1) {
            // 记录结束标识索引
            int flagIdx = lastIdx;
            for(int i = 0; i < lastIdx; i++) {
                if(arr[i] > arr[i+1]) {
                    Swap(arr, i, i+1);
                    // 发生交换后，将当前索引赋值标识索引
                    flagIdx = i;
                }
            }
            if(lastIdx == flagIdx) {
                break;
            } else {
                lastIdx = flagIdx;
            }
            len--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
