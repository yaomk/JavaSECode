package com.atguigu08._interface.exer3;

/**
 * ClassName: VehicleTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/3 10:18
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer("Tom", 25);
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特", "红色");
        vehicles[1] = new ElectricVehicle("雅迪", "天蓝色");
        vehicles[2] = new Car("奔驰", "黑色", "浙A: 88888");

        for (Vehicle vehicle : vehicles) {
            developer.takingVehicle(vehicle);
            if (vehicle instanceof IPower) {
                ((IPower) vehicle).power();
            }
        }
    }
}
