package com.atguigu02.project;

import java.util.Scanner;

/**
 * ClassName: TestScanner
 * Description: scanner next()、nextLine()、hasNext()、hasNextLine()测试
 * 当通过键盘输入数据时，会存入缓存区等待读取，直到遇到相应的空白符时才会结束；
 *
 * @Author yao
 * @Create 2024/6/30 上午10:27
 * @Version 1.0
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        next()
            使用next方法记住两点就好了：
            有效字符前的空格会忽略；
            有效字符遇到空白符停止录入；
         */

        /*
        nextLine()
            nextLine方法只需要记住一点：
            回车符之前的所有字符都可以获取到；
         */

        /*
        一、hasNext()与hasNextLine()的区别？
            1、hasNext()方法会判断接下来是否有非空字符.如果有,则返回true,否则返回false
            2、hasNextLine() 方法会根据行匹配模式去判断接下来是否有一行(包括空行),如果有,则返回true,否则返回false
         */
        System.out.println("请输入：");
        while (scan.hasNextLine()) {
            //String s1 = scan.nextLine();
            String s1 = scan.nextLine();
            System.out.println("s1 = " + s1);
            if (s1.equals("1234")) {
                break;
            }
        }

        // 先调用next再调用nextLine，分别各输出一句话。
        System.out.println("请输入：今晚月色真美");
        String str1 = scan.next(); // 输入：今晚月色真美
        System.out.println(str1);

        //scan.nextLine(); // 释放掉缓冲区的回车符
        System.out.println("请输入：风也温柔");
        String str2 = scan.nextLine(); // 输入：风也温柔，无法输入。
        System.out.println(str2);
        /* 原因分析：
            其实就是当输入完“今晚月色真美”后
            我们又输入了一个回车“\n”输出了结果，
            因为next读取到回车就结束了，
            所以这个回车符就一直在缓存中存在，
            直到nextLine需要输入时，
            直接遇到这个回车符结束输入；
         */
        /*如何解决：
        把这个回车符通过一个 nextLine 给释放掉就可以了
        scan.nextLine()
         */
        scan.close();
    }
}
