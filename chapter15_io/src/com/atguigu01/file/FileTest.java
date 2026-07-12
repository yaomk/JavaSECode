package com.atguigu01.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileTest
 * Description:
 *
 * @Author yao
 * @Create 2026/7/12 09:17
 * @Version 1.0
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println(file.getAbsoluteFile()); // E:\javacode\JavaSECode\test.txt
    }

    /*
    public File(String pathname): 以 pathname 为路径创建 File 对象，可以是绝对路径或者相对路径
    相对路径：
        在 IDE 中，如果使用单元测试方法，相对于当前的 module 模块
        如果是使用main方法，相对于当前的 project 项目
     */
    @Test
    public void test() {
        File file = new File("D:\\a.txt");
        System.out.println(file.getAbsoluteFile());

        File file1 = new File("test.txt");
        System.out.println(file1.getAbsoluteFile()); // E:\javacode\JavaSECode\chapter15_io\test.txt

        File file2 = new File("/test.txt");
        System.out.println(file2.getAbsoluteFile()); // E:\test.txt

        File file3 = new File("./test.txt");
        System.out.println(file3.getAbsoluteFile()); // E:\javacode\JavaSECode\chapter15_io\.\test.txt

        File file4 = new File("../test");
        System.out.println(file4.getAbsoluteFile()); // E:\javacode\JavaSECode\chapter15_io\..\test
        try {
            System.out.println(file4.getCanonicalFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    public File(String parent, String child): 以 parent 为父路径，child 为子路径创建 File 对象
    public File(File parent, String child): 根据一个父 File 对象和一个子文件路径创建 File 对象
    参数1：一定是一个文件目录
    参数2： 可以是一个文件，也可以是一个目录
     */
    @Test
    public void test2() {
        File file = new File("G:/test", "test.txt");
        System.out.println(file.getAbsoluteFile()); // G:\test\test.txt

        File file1 = new File("../test", "test");
        System.out.println(file1.getAbsoluteFile()); // E:\javacode\JavaSECode\chapter15_io\..\test\test

        File file2 = new File(file1, "abc.txt");
        System.out.println(file2.getAbsoluteFile()); // E:\javacode\JavaSECode\chapter15_io\..\test\test\abc.txt

    }
}
