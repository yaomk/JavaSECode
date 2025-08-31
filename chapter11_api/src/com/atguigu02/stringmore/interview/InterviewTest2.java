package com.atguigu02.stringmore.interview;

/**
 * ClassName: InterviewTest2
 * Description:
 *
 * @Author yao
 * @Create 2025/8/31 12:02
 * @Version 1.0
 */
public class InterviewTest2 {
    public static void main(String[] args) {
        String text = new String("java");
        StringBuffer buffer = new StringBuffer("java");

        stringReplace(text);
        bufferReplace(buffer);
        System.out.println(text + "," + buffer); // java,javac
    }

    public static void stringReplace(String text) {
        text = text.replace("j", "i");
    }

    public static void bufferReplace(StringBuffer text ) {
        text.append("c");
        text = new StringBuffer("hello");
        text.append("world!");
    }
}
