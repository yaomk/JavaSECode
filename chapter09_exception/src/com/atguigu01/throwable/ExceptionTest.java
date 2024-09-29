package com.atguigu01.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: ExceptionTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/25 11:43
 * @Version 1.0
 */
public class ExceptionTest {
    /**
     * ArrayIndexOutOfBoundsException 数字角标越界
     */
    @Test
    public void test1() {
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    /**
     * NullPointerException 空指针异常
     */
    @Test
    public void test2() {
        String str = "hello";
        str = null;
        System.out.println(str.toString());

        int[][] arr = new int[10][];
        System.out.println(arr[0][0]);
    }

    /**
     * ClassCastException 类型强转异常
     */
    @Test
    public void test3() {
        Object obj = new String();
        String str = (String) obj;
        Date date = (Date) obj;
    }

    /**
     * NumberFormatException 数字格式异常
     */
    @Test
    public void test4() {
        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i);
        str = "abc";
        System.out.println(Integer.parseInt(str));
    }

    /**
     * InputMismatchException 输入格式不匹配异常
     */
    @Test
    public void test5() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close();
    }

    /**
     * ArithmeticException 算术异常
     */
    @Test
    public void test6() {
        int num = 10;
        System.out.println(num / 0);
    }

//    **************** 以上是运行时异常，以下是编译时异常 *************   //

    /**
     * ClassNotFoundException 未找到类异常
     */
    @Test
    public void test7() {
        //Class clz = Class.forName("java.lang.String");
    }

    /**
     * FileNotFoundException 未找到文件异常
     */
    @Test
    public void test8() throws FileNotFoundException, IOException {
        File file = new File("D:\\nginx.conf");
        FileInputStream fis = new FileInputStream(file); // 可能报 FileNotFoundException
        int data = fis.read(); // 可能报：IOException
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read(); // 可能报：IOException
        }
        fis.close(); // 可能报：IOException
    }
}
