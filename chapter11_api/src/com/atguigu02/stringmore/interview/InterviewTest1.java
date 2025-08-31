package com.atguigu02.stringmore.interview;

/**
 * ClassName: InterviewTest1
 * Description:
 *
 * @Author yao
 * @Create 2025/8/31 11:55
 * @Version 1.0
 */
public class InterviewTest1 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");

        operate(a, b);

        System.out.println(a + "," + b); //ABx,B

    }
    public static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
        y.append('x');
    }
}
