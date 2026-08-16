package com.atguigu02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: FileReaderWriterTest
 * Description:
 *
 * @Author yao
 * @Create 2026/8/9 11:34
 * @Version 1.0
 */
public class FileReaderWriterTest {
    /*
    需求：读取 hello.txt 中的内容，显示在控制台上。
    注意：异常使用 throws 的方式处理，不太合适，（如果出现异常，直接throws，会导致流未关闭）应使用try catch finally
     */
    @Test
    public void test1() throws IOException {
        // 1. 创建 File 类对象，对应着 hello.txt 文件
        File file = new File("hello.txt");
        // 2. 创建输入型的字符流，用于读取数据
        FileReader fr = new FileReader(file);
        // 3. 读取数据，并显示在控制台
        int read = fr.read();
        System.out.println(read);
        System.out.println((char) read);
        while (read != -1) {
            System.out.print((char) read);
            read = fr.read();
        }
        // 4. 流资源的关闭（必须要关闭，否则会内存泄露）
        fr.close();
    }

    /*
     * 使用 try-catch-finall 的方式处理异常，确保流一定可以关闭，避免内存泄露。
     * */
    @Test
    public void test2() {
        // 1. 创建 File 类对象，对应着 hello.txt 文件
        File file = new File("hello.txt");
        // 2. 创建输入型的字符流，用于读取数据
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            // 3. 读取数据，并显示在控制台
            int data = fr.read();
            do {
                System.out.print((char) data);
            } while ((data = fr.read()) != -1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 需求：读取 hello.txt中的内容，显示在控制台上。
     * 对test2()进行优化，每次读取多个字符存放在字符数组中，减少了与磁盘交互的次数，提醒效率。
     */
    @Test
    public void test3() {
        // 1. 创建 File 类对象，对应着 hello.txt 文件
        File file = new File("hello.txt"); // hello.txt 内对应的文本："hello world! 你好 世界！"
        FileReader fr = null;
        try {
            // 2. 创建输入型的字符流，用于读取数据
            fr = new FileReader(file);

            // 3. 读取数据，并显示在控制台
            char[] cBuffer = new char[5];
            int len;
            // 流结束时返回-1
            while ((len = fr.read(cBuffer)) != -1) {
                // 遍历数组：错误的写法
                // 不能 i < cBuffer.length，每次取5个字符，最后一次只有4个字符，导致数组覆盖不全，最后一次输出" 世界！好"
                // for(int i = 0; i < cBuffer.length; i++) {
                //     System.out.print(cBuffer[i]); // hello world! 你好 世界！好
                // }
                for (int i = 0; i < len; i++) {
                    System.out.print(cBuffer[i]); // hello world! 你好 世界！
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 需求：将内存中的数据写入到指定的文件中
     */
    @Test
    public void test4() {
        // 1. 创建 File 类的对象，指明要写出的文件的名称
        File file = new File("info.txt");
        // 2. 创建输出流
        FileWriter fw = null;
        try {
            // 覆盖文件，使用的构造器：
            fw = new FileWriter(file);
            // fw = new FileWriter(file, false);
            // 在现有文件基础上，追加内容使用的构造器
            // fw = new FileWriter(file, true);
            // 3. 写出的具体过程
            // 输出的方法：write(String str) / write(char[] cdata)
            fw.write("hello  world！\n");
            fw.write("你好 世界！");
            System.out.println("输出成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭资源
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 需求：复制一份 hello.txt 文件，命名为 htllo_copy.txt
     */
    @Test
    public void test5() {
        // 1. 创建 File 对象
        File file = new File("hello.txt");
        File fileCopy = new File("hello_copy.txt");
        // 2. 创建输入、输出流
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file);
            fw = new FileWriter(fileCopy);
            char[] cBuffer = new char[5];
            int len = fr.read(cBuffer);
            while (len != -1) {
                // for (int i = 0; i < len; i++) {
                //     fw.write(cBuffer[i]);
                // }

                // fw.write(cBuffer); 错误的使用方式，最后一次写入会导致写入未覆盖的字符
                // 使用 fw.write(char[] cbuf, int fromIndex, int len)
                // 从 fromIndex 角标写入，写入长度为 len
                fw.write(cBuffer, 0, len);
                len = fr.read(cBuffer);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
     * 需求：复制一份图片 img.png，命名为 img_copy.png
     * <p>
     * 使用FileReader/FileWriter复制失败！因为字符流不适合用来处理非文本文件
     */
    @Test
    public void test6() {
        // 1. 创建 File 对象
        File file = new File("img.png");
        File fileCopy = new File("img_copy.png");
        // 2. 创建输入、输出流
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file);
            fw = new FileWriter(fileCopy);
            char[] cBuffer = new char[5];
            int len = fr.read(cBuffer);
            while (len != -1) {
                fw.write(cBuffer, 0, len);
                len = fr.read(cBuffer);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
