package com.atguigu02.selfdefine.apply;

import org.junit.Test;

/**
 * ClassName: DAOTest
 * Description:
 *
 * @Author yao
 * @Create 2026/6/13 11:08
 * @Version 1.0
 */
public class DAOTest {
    @Test
    public void test1() {
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.insert(new Customer());
        System.out.println(customerDAO.queryForInstance(1));
    }

    @Test
    public void test2() {
        OrderDAO orderDAO = new OrderDAO();
        orderDAO.insert(new Order());
        System.out.println(orderDAO.queryForInstance(1));
    }
}
