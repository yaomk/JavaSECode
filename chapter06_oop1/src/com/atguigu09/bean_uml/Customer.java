package com.atguigu09.bean_uml;

import java.sql.Date;

/**
 * ClassName: Customer
 * Description:
 * 所谓的 JavaBean，是指符合如下标准的 Java 类：
 * 1. 类是公共的
 * 2. 有一个无参的公共构造器
 * 3. 有属性，且有对应的 get、set 方法
 *
 * @Author yao
 * @Create 2024/6/16 上午11:05
 * @Version 1.0
 */
public class Customer {
    public Customer() {}

    private int id;
    private String name;
    private String email;
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
