package com.atguigu09.inner.exer1;

/**
 * ClassName: ObjectTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/4 10:30
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
        SubObject subObject = new SubObject();
        subObject.test();

        // 提供一个继承于 Object 类的匿名子类的匿名对象
        new Object() {
            public void test() {
                System.out.println("尚硅谷");
            }
        }.test();
    }

}

class SubObject extends Object {
    public void test() {
        System.out.println("尚硅谷");
    }
}
