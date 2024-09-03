package com.atguigu08._interface.jdk8;

/**
 * ClassName: CompareB
 * Description:
 *
 * @Author yao
 * @Create 2024/9/3 11:23
 * @Version 1.0
 */
public interface CompareB {

    void abstractMethodTest();

    default void method3() {
        System.out.println("CompareB 默认方法 method3()");
    }
}
