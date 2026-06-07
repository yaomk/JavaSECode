package com.atguigu02.selfdefine;

/**
 * ClassName: MyException
 * Description:
 *
 * @Author yao
 * @Create 2026/6/7 10:51
 * @Version 1.0
 */
public class MyException extends Exception {
}

// 编译报错：泛型类不能扩展 'java.lang.Throwable'
// class MyException1<T> extends Exception{
// }
