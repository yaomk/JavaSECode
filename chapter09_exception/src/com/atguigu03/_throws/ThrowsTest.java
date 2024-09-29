package com.atguigu03._throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: ThrowsTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/27 17:32
 * @Version 1.0
 */
public class ThrowsTest {
    public static void main(String[] args) {
        method3();
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("D:\\javacode\\hello2.txt");// 可能报错：FileNotFoundException
        FileInputStream fis = new FileInputStream(file);// 可能报：IOException
        int data = fis.read();// 可能报：IOException
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();// 可能报：IOException
        }
        fis.close();
    }

    public static void method2() throws IOException {
        method1();
    }

    public static void method3() {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
