package com.atguigu12.wrapper.interview;

/**
 * ClassName: InterviewTest2
 * Description:
 *
 * @Author yao
 * @Create 2024/9/9 11:23
 * @Version 1.0
 */
public class InterviewTest2 {
    public static void main(String[] args) {
        int i = 10;
        double d = 10.2;
        System.out.println(i == d); // false

        Integer i1 = 10;
        Double d1 = 10.2;
        //System.out.println(i1 == d1); // 编译报错，== 比较引用类型地址，必须是相同类型，或子父类的关系

        Integer m = 1000;
        double n = 1000;
        System.out.println(m == n); // true， 优先拆箱，转为基本类型

        Integer x = 1000;
        int y = 1000;
        System.out.println(x == y); // true
    }
}
