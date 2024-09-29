package com.atguigu01.throwable;

/**
 * ClassName: ErrorTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/25 11:14
 * @Version 1.0
 */
public class ErrorTest {
    public static void main(String[] args) {
        //举例1： 栈内存溢出的错误 StackOverflowError
        //main(args);

        // 举例2：堆空间内存溢出 OutOfMemoryError：Java head space
        // run - 编辑配置 - jvm 选项配置 - 输入-Xms10m -Xmx10m 设置jvm堆空间初始化内存10m，堆空间最大内存10m
        byte[] arr = new byte[1024 * 1024 * 100]; // 100MB
    }
}
