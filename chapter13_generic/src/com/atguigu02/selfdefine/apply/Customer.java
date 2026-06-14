package com.atguigu02.selfdefine.apply;

import java.util.Date;

/**
 * ClassName: Customer
 * Description:
 * ORM 思想：object relational mapping，对象关系映射。
 * 数据库中的一个表与 java 中的一个类对象
 * 表中的一条记录与 java 类的一个对象对应
 * 表中的一个字段与 java 类的一个属性（或字段）对应
 *
 * @Author yao
 * @Create 2026/6/13 11:01
 * @Version 1.0
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private Date birthday;
    private String gender;
}
