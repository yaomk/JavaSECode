package com.atguigu08._interface.jdk8;

/**
 * ClassName: CompareA
 * Description:
 *
 * @Author yao
 * @Create 2024/9/3 10:37
 * @Version 1.0
 */
public interface CompareA {
    // 方法：jdk8中：静态方法
    static void method1() {
        System.out.println("CompareA 静态方法 method1()");
    }

    // 属性：声明为 public static final
    // 方法：jdk8之前：只能声明抽象方法

    void abstractMethodTest();

    // 方法：jdk8中，默认方法
    default void method2() {
        System.out.println("CompareA 默认方法 method2()");
    }

    default void method3() {
        System.out.println("CompareA 默认方法 method3()");
        method5();
    }

    default void method4() {
        System.out.println("CompareA 默认方法 method4()");
    }

    // jdk9新特性：定义私有方法
    private void method5() {
        System.out.println("接口中定义的私有方法。");
    }

}
