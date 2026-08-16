package com.atguigu02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileStreamTest
 * Description:
 *
 * @Author yao
 * @Create 2026/8/16 10:47
 * @Version 1.0
 */
public class FileStreamTest {
    /**
     * 需求：复制一份图片 img.png，命名为 img_copy.png
     */
    @Test
    public void test1() {
        // 1. 创建相关的 File 类的对象
        File file = new File("img.png");
        File fileCopy = new File("img_copy.png");
        // 2. 创建相关的字节流
        FileInputStream fr = null;
        FileOutputStream fw = null;
        try {
            fr = new FileInputStream(file);
            fw = new FileOutputStream(fileCopy);

            // 3. 数据的读入和写出
            byte[] buffer = new byte[1024]; // 1kb
            int len = fr.read(buffer); // 记录每次读入到buffer中字节的个数
            while (len != -1) {
                fw.write(buffer, 0, len);
                len = fr.read(buffer);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭资源
            try {
                if (fr != null)
                    fr.close();
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 需求：复制一份hello.txt，命名为 hello_copy.txt
     * 结论：可以使用字节流实现文本文件的复制
     */
    @Test
    public void test2() {
        // 1. 创建相关的 File 类的对象
        File file = new File("hello.txt");
        File fileCopy = new File("hello_copy.txt");
        // 2. 创建相关的字节流
        FileInputStream fr = null;
        FileOutputStream fw = null;
        try {
            fr = new FileInputStream(file);
            fw = new FileOutputStream(fileCopy);

            // 3. 数据的读入和写出
            byte[] buffer = new byte[5];
            int len = fr.read(buffer); // 记录每次读入到buffer中字节的个数
            while (len != -1) {
                fw.write(buffer, 0, len);
                System.out.println(new String(buffer, 0, len));// 直接打印时，中文会出现乱码（utf8编码下，一个字母/数字为一个字节，一个中文为三个字节）
                len = fr.read(buffer);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭资源
            try {
                if (fr != null)
                    fr.close();
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
