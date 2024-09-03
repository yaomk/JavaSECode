package com.atguigu08._interface.exer1;

/**
 * ClassName: EatableTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/3 09:32
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[2];
        eatables[0] = new Chinese();
        eatables[1] = new American();
        for (Eatable eatable : eatables) {
            eatable.eat();
        }
    }
}
