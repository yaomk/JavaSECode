package com.atguigu02.singleton;

/**
 * ClassName: BankTest
 * Description: 饿汉式单例模式
 *
 * @Author yao
 * @Create 2024/8/24 10:56
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        //Bank bank1 = new Bank();
        //Bank bank2 = new Bank();

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2); // true
    }
}

class Bank {
    // 2.在类的内部创建当前类的实例，且必须为static
    private static final Bank instance = new Bank();

    // 1.类的构造器私有化
    private Bank() {

    }

    // 3.使用getter方法获取当前类的实例，必须声明为static
    public static Bank getInstance() {
        return instance;
    }
}
