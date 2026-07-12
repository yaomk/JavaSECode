package com.atguigu01.file.exer2;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Exer02
 * Description: 判断指定目录下是否有后缀名为.zip的文件，如果有，就输出该文件名称
 *
 * @Author yao
 * @Create 2026/7/12 10:57
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {
        File file = new File("../");
        System.out.println(file.getAbsoluteFile()); // E:\javacode\JavaSECode\..
        try {
            System.out.println(file.getCanonicalPath()); // E:\javacode
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 方式1：
        String[] list = file.list();
        for (String s : list) {
            if (s.endsWith(".zip")) {
                System.out.println(s);
            }
        }
        System.out.println("-------------");
        // 方式2：
        File[] files = file.listFiles((dir, name) -> name.endsWith(".zip"));
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
