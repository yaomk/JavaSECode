package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedReaderWriterTest
 * Description:
 * 测试BufferedReader, BufferedWriter 的使用
 *
 * @Author yao
 * @Create 2026/8/22 13:42
 * @Version 1.0
 */
public class BufferedReaderWriterTest {
    /**
     * 使用 BufferedReader 将 info.txt的内容显示在控制台中
     */
    @Test
    public void test() {
        File file = new File("info.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            char[] cBuffer = new char[5];
            int len; // 记录每次读入到 cBuffer 中的字符个数
            while ((len = br.read(cBuffer)) != -1) {
                // 方式1：
                // for(int i = 0; i < len; i++) {
                //     System.out.print(cBuffer[i]);
                // }
                // 方式2：
                System.out.print(new String(cBuffer, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * String readLine() ：每次读取一行文本中的数据。返回的字符串是不包含换行符的。
     * 当返回的为 null 时，代表到达流末尾
     */
    @Test
    public void test2() {
        File file = new File("info.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String data;
            while ((data = br.readLine()) != null) {
                System.out.print(data + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        File file = new File("info.txt");
        File file1 = new File("info_copy.txt");
        try (
                BufferedReader br = new BufferedReader(new FileReader(file));
                BufferedWriter bw = new BufferedWriter(new FileWriter(file1))
        ) {
            String data;
            while ((data = br.readLine()) != null) {
                bw.write(data);
                bw.newLine(); // 表示换行操作
                /*
                  BufferedWriter 会在 close() 时自动刷出缓冲区，且 try-with-resources 会确保 close() 被调用。
                  频繁 flush() 会降低 IO 效率，通常只在需要立即写入时（如交互式通信）才显式调用。建议删除这行。
                 */
                bw.flush(); // 刷新的方法。每当调用此方式时，就会主动将内存中的数据写出到磁盘文件中。
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





