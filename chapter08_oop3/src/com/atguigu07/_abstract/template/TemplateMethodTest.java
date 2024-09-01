package com.atguigu07._abstract.template;

/**
 * ClassName: TemplateMethodTest
 * Description: 抽象类的应用：模板方法的设计模式
 *
 * @Author yao
 * @Create 2024/9/1 11:17
 * @Version 1.0
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        DrawMoney d1 = new DrawMoney();
        d1.process();

        System.out.println();

        BankTemplateMethod b1 = new ManageMoney();
        b1.process();
    }
}

abstract class BankTemplateMethod {
    // 排号
    public void takeNumber() {
        System.out.println("取号排队");
    }

    // 办理具体业务
    public abstract void transact();

    // 评价
    public void evaluate() {
        System.out.println("反馈评分");
    }

    // 模板方法，把基本操作组合到一起，子类一般不能重写
    public final void process() {
        this.takeNumber();
        this.transact(); // 像个钩子，具体执行时，挂哪个钩子，就执行哪个子类的实现代码
        this.evaluate();
    }
}

class DrawMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要取钱");
    }
}

class ManageMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要理财");
    }
}