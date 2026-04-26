package com.atguigu05.map;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: HashMapTest
 * Description:
 *
 * @Author yao
 * @Create 2026/4/18 09:59
 * @Version 1.0
 */
public class MapTest {
    @Test
    public void test1() {
        Map map = new HashMap();
        map.put(null, null);
        map.put("Tom", 23);
        map.put(34, "AA");
        map.put("cc", new Date());
        System.out.println(map);
    }

    @Test
    public void test2() {
        Map map = new Hashtable();
        // map.put(null, 123); // java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
        // map.put("AA", null); // java.lang.NullPointerException
        System.out.println(map);
    }

    @Test
    public void test3() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Tom", 23);
        linkedHashMap.put(34, "AA");
        linkedHashMap.put("cc", new Date());
        System.out.println(linkedHashMap);
    }
    
    @Test
    public void test4() {
        // put 测试
        HashMap map = new HashMap();
        map.put("Tom", 23);

        System.out.println(map);
        // put 修改，返回之前的值
        Object tom = map.put("Tom", 2);
        System.out.println(tom);

        map.put(33, "AA");
        map.put("cc", new Date());
        map.put(128, 'a');
        map.put(new Person("Tom", 2), new Person("Jerry", 2));
        System.out.println(map);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        System.out.println(linkedHashMap);
    }

    @Test
    public void test5() {
        // remove 测试
        HashMap map = new HashMap();
        map.put("Tom", 23);
        map.put(33, "AA");
        map.put(128, 128);
        System.out.println(map);
        map.remove(128);
        System.out.println(map);
    }

    @Test
    public void test6() {
        // get 测试
        HashMap map = new HashMap();
        map.put("Tom", 23);
        map.put(33, "AA");
        map.put(128, 129);
        System.out.println(map.get(128));
        System.out.println(map.get(null));
        System.out.println(map.get(129));
    }

    @Test
    public void test7() {
        // size 测试
        HashMap map = new HashMap();
        map.put("Tom", 23);
        map.put(33, "AA");
        map.put(128, 129);
        System.out.println(map.size());
    }

    @Test
    public void test8() {
        // keySet 测试
        HashMap map = new HashMap();
        map.put("Tom", 23);
        map.put(33, "AA");
        map.put(128, 129);

        Set keySet = map.keySet();
        // 增强for循环
        for (Object key : keySet) {
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("--------------------------");
        // 迭代器
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
    @Test
    public void test9() {
        // values 测试
        HashMap map = new HashMap();
        map.put("Tom", 23);
        map.put(33, "AA");
        map.put(128, 129);
        System.out.println(map.keySet()); // keySet的顺序与values值的顺序一致
        Collection mapValues = map.values();
        System.out.println(mapValues);
        for (Object object : mapValues) {
            System.out.println(object);
        }
        System.out.println("--------------------------");
        Iterator iterator1 = mapValues.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("--------------------------");
        for(int i = 0; i< mapValues.size(); i++) {
            System.out.println(mapValues.toArray()[i]);
        }
    }
    @Test
    public void test10() {
        // entrySet 测试
        HashMap map = new HashMap();
        map.put("Tom", 23);
        map.put(33, "AA");
        map.put(128, 129);
        Set entrySet = map.entrySet();
        entrySet.forEach(System.out::println);

        System.out.println("--------------------------");

        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            // HashMap 实现了 Map.Entry 内部接口：static class Node<K,V> implements Map.Entry<K,V>
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " --> " + entry.getValue());
            /*
             Node<K,V> 重写了 toString 方法：public final String toString() { return key + "=" + value; }
             System.out.println("--------------------------");
             System.out.println(iterator.next());
            */
        }

    }
}
