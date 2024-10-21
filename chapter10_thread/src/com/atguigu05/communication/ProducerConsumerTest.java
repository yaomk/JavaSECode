package com.atguigu05.communication;

/**
 * ClassName: ProducerConsumerTest
 * Description:
 * 生产者&消费者
 * 生产者（producer）将产品交给店员（Clerk），而消费者（Consumer）从店员出取走产品，
 * 1. 店员一次只能持有固定数量的产品（比如：20）
 * 2. 如果生产者试图生产更多的产品，店员就会叫生产者停一下，
 * 3. 如果店中有空位放产品了再通知生产者继续生产，
 * 4. 如果店中没有产品了，店员就会告诉消费者等一下，
 * 5. 如果店中有产品了再通知消费者来取走产品。
 * <p>
 * 分析：
 * 1. 是否是多线程问题？是，生产者，消费者。
 * 2. 是否有共享数据？有，共享数据是产品。
 * 3. 是否有线程安全问题？有，因为有共享数据。
 * 4. 是否需要处理线程安全问题？是，使用同步机制
 * 5. 是否存在线程间的通信？存在。
 *
 * @Author yao
 * @Create 2024/10/21 17:14
 * @Version 1.0
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p = new Producer(clerk, "生产者");
        Consumer s = new Consumer(clerk);

        Thread t = new Thread(s);
        Thread t2 = new Thread(s);
        t.setName("消费者1");
        t2.setName("消费者2");

        p.start();
        t.start();
        t2.start();
    }
}

class Producer extends Thread { // 生产者
    private final Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    public Producer(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("生产者开始生产产品。。。");
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            clerk.addProductNum();
        }
    }
}

class Consumer implements Runnable { // 消费者
    private final Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }


    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "开始消费产品。。。");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProductNum();
        }
    }
}

class Clerk { // 店员
    private int productNum = 0; // 产品的数量

    public int getProductNum() {
        return productNum;
    }

    // 增加产品数量的方法
    public synchronized void addProductNum() {
        if (productNum >= 20) {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            productNum++;
            System.out.println(Thread.currentThread().getName() + ":" + "生产了第" + productNum + "个产品");
            //生产一个就可以唤醒消费者的线程去消费
            notifyAll();
        }
    }

    // 减少产品数量的方法
    public synchronized void minusProductNum() {
        if (productNum <= 0) {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + ":" + "消费了第" + productNum + "个产品");
            productNum--;
            //消费一个就可以唤醒生产者的线程去生产
            notifyAll();
        }
    }

}