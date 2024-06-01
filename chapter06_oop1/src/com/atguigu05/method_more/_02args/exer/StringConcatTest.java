package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: StringConcatTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 上午11:43
 * @Version 1.0
 */
public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatTest sct = new StringConcatTest();
        String info = sct.concat("-", "hello", "world");
        System.out.println(info);

        System.out.println(sct.concat("/", "hello"));
        System.out.println(sct.concat("-"));
    }

    // n 个字符串进行拼接，每一个字符串之间使用某个字符进行分割，如果没有传入字符串，那么返回空字符串""
    public String concat(String operator, String... strs) {
        String result = "";
        for(int i = 0; i < strs.length; i++) {
            if(i == 0) {
                result += strs[i];
            } else {
                result += operator + strs[i];
            }
        }
        return result;
    }
}
