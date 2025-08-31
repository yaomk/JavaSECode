package com.atguigu01.string.exer3;

import org.junit.Test;

/**
 * ClassName: StringGetCountTest
 * Description:
 * 获取一个字符串在另一个字符串中出现的次数。
 * 比如：获取 "ab" 在"abkkcadabasdabfadfqbabba"中出现的次数
 *
 * @Author yao
 * @Create 2025/7/27 16:59
 * @Version 1.0
 */
public class StringGetCountTest {
    @Test
    public void test1() {
        int count = getSubStringCount("abkkcadabasdabfadfqbabba", "ab");
        System.out.println(count);
    }
    @Test
    public void test2() {
        int count = longestCommonSubsequence("abc","ac");
        System.out.println(count);
    }
    public int getSubStringCount(String str, String substr) {
        if(str.length() < substr.length()) {
            return  0;
        }
        int count = 0;
        int index = str.indexOf(substr);
        while (index >= 0) {
            count++;
            index = str.indexOf(substr, index + substr.length());
        }
        return count;
    }

    /**
     * 最长公共子序列
     * <p>
     * 给定两个字符串{@code text1}, {@code text2}，返回这两个字符串最长公共子序列的长度，如果不存在公共子序列，返回 0.
     * @param text1 String
     * @param text2 String
     * @return int
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char ch1 = text1.charAt(i - 1), ch2 = text2.charAt(j - 1);
                if (ch1 == ch2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
