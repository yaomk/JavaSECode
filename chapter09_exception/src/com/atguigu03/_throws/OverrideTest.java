package com.atguigu03._throws;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: OverrideTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/27 17:47
 * @Version 1.0
 */
public class OverrideTest {
    public static void main(String[] args) {
        Father f = new Son();
        try {
            f.method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Number num = f.method4();
    }
}

class Father {
    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() {
    }

    ;

    public void method3() {
    }

    ;

    public Number method4() {
        return null;
    }
}

class Son extends Father {
    @Override
    public void method1() throws FileNotFoundException {
    }

    // 被重写的方法如果没有抛出异常，则子类重写的方法也不能使用throws抛出异常
    //@Override
    //public void method2() throws IOException {
    //    super.method2();
    //}

    @Override
    public Integer method4() {
        return null;
    }
}
