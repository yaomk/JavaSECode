package com.atguigu04.threadsafemore.singleton;

// 枚举类创建单例模式
enum SingletonByEnum {
    INSTANCE;

    public static SingletonByEnum getInstance() {
        return INSTANCE;
    }
}

/**
 * ClassName: BankTest
 * Description:
 *
 * @Author yao
 * @Create 2024/10/15 17:24
 * @Version 1.0
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread(() -> {
            b2 = Bank.getInstance();
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}

class Bank {
    // 为了避免出现指令重排，需要将 instance 声明为 volatile。
    private static volatile Bank instance = null;

    private Bank() {
    }

    //实现线程安全的方式1：
    //public static synchronized Bank getInstance() {// 同步监视器，此时的this，即为 Bank.class
    //    if(instance == null) {
    //        try {
    //            Thread.sleep(100);
    //        } catch (InterruptedException e) {
    //            e.printStackTrace();
    //        }
    //        instance = new Bank();
    //    }
    //    return instance;
    //}

    // 实现线程安全的方式2：
    //public static Bank getInstance() {
    //    synchronized (Bank.class) {
    //        if(instance == null) {
    //            try {
    //                Thread.sleep(100);
    //            }catch (InterruptedException e) {
    //                e.printStackTrace();
    //            }
    //            instance = new Bank();
    //        }
    //    }
    //    return instance;
    //}

    // 实现线程安全的方式3：相较于方式1和方式2来讲，效率更高。
    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}

//使用内部类创建单例模式，既能保证线程安全，又能保证单例唯一性。并且在实例不需要的时候不会创建实例。节省资源。
class SingletonByInnerClass {
    //私有化构造函数，防止外部直接创建实例
    private SingletonByInnerClass() {
    }

    //提供公有的静态方法，用于获取唯一可用的实例
    public static SingletonByInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //内部静态类，用于实现单例模式
    private static class SingletonHolder {
        private static final SingletonByInnerClass INSTANCE = new SingletonByInnerClass();
    }
}