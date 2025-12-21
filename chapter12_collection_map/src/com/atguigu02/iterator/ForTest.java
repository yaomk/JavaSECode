package com.atguigu02.iterator;

import com.atguigu01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: ForTest
 * Description:
 *
 * @Author yao
 * @Create 2025/12/21 11:45
 * @Version 1.0
 */
public class ForTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(1024);
        for(Object obj : coll){
            System.out.println(obj);
        }
    }
    @Test
    public void test2() {
        int[] arr = {1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
        String[] strArr = new String[]{"A","B","C","D","E","F"};
        for(String s : strArr){
            System.out.println(s);
        }
    }
}
