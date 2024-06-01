package com.atguigu05.method_more._01overload;

/**
 * ClassName: OverloadTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 上午10:20
 * @Version 1.0
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest olt = new OverloadTest();
        olt.add(1,2);
        olt.add(10, 20.0);
        olt.add(2,3,4);

    }
    public void add(int i, int j) {
        System.out.println("add(int i , int j)");
    }
    public void add(double d1, double d2) {
        System.out.println("add(double i, double j)");
    }
    public void add(int i, int j, int k) {

    }
    public void add(String s1, String s2) {

    }
    public void add(int i, String s) {

    }
    public void add(String s, int i) {}

    /* 报错，形参列表相同。与形参的名、权限修饰符、返回值类型都没有关系
    public int add(int m, int n) {
        return m + n;
    }
    */
}
