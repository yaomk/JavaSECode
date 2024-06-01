package com.atguigu05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest2
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 下午5:26
 * @Version 1.0
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 test = new ValueTransferTest2();
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ", n = " + n);
        //交换两个变量的值
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m = " + m + ", n = " + n);

        //调用方法
        test.swap(m, n);
        System.out.println("m = " + m + ", n = " + n);
        swap1(m, n);
        System.out.println("m = " + m + ", n = " + n);
    }
    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
    public static void swap1(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
