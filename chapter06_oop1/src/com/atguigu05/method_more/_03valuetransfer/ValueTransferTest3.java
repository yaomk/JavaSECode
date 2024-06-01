package com.atguigu05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest3
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 下午5:35
 * @Version 1.0
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        ValueTransferTest3 test = new ValueTransferTest3();
        Data d1 = new Data();
        d1.m = 10;
        d1.n = 20;
        System.out.println("d1.m = " + d1.m + ", d1.n = " + d1.n);

        //操作1：
        //int temp = d1.m;
        //d1.m = d1.n;
        //d1.n = temp;
        //System.out.println("d1.m = " + d1.m + ", d1.n = " + d1.n);

        //操作2：
        test.swap(d1);
        System.out.println("d1.m = " + d1.m + ", d1.n = " + d1.n);

    }
    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}
class Data{
    int m;
    int n;
}
