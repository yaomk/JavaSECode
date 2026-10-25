package com.atguigu05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ObjectInputOutputStreamTest
 * Description:
 *
 * @Author yao
 * @Create 2026/10/25 11:12
 * @Version 1.0
 */
public class ObjectInputOutputStreamTest {
    /**
     * 序列化过程：使用 ObjectOutputStream 流。
     * 将内存中的java对象保存在文件中或通过网络传输出去。
     */
    @Test
    public void test1() {
        File file = new File("object.txt");
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        ) {
            // 写出数据：即为序列化的过程
            oos.writeUTF("你好世界！\nHello world!");
            oos.flush();

            oos.writeObject("\n萨瓦迪卡");
            oos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 反序列化过程：使用 ObjectInputStream 流。
     * 将文件中的数据或网络传输过来的数据还原为内存中的java对象。
     */
    @Test
    public void test2() {
        File file = new File("object.txt");
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
        ) {
            // 读取文件中的对象（或反序列化的过程）
            String str = ois.readUTF();
            System.out.println(str);
            String str1 = (String) ois.readObject();
            System.out.println(str1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 自定义类的对象的序列化和反序列化过程
     * 序列化过程：
     */
    @Test
    public void test3() {
        File file = new File("custom.dat");
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))
        ) {
            // 写出数据即为序列化的过程
            Person personIns = new Person("Jack", 22);
            oos.writeObject(personIns);
            oos.flush();
            oos.writeObject(new Person("Rose", 22, new Account(20000)));
            oos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 自定义类反序列化过程
     */
    @Test
    public void test4() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("custom.dat"))
        ) {
            Person personIns = (Person) ois.readObject();
            System.out.println(personIns);
            Person personIns1 = (Person) ois.readObject();
            System.out.println(personIns1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
