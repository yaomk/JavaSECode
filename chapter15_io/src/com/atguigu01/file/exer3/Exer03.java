package com.atguigu01.file.exer3;

import java.io.File;

/**
 * ClassName: Exer03
 * Description:
 * 1.遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件。
 * 2. 计算指定我呢见目录占用空间的大小
 *
 * @Author yao
 * @Create 2026/7/12 11:06
 * @Version 1.0
 */
public class Exer03 {
    public static void main(String[] args) {
        File file = new File("E:\\javacode\\JavaSECode\\chapter15_io");
        printFileName(file);
        System.out.println(
                "------------------------------------------------------------------------------------------");
        System.out.println(getFileSize(file));

    }

    public static void printFileName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                printFileName(f);
            }
        }
    }

    public static long getFileSize(File file) {
        long size = 0;
        if (file.isFile()) {
            size += file.length();
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                size += getFileSize(f);
            }
        }
        return size;
    }
}
