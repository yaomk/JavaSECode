package com.atguigu08.constructor.exer2;

/**
 * ClassName: Customer
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 下午3:53
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAccount(Account a) {
        account = a;
    }
    public Account getAccount() {
        return account;
    }
}
