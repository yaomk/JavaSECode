package com.atguigu01.create.exer3;

/**
 * ClassName: Exer
 * Description:
 *
 * @Author yao
 * @Create 2024/10/9 16:29
 * @Version 1.0
 */
public class Exer {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B(a);
        b.start();

        BB bb = new BB();
        new Thread(bb) {
            @Override
            public void run() {
                System.out.println("CC");
            }
        }.start();
    }
}

class A extends Thread {
    @Override
    public void run() {
        System.out.println("线程A的run()");
    }
}

class B extends Thread {
    private A a;

    //public B(A a) {
    //    this.a = a;
    //}
    public B(A a) {
        super(a);
    }
    //@Override
    //public void run() {
    //    System.out.println("线程B的run()");
    //    //a.run();
    //}
}

class AA extends Thread {
    @Override
    public void run() {
        System.out.println("AA");
    }
}

class BB implements Runnable {
    @Override
    public void run() {
        System.out.println("BB");
    }
}