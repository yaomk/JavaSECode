package com.atguigu04.inputstreamreader;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * ClassName: InputStreamReaderTest
 * Description:
 *
 * @Author yao
 * @Create 2026/9/27 11:19
 * @Version 1.0
 */
public class InputStreamReaderTest {
    @Test
    public void test1() {
        // 创建 File 对象
        File file = new File("hello.txt");
        try (
                // 创建流对象
                FileInputStream inputStream = new FileInputStream(file);
                // 此时使用的是IDEA默认的utf8的字符集
                // InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                // 显示的指定字符集InputStreamReader(in, cs)
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        ) {
            // 读入操作
            char[] buffer = new char[1024];
            int len;
            while ((len = inputStreamReader.read(buffer)) != -1) {
                String str = new String(buffer, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        // 创建 File 对象
        File file = new File("hello.txt");
        try (
                // 创建流对象
                FileInputStream inputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.US_ASCII);
                BufferedReader buff = new BufferedReader(inputStreamReader);
        ) {
            // 读入操作
            char[] cBuffer = new char[1024];
            int len;
            while ((len = buff.read(cBuffer)) != -1) {
                System.out.println(new String(cBuffer, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        try (
                // 读取：字节流 -> InputStreamReader(UTF-8) -> 字符流
                BufferedReader br =
                        new BufferedReader(new InputStreamReader(
                                new FileInputStream(new File("hello.txt")), "utf8")
                        );
                //  // 写出：字符流 -> OutputStreamWriter(GBK) -> 字节流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(new File("hello_copy.txt")), "GBK")
                );
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("复制完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 需求：将 gbk 格式的文件转化为 utf-8 格式的文件存储
     */
    @Test
    public void test4() {
        // 1. 造文件
        File originFile = new File("hello_copy.txt");
        File targetFile = new File("hello_copy_utf8.txt");
        // 2. 造流
        try (
                // InputStreamReader 参数2对应的石解码集，必须与文件的编码一致
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(originFile), "GBK"));
                // OutputStreamWriter 参数2指明内存中的字符串存储到文件中的字节过程中使用到的编码集
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(targetFile), "UTF" +
                        "-8"))
        ) {
            // 3. 读写过程
            // String line;
            // 使用 readLine 读取一行数据，使用 newLine 写出一个换行符
            // while((line = br.readLine()) != null) {
            //     bw.write(line);
            //     bw.newLine();
            // }
            char[] cBuffer = new char[5];
            int len;
            // 使用 read(char[] cbuf) 读取
            while ((len = br.read(cBuffer)) != -1) {
                bw.write(cBuffer, 0, len);
            }
            System.out.println("转换完成！");
            // 4. 关闭资源
            // try-with-resource 中，会自动的调用 close 方法
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
