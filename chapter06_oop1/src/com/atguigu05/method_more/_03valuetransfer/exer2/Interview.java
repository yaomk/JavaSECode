package com.atguigu05.method_more._03valuetransfer.exer2;

/**
 * ClassName: Interview
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 下午6:11
 * @Version 1.0
 */
public class Interview {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b); //需要在method方法被调用之后，仅打印出a=100，b=200
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void method(int a, int b) {
        a*=10;
        b*=20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        //直接退出，终止当前运行的jvm
        System.exit(0);
    }
}
