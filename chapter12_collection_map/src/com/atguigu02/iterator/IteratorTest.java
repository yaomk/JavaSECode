package com.atguigu02.iterator;

import com.atguigu01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName: IteratorTest
 * Description:
 *
 * @Author yao
 * @Create 2025/12/21 11:12
 * @Version 1.0
 */
public class IteratorTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(1024);

        Iterator iterator = coll.iterator();
        // 方式一：手动调用 next()
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        // System.out.println(iterator.next()); // 如果超出了集合中元素的个数，会报 java.util.NoSuchElementException

        // 方式二：
        // for(int i = 0; i < coll.size(); i++){
        //     System.out.println(iterator.next());
        // }

        // 方式三（推荐）：调用 hasNext()
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(1024);

        Iterator iterator = coll.iterator();
        // 错误的写法一：会导致“跳”值，并且会报错：java.util.NoSuchElementException
        // while(iterator.next() != null) {
        //     System.out.println(iterator.next());
        // }

        // 错误的写法二：会导致无限循环输出集合中的第一个元素
        // 每次调用 coll.iterator()，都会返回一个新的迭代器对象，
        // while(coll.iterator().hasNext()) {
        //     System.out.println(coll.iterator().next());
        // }
    }

}
