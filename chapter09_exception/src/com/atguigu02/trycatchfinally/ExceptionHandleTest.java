package com.atguigu02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: ExceptionHandleTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/25 16:54
 * @Version 1.0
 */
public class ExceptionHandleTest {
    @Test
    public void test1() {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("出现了 InputMismatchException 异常");
        } catch (NullPointerException e) {
            System.out.println("出现了 NullPointerException 异常");
        } catch (RuntimeException e) {
            System.out.println("出现了 RuntimeException 异常");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("异常处理结束，代码继续执行。。。");
    }

    @Test
    public void test2() {
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str)); // NumberFormatException
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("代码继续执行。。。");
    }

    @Test
    public void test3() {
        try {
            File file = new File("D:\\javacode\\hello1.txt"); // 可能报错：FileNotFoundException
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read(); // 可能报：IOException
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read(); // 可能报：IOException
            }
            fis.close(); // 可能报：IOException
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println();
        }
        System.out.println("文件读取结束。");
    }
}
