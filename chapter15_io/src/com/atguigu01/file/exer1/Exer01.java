package com.atguigu01.file.exer1;

import java.io.File;

/**
 * ClassName: Exer01
 * Description: 创建一个与 hello.txt 文件在相同目录下的另外一个名为 world.txt 的文件
 *
 * @Author yao
 * @Create 2026/7/12 10:49
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {
        File file1 = new File("hello.txt");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getParent()); // null
        File file2 = new File(file1.getAbsoluteFile().getParent(), "world.txt");
        System.out.println(file2.getAbsoluteFile());
    }
}
