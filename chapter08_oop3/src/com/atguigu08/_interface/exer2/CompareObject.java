package com.atguigu08._interface.exer2;

/**
 * ClassName: CompareObject
 * Description:
 * 定义一个接口，用来实现两个对象的比较
 *
 * @Author yao
 * @Create 2024/9/3 09:35
 * @Version 1.0
 */
public interface CompareObject {
    /**
     * 若返回值是0，代表相等，若为正数，代表当前对象大；负数代表当前对象小
     *
     * @param o object
     * @return int
     */
    public int compareTo(Object o);
}
