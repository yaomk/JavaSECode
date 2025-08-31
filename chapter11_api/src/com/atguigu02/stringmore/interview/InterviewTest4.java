package com.atguigu02.stringmore.interview;

/**
 * ClassName: InterviewTest4
 * Description:
 *
 * @Author yao
 * @Create 2025/8/31 12:12
 * @Version 1.0
 */
public class InterviewTest4 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length()); // 4
        System.out.println(sb); // "null"

        StringBuffer buffer = new StringBuffer(str);
        System.out.println(buffer); // NullPointerException
    }
}
