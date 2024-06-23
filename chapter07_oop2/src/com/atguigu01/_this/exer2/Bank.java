package com.atguigu01._this.exer2;

/**
 * ClassName: Bank
 * Description:
 *
 * @Author yao
 * @Create 2024/6/23 下午12:30
 * @Version 1.0
 */
public class Bank {
    //用于保存多个客户
    private Customer[] customers;
    //用于记录存储的客户的个数
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }

    /**
     * 将指定姓名的客户保存在阴阳的客户列表中
     * @param f 名
     * @param l 姓
     */
    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomer++] = cust;
    }

    /**
     * 获取客户列表中存储的客户的个数
     * @return int
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * 获取指定索引位置上的客户
     * @return Customer
     */
    public Customer getCustomer(int index) {
        if(index < 0 || index >= numberOfCustomer) {
            return null;
        }
        return customers[index];
    }
}
