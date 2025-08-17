package com.atguigu01.string.exer1;

/**
 * ClassName: StringTest
 * Description: 方法参数的值传递机制,String 的不可变性
 *
 * @Author yao
 * @Create 2025/7/27 16:27
 * @Version 1.0
 */
public class StringTest {
    String str = "good";
    char[] arr = {'t','e','s','t'};
    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest st = new StringTest();
        st.change(st.str, st.arr);
        System.out.println(st.str);
        System.out.println(st.arr);
    }
}
