package com.atguigu02.stringmore.interview;

/**
 * ClassName: InterviewTest3
 * Description:
 *
 * @Author yao
 * @Create 2025/8/31 12:08
 * @Version 1.0
 */
public class InterviewTest3 {
    public static void main(String[] args) {
        String s = "BBBB";
        StringBuffer buffer = new StringBuffer("BBBB");

        change(s, buffer);
        System.out.println(s + "," + buffer); // BBBB,aaaa

    }

    public static void change(String s, StringBuffer sb) {
        s = "aaaa";
        sb.setLength(0);
        sb.append("aaaa");
    }
}
