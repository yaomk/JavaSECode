package com.atguigu12.wrapper.interview;

/**
 * ClassName: InterviewTest3
 * Description:
 *
 * @Author yao
 * @Create 2024/9/9 11:35
 * @Version 1.0
 */
public class InterviewTest3 {
    public static void main(String[] args) {
        Object o1 = true ? new Integer(1) : Double.valueOf(2.0);
        System.out.println(o1);// 1.0 三目运算符，需要确保两个分支返回的数据类型是兼容的，所以，分支一自动拆箱后自动类型提升为 double
        System.out.println(o1.getClass()); // class java.lang.Double

        Object o2;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2.0);
        }
        System.out.println(o2); // 1
    }
}
