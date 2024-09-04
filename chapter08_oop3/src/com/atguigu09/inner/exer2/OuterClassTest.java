package com.atguigu09.inner.exer2;

interface A {
    void method();
}

/**
 * ClassName: OuterClassTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/4 10:37
 * @Version 1.0
 */
public class OuterClassTest {
    public static void main(String[] args) {
        SubA subA = new SubA();
        subA.method();

        // 举例1：提供接口匿名实现类的对象
        A a1 = new A() {
            @Override
            public void method() {
                System.out.println("匿名实现类重写的method()");
            }
        };
        a1.method();

        // 举例2：提供接口匿名实现类的匿名对象
        new A() {
            @Override
            public void method() {
                System.out.println("匿名实现类重写的方法method()");
            }
        }.method();

        // 举例3：
        SubB subB = new SubB();
        subB.method1();

        // 举例4：提供了继承于抽象类的匿名实现类的对象
        B b = new B() {
            @Override
            public void method1() {
                System.out.println("继承于抽象类的子类调用方法");
            }
        };
        b.method1();
        System.out.println(b.getClass());
        System.out.println(b.getClass().getSuperclass());

        // 举例5：
        new B() {
            @Override
            public void method1() {
                System.out.println("继承于抽象类的子类调用方法1");
            }
        }.method1();

        // 举例6：
        C c = new C();
        c.method2();

        // 举例7：提供了继承于 C 的匿名实现类的对象
        C c1 = new C() {
        };
        c1.method2();
        System.out.println(c1.getClass()); // class com.atguigu09.inner.exer2.OuterClassTest$5
        // 匿名类的字节码文件: OuterClassTest$5.class
        System.out.println(c1.getClass().getSuperclass()); // class com.atguigu09.inner.exer2.C

    }
}

class SubA implements A {
    @Override
    public void method() {
    }
}

abstract class B {
    public abstract void method1();
}

class SubB extends B {

    @Override
    public void method1() {
        System.out.println("Sub");
    }
}

class C {
    public void method2() {
        System.out.println("c.method2()");
    }
}