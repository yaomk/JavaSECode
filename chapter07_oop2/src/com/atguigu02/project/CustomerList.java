package com.atguigu02.project;

/**
 * ClassName: CustomerList
 * Description:
 * CustomerList为 Customer 对象的管理模块，内部使用数组管理一组 Customer 对象
 * @Author yao
 * @Create 2024/6/29 上午10:37
 * @Version 1.0
 */
public class CustomerList {
    //用来保存客户对象的数组
    private Customer[] customers;
    //记录已保存客户对象的数量
    private int total;

    /**
     * 用途：构造器，用来初始化customers数组
     * @param totalCustomer 指定customers数组的最大空间
     */
    public CustomerList(int totalCustomer) {
        this.customers = new Customer[totalCustomer];
    }

    /**
     * 将参数customer对象添加到组中最后一个客户对象之后
     * @param customer 指定要添加的客户对象
     * @return 添加成功返回true，false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer){
        if(total < customers.length) {
            customers[total++] = customer;
            return true;
        }
        return false;
    }

    /**
     * 替换指定索引的customer对象为指定的customer对象
     * @param index 指定要被替换的索引位置
     * @param customer 替换的customer对象
     * @return 替换成功返回ture，false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if(index >= 0 && index < total) {
            customers[index] = customer;
            return true;
        }
        return false;
    }

    /**
     * 删除指定索引位置的customer对象
     * @param index 指定索引
     * @return 删除成功返回true
     */
    public boolean deleteCustomer(int index) {
        if(index >= 0 && index < total) {
            for(int i = index; i < total-1; i++) {
                customers[i] = customers[i+1];
            }
            customers[--total] = null;
            return true;
        }
        return false;
    }

    /**
     * 返回所有已存入的customer对象数组
     * @return customer对象的数组
     */
    public Customer[] getAllCustomers(){
        Customer[] cus = new Customer[total];
        for(int i = 0; i < cus.length; i++) {
            cus[i] = customers[i];
        }
        return cus;
    }

    /**
     * 返回指定索引的customer对象
     * @param index 指定索引
     * @return customer对象，index无效则返回null
     */
    public Customer getCustomer(int index){
        if(index >= 0 && index < total) {
            return this.customers[index];
        }
        return null;
    }

    public int getTotal() {
        return this.total;
    }
}
