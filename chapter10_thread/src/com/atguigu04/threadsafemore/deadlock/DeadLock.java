package com.atguigu04.threadsafemore.deadlock;

/**
 * ClassName: DeadLock
 * Description:
 *
 * @Author yao
 * @Create 2024/10/15 18:08
 * @Version 1.0
 */
public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();

    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        new Thread(dl).start();
        dl.init();
    }

    @Override
    public void run() {
        Thread.currentThread().setName("副线程");
        //调用 b 对象的 bar()
        b.bar(a);
        System.out.println("进入副线程之后");
    }

    public void init() {
        Thread.currentThread().setName("主线程");
        //调用 a 对象的 foo()
        a.foo(b);
        System.out.println("进入主线程之后");
    }
}

class A {
    public synchronized void foo(B b) {

        System.out.println("当前线程名称：" +
                Thread.currentThread().getName() +
                "进入 A 实例的 bar 方法");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名称：" +
                Thread.currentThread().getName() +
                "企图调用 B 实例的 last 方法");
        b.last();
    }

    public synchronized void last() {
        System.out.println("进入 A 类的 last 方法");
    }
}

class B {
    public synchronized void bar(A a) {
        System.out.println("当前线程名称：" +
                Thread.currentThread().getName() +
                "进入 B 实例的 bar 方法");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名称：" +
                Thread.currentThread().getName() +
                "企图调用 A 实例的 last 方法");
        a.last();
    }

    public synchronized void last() {
        System.out.println("进入 B 类的 last 方法");
    }
}
