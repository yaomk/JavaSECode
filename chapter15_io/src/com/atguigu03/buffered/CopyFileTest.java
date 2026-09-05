package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: CopyFileTest
 * Description:
 * 测试 FileInputStream + FileOutputStream 复制文件
 * 测试 BufferedFileInputStream + BufferedFileOutputStream 复制文件
 * 测试二者的效率。
 *
 * @Author yao
 * @Create 2026/8/22 11:30
 * @Version 1.0
 */
public class CopyFileTest {
    @Test
    public void testSpendTime() {
        long start = System.currentTimeMillis();
        String src = "C:\\Users\\void0\\Desktop\\20250915\\Gargantua_BGM.mp4";
        String dest = "C:/Users/void0/Desktop/20250915/Gargantua_BGM_copy.mp4";
        // copyFIleWithFileStream(src, dest);
        copyFIleWithBufferedStream(src, dest);
        long end = System.currentTimeMillis();
        System.out.println("复制耗时：" + (end - start) + "ms");
    }

    /**
     * 使用 FileInputStream + FileOutputStream 复制文件
     */
    public void copyFIleWithFileStream(String src, String dest) {

        File file = new File(src);
        File fileCopy = new File(dest);
        // JDK 7 新特性： try-with-resources
        try (
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(fileCopy)
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用 BufferedInputStream + BufferedOutputStream 复制文件
     */
    public void copyFIleWithBufferedStream(String src, String dest) {

        File file = new File(src);
        File fileCopy = new File(dest);
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileCopy))
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
