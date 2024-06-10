package com.atguigu08.constructor.exer2;

/**
 * ClassName: CustomerTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 下午3:56
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "smith");
        //Account account = new Account(1000, 2000, 0.0123);
        //customer.setAccount(account);
        customer.setAccount(new Account(1000, 2000, 0.0123));

        // 针对客户的账户进行存钱、取钱的操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        System.out.println("Customer's account balance is: " + customer.getAccount().getBalance());
    }
}
