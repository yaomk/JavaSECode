package com.atguigu03._extends.exer1;

/**
 * ClassName: KidsTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午10:37
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {

        Kids kid = new Kids();
        kid.setSex(1);
        kid.setSalary(100);
        kid.setYearsOld(10);

        //来自父类中声明的方法
        kid.employed();
        kid.manOrWoman();
        //Kids类自己声明的方法
        kid.printAge();
    }
}
