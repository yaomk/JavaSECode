package com.atguigu02.selfdefine.exer1;

import java.util.List;

/**
 * ClassName: DAOTest
 * Description:
 *
 * @Author yao
 * @Create 2026/6/13 11:32
 * @Version 1.0
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.save("1001", new User(1, "Tom", 22));
        dao.save("1002", new User(2, "Jerry", 21));

        dao.update("1002", new User(2, "Jack", 22));

        dao.delete("1003");

        System.out.println(dao.get("1001"));
        List<User> list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }
    }

}
