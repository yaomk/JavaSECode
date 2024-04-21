package com.atguigu3.search_sort.exer3;

/**
 * ClassName: QuickSortTest
 * Description:快速排序
 *
 * @Author yao
 * @Create 2024/4/21 下午1:17
 * @Version 1.0
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr = {34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        Quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    static void Swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void Quicksort(int[] arr, int left, int right) {
        if (right - left <= 0) return;
        // 定义左右指针
        int l = left,r = right;
        int pivot = arr[left];
        while(l < r) {
            while(l < r && arr[r] > pivot) r--;
            while(l < r && arr[l] <= pivot) l++;
            Swap(arr, l, r);
        }
        Swap(arr, l, left);
        Quicksort(arr, left, l-1);
        Quicksort(arr, l+1, right);
    }
}
