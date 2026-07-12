package com.atguigu01.file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: FileMethodsTest
 * Description:
 *
 * @Author yao
 * @Create 2026/7/12 09:52
 * @Version 1.0
 */
public class FileMethodsTest {
    /*
    获取文件和目录基本信息
    public String getName(): 获取文件/目录的名称
    public String getPath(): 获取文件/目录的路径
    public String getAbsolutePath(): 获取文件/目录的绝对路径
    public String getParent(): 获取文件/目录的上级目录路径，若无，返回 null
    public long length(): 获取文件的长度（即：字节数），不能获取目录的长度
    public long lastModified(): 获取文件/目录的最后修改时间，毫秒值
     */
    @Test
    public void test1() {
        File file = new File("/test.txt");
        System.out.println(file.getName()); // test.txt
        System.out.println(file.getPath()); // \test.txt
        System.out.println(file.getAbsolutePath()); // E:\test.txt
        System.out.println(file.getParent()); // \
        System.out.println(file.length()); // 0
        System.out.println(file.lastModified()); // 0
    }

    @Test
    public void test3() {
        File file = new File("File类的使用.md");
        System.out.println(file.getName()); // File类的使用.md
        System.out.println(file.getPath()); // File类的使用.md
        System.out.println(file.getAbsolutePath()); // E:\javacode\JavaSECode\chapter15_io\File类的使用.md
        System.out.println(file.getParent()); // null
        System.out.println(file.length()); // 0
        System.out.println(file.lastModified()); // 0
    }

    @Test
    public void test4() {
        File file = new File("E:\\javacode\\JavaSECode\\chapter15_io\\src\\com\\atguigu01\\file\\File类的使用.md");
        System.out.println(file.getName()); // File类的使用.md
        System.out.println(file.getPath()); // E:\javacode\JavaSECode\chapter15_io\src\com\atguigu01\file\File类的使用.md
        System.out.println(file.getAbsolutePath()); // E:\javacode\JavaSECode\chapter15_io\src\com\atguigu01\file
        // \File类的使用.md
        System.out.println(file.getParent()); // E:\javacode\JavaSECode\chapter15_io\src\com\atguigu01\file
        System.out.println(file.length()); // 796
        System.out.println(file.lastModified()); // 1783821134755
    }

    @Test
    public void test5() {
        File file = new File("E:\\javacode\\JavaSECode\\chapter15_io\\src\\com\\atguigu01\\file");
        System.out.println(file.getName()); // file
        System.out.println(file.getPath()); // E:\javacode\JavaSECode\chapter15_io\src\com\atguigu01\file
        System.out.println(file.getAbsolutePath()); // E:\javacode\JavaSECode\chapter15_io\src\com\atguigu01\file
        System.out.println(file.getParent()); // E:\javacode\JavaSECode\chapter15_io\src\com\atguigu01
        System.out.println(file.length()); // 0
        System.out.println(file.lastModified()); // 1783821134755
    }

    /*
    列出目录的下一级
    public String[] list(): 返回一个 String 数组，表示该 File 目录中的所有子文件或目录
    public File[] listFiles(): 返回一个 File 数组，表示该 File 目录中的所有子文件或目录
     */
    @Test
    public void test6() {
        File file = new File("E:\\javacode\\JavaSECode\\chapter15_io\\src\\com\\atguigu01\\file");
        String[] fileStrArr = file.list();
        for (String s : fileStrArr) {
            System.out.println(s);
        }

        System.out.println();
        File[] fileArr = file.listFiles();
        for (File s : fileArr) {
            System.out.println(s.getPath());
        }

    }

    /*
    public boolean renameTo(File dest): 把文件重名为指定的文件路径
    file1.renameTo(file2): 尝试将 file1 重命名为 file2，成功返回 true，否则返回 false
    要想此方法执行成功，返回 true，要求：
    file1 必须存在，且 file2 必须不存在，且 file2 所在的文件目录需要存在
     */
    @Test
    public void test7() {
        File file1 = new File("hello.txt");
        File file2 = new File("/abc.txt");
        boolean b = file1.renameTo(file2);
        System.out.println(b ? "成功" : "失败");
    }
}
