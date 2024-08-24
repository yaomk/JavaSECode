package com.atguigu02.singleton;

/**
 * ClassName: GirlFriendTest
 * Description: 懒汉式单例模式
 *
 * @Author yao
 * @Create 2024/8/24 11:05
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend g1 = GirlFriend.getIns();
        GirlFriend g2 = GirlFriend.getIns();
        System.out.println(g1 == g2);
    }
}

class GirlFriend {
    // 2.声明当前类的实例，必须声明为static
    private static GirlFriend ins;

    // 1.类的构造器私有化
    private GirlFriend() {
    }

    // 3.通过getter获取当前类的实例，如果未创建对象，则在方法内进行创建
    public static GirlFriend getIns() {
        if (ins == null) {
            ins = new GirlFriend();
        }
        return ins;
    }
}
