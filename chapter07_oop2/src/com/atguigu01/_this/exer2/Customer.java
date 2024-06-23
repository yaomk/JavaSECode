package com.atguigu01._this.exer2;

/**
 * ClassName: Customer
 * Description:
 *
 * @Author yao
 * @Create 2024/6/23 下午12:24
 * @Version 1.0
 */
public class Customer {
    //名
    private String firstName;
    //姓
    private String lastName;
    //账户
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
