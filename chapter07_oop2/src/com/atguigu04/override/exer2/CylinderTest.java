package com.atguigu04.override.exer2;

/**
 * ClassName: CylinderTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午10:47
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(2.3);
        cy.setLength(1.4);

        System.out.println("圆柱的表面积：" + cy.findArea());
        System.out.println("圆柱的体积为：" + cy.findVolume());
    }
}
