package com.atguigu07.object;

/**
 * ClassName: FinalizeTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/10 23:17
 * @Version 1.0
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person p = new Person("Tom", 12);
        System.out.println(p);
        p = null; //此时对象实体就是垃圾对象，等待被回收，但时间不确定。
        System.gc(); //强制性释放空间
        try {
            Thread.sleep(1000); //线程睡眠1秒钟
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //此方法调用的时机：当 GC 要回收此对象时，调用如下的方法：
    //子类重写此方法，可在释放对象前进行某些操作
    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象被释放了-->" + this);
    }
}
