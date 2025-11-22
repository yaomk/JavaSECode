package com.atguigu05.other;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * ClassName: OtherAPITest
 * Description:
 *
 * @Author yao
 * @Create 2025/11/22 11:28
 * @Version 1.0
 */
public class OtherAPITest {
    @Test
    public void test1() {
        long l = System.currentTimeMillis();
        System.out.println("当前的时间戳：" + l);
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion：" + javaVersion);
        String javaHome = System.getProperty("java.home");
        System.out.println("javaHome：" + javaHome);
        String osName = System.getProperty("os.name");
        System.out.println("osName：" + osName);
        String osVersion = System.getProperty("os.version");
        System.out.println("osVersion：" + osVersion);
        String userName = System.getProperty("user.name");
        System.out.println("userName：" + userName);
        String userHome = System.getProperty("user.home");
        System.out.println("userHome：" + userHome);
        String userDir = System.getProperty("user.dir");
        System.out.println("userDir：" + userDir);
    }

    @Test
    public void test2() {
        Runtime runtime = Runtime.getRuntime();
        // 获取虚拟机初始化时堆内存总量
        long initialMemory = runtime.totalMemory();
        // 获取虚拟机最大堆内存总量
        long maxMemory = runtime.maxMemory();
        System.out.println("总内存：" + initialMemory / 1024 / 1024 * 64 + "MB");
        System.out.println("总内存：" + maxMemory / 1024 / 1024 * 4 + "MB");
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long freeMemory = runtime.freeMemory();
        System.out.println("空闲内存：" + freeMemory / 1024 / 1024 + "MB");
        System.out.println("已用内存：" + (initialMemory - freeMemory) / 1024 / 1024 + "MB");
    }

    @Test
    public void test3() {
        // 技巧：Math.floor(x + 0.5)
        System.out.println(Math.round(12.3)); // 12
        System.out.println(Math.round(12.6)); // 13
        System.out.println(Math.round(12.5)); // 13
        System.out.println(Math.round(-12.3)); // -12
        System.out.println(Math.round(-12.6)); // -13
        System.out.println(Math.round(-12.5)); // -12

        System.out.println(Math.pow(2, 8)); // 256.0
        System.out.println(Math.sqrt(256)); // 16.0
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.random());
    }

    @Test
    public void test4() {
        // long bigNum = 12345678912344556777834L;
        BigInteger b1 = new BigInteger("12345678912344556777834");
        BigInteger b2 = new BigInteger("12344556777123456789834");
        System.out.println(b1.add(b2));
    }

    @Test
    public void test5() {
        double dou1 = 0.1;
        double dou2 = 0.2;
        System.out.println(dou1 + dou2); // 精度丢失 0.30000000000000004
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2)); // 0.3
        System.out.println(
                new BigDecimal("10").divide(
                        new BigDecimal("3"), 10, BigDecimal.ROUND_HALF_UP
                )
        ); // 3.3333333333
    }

    @Test
    public void test6() {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);

        int j = random.nextInt(10); // 随机获取[0, 10)范围内的整数
        System.out.println(j);
    }
}
