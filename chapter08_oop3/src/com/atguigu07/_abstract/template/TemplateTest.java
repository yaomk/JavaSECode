package com.atguigu07._abstract.template;

/**
 * ClassName: TemplateTest
 * Description: 抽象应用案例：模板方法的设计模式
 *
 * @Author yao
 * @Create 2024/9/1 10:52
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber p1 = new PrintPrimeNumber();
        p1.spendTime();
    }
}

abstract class Template {
    //计算某段代码的执行时间，需要花费的时间
    public void spendTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("这段代码的执行花费的时间为" + (end - start) + "ms");
    }

    public abstract void code();
}

class PrintPrimeNumber extends Template {
    @Override
    public void code() { // 打印2到100000之间所有的质数（只能被1和他本身整除的数子是质数）
        for (int i = 2; i < 100000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }
    }
}