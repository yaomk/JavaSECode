package com.atguigu04.set.exer2;

import java.util.HashSet;

/**
 * ClassName: Exer02
 * Description:
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
 *
 * @Author yao
 * @Create 2026/5/10 12:25
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        while (hashSet.size() < 10) {
            int num = (int) (Math.random() * 20 + 1);
            hashSet.add(num);
        }
        System.out.println(hashSet);
    }
}
