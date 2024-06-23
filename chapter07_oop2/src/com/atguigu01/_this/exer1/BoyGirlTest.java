package com.atguigu01._this.exer1;

/**
 * ClassName: BoyGirlTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/23 下午12:12
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("Jack", 24);
        Girl girl1 = new Girl("Rose", 22);
        girl1.marry(boy1);
        boy1.shout();
        Girl girl2 = new Girl("Tom", 18);
        int compare = girl1.compare(girl2);
        if(compare > 0) {
            System.out.println(girl1.getName() + "年龄大");
        } else if(compare < 0) {
            System.out.println(girl2.getName() + "年龄大");
        }else {
            System.out.println(girl1.getName() + "和" + girl2.getName() + "年龄一样大");
        }
    }
}
