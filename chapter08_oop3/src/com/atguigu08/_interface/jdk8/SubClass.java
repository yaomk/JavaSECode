package com.atguigu08._interface.jdk8;

/**
 * ClassName: SubClass
 * Description:
 *
 * @Author yao
 * @Create 2024/9/3 10:42
 * @Version 1.0
 */
public class SubClass extends SuperClass implements CompareA, CompareB {
    //@Override
    //public void abstractMethodTest() {
    //    System.out.println("SubClass 重写 abstractMethodTest()");
    //}

    @Override
    public void method2() {
        System.out.println("SubClass 重写后的 method2()");
    }

    @Override
    public void method3() {
        System.out.println("SubClass 重写后的 method3()");
    }


    public void method() {
        // 知识点5：如何在子类（或实现类）中调用父类或接口中被重写的方法
        method3(); // 调用自己类中的方法

        super.method4(); // 调用父类中的方法

        CompareA.super.method3(); // 调用接口 CompareA 中的默认方法
        CompareB.super.method3(); // 调用接口 CompareB 中的默认方法
    }
}
