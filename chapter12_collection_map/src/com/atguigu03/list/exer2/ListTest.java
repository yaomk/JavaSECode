package com.atguigu03.list.exer2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: ListTest
 * Description:
 *
 * @Author yao
 * @Create 2026/2/10 11:40
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        // 需求1：随机生成30个字母，存在ArrayList中
        ArrayList list = new ArrayList();
        for(int i = 0; i < 30; i++){
            // 'a'~'z', 97 ~ 122
            char randomNum = (char) (Math.random() * (122 - 97 + 1) + 97);
            list.add(String.valueOf(randomNum));
        }
        System.out.println(list);
        // 需求2：遍历ArrayList，查找指定元素出现的次数
        int aCount = listTest(list, "a");
        System.out.println("a的数量为：" + aCount);
        int bCount = listTest(list, "b");
        System.out.println("b的数量为：" + bCount);
        int cCount = listTest(list, "c");
        System.out.println("c的数量为：" + cCount);

    }
    public static int listTest(Collection list, String str) {
        int count = 0;
        for (Object object : list) {
            if (object.toString().equals(str)) {
                count++;
            }
        }
        return count;
    }
}
