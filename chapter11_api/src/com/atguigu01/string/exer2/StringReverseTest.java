package com.atguigu01.string.exer2;

import org.junit.Test;

/**
 * ClassName: StringReverseTest
 * Description:
 * 将一个字符串进行反转，将字符串中指定部分进行反转。
 * 如：abcdefg反转为abfedcg
 *
 * @Author yao
 * @Create 2025/7/27 16:36
 * @Version 1.0
 */
public class StringReverseTest {
    @Test
    public void test() {
        String s = "abcdefg";
        String s2 = reverseStr(s,2,5);
        System.out.println(s2);
    }
    @Test
    public void test1() {
        String s = "abcdefg";
        String s2 = reverseStr2(s,2,5);
        System.out.println(s2);
    }
    /*
    方式1：将String转为char[],针对char[]数组进行相应位置的反转，反转后将char[]转为String
     */
    public String reverseStr(String s, int fromIndex, int toIndex) {
        char[] charArray = s.toCharArray();
        for(int i = fromIndex, j = toIndex; i < j; i++,j-- ) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }
    public String reverseStr2(String s, int fromIndex, int toIndex) {
        String finalStr = s.substring(0, fromIndex);
        for(int i = toIndex; i>=fromIndex;i--) {
            finalStr += s.charAt(i);
        }
        finalStr += s.substring(toIndex+1);
        return finalStr;
    }
}
