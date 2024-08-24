package com.atguigu03.main;

/**
 * ClassName: MainTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/24 11:32
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) { // 程序的入口
        String[] arr = new String[]{"aa", "bb", "cc"};
        Main.main(arr);
    }
}

class Main {
    public static void main(String[] args) { // 看作是一个普通的静态方法
        System.out.println("Main的main()的调用");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
