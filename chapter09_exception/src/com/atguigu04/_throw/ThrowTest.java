package com.atguigu04._throw;

/**
 * ClassName: ThrowTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/27 18:13
 * @Version 1.0
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student s = new Student();
        //s.register(10);
        //s.register(-10);
        System.out.println(s);
        try {
            s.register1(10);
            System.out.println(s);
            s.register1(-10);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class Student {
    int id;

    public void register(int id) throws RuntimeException {
        if (id > 0) {
            this.id = id;
        } else {
            // 手动抛出异常类型对象
            throw new RuntimeException("输入id不合法");
        }
    }

    public void register1(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
            // 手动抛出异常类型对象
            //throw new RuntimeException("输入id不合法");
            //throw new Exception("输入id不合法");
            // 手动抛出自定义异常类型对象
            throw new BelowZeroException("输入id不合法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
