package com.atguigu04.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName: Exer01
 * Description:
 * 定义方法：public static List duplicateList(List list)
 * 要求：1.参数 List 中只存在Integer 类型的元素
 * 2.在 List 内去除重复数字值
 *
 * @Author yao
 * @Create 2026/5/10 12:15
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(12);
        list.add(31);
        list.add(51);
        list.add(11);
        list.add(31);

        List newList = duplication(list);
        System.out.println(newList);
    }

    public static List duplication(List list) {
        // 方式1：
        // HashSet hashSet = new HashSet();
        // for (int i = 0; i < list.size(); i++) {
        //     hashSet.add(list.get(i));
        // }
        // ArrayList arrayList = new ArrayList();
        // for (Object o : hashSet){
        //     arrayList.add(o);
        // }
        // return arrayList;

        // 方式2：
        HashSet hashSet = new HashSet(list);
        List newList = new ArrayList(hashSet);
        return newList;
    }
}
