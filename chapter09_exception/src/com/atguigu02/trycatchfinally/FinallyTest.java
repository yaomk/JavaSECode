package com.atguigu02.trycatchfinally;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: FinallyTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/27 11:01
 * @Version 1.0
 */
public class FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("D:\\javacode\\hello.txt");// 可能报错：FileNotFoundException
            fis = new FileInputStream(file);// 可能报：IOException
            int data = fis.read();// 可能报：IOException
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();// 可能报：IOException
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 将流资源的关闭操作放在 finally 中
            try {
                // 避免空指针异常
                if (fis != null) {
                    fis.close();// 可能报：IOException
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
