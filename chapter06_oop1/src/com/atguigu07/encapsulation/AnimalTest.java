package com.atguigu07.encapsulation;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/8 上午11:20
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "金蟾";
        // 因为legs声明为private，是私有的，出了Animal类之外就不能调用了。
        //animal1.legs = 4;
        //animal1.legs = -4;

        // 只能通过setLegs()，间接的对legs属性进行赋值。
        animal1.setLegs(2);
        animal1.setLegs(-3);

        System.out.println("name = " + animal1.name + ", leg = " + animal1.getLegs());
        animal1.eat();
    }
}

class Animal {
    // 属性
    String name; // 名字
    private int legs; // 腿的个数

    // 方法
    // 设置legs属性的方法
    public void setLegs(int l) {
        if(l >= 0 && l % 2 == 0) {
            this.legs = l;
        } else {
            System.out.println("你输入的腿数有误");
        }
    }
    // 获取legs属性的方法
    public int getLegs() {
        return legs;
    }
    public void eat(){
        System.out.println("动物觅食");
    }
}