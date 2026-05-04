package com.atguigu05.map;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: PropertiesTest
 * Description:
 *
 * @Author yao
 * @Create 2026/5/4 09:34
 * @Version 1.0
 */
public class PropertiesTest {
    public static void main(String[] args) {
        File file = new File("info.properties");
        System.out.println(file.getAbsoluteFile()); // 工程（JavaSECode）根目录下的info.properties
    }

    @Test
    public void test() {
        // 方式1：数据和代码耦合度高，如果修改的话，需要重写的编译代码、打包发布，繁琐。
        // 数据：
        String name = "Tom";
        String psw = "123456";

        System.out.println(name + "的密码为: " + psw);
    }

    @Test
    public void test2() throws IOException { // 注意：因为涉及到流的操作，为了确保流能够正常的关闭，建议使用try-catch-finally进行流资源的关闭
        // 方式2：数据与代码解耦合，数据保存在文件中，代码调用文件数据，修改数据，不需要修改代码，也不需要重新编译、打包发布。
        File file = new File("info.properties"); // 注意：文件需要提前创建好
        System.out.println(file.getAbsoluteFile()); // 获取文件的绝对路径，当前模块（chapter12_collection_map）下的info.properties
        FileInputStream fileInputStream = new FileInputStream(file); // 创建文件输入流
        Properties properties = new Properties();
        properties.load(fileInputStream); // 加载流中的文件中的数据
        // 读取数据
        String name = properties.getProperty("name");
        String psw = properties.getProperty("password");
        System.out.println(name + "的密码为: " + psw);
        fileInputStream.close();
    }
}
