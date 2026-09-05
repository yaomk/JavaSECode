package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedStreamTest
 * Description:
 *
 * @Author yao
 * @Create 2026/8/22 11:09
 * @Version 1.0
 */
public class BufferedStreamTest {
    /**
     * 使用BufferedInputStream, BufferedOutputStream复制
     */
    @Test
    public void test1() {
        // 1. 创建相关的 File 类的对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            // 2. 创建相关的字节流、缓冲流
            File scrFile = new File("img.png");
            File destFile = new File("img_copy.png");

            // 缓冲流：处理流的一种，包裹字节流
            FileInputStream fis = new FileInputStream(scrFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            // 3. 数据的读入和写出
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            System.out.println("复制完成！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 4. 关闭资源流
            /*
             * 先关闭外层流
             *  bis.close();
             *  bos.close();
             *  再关闭内层流
             *  fis.close();
             *  fos.close();
             *  由于外层流的关闭也会自动的对内层流关闭的操作，所以可以省略对内层流的关闭。
             * */
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
