package com.atguigu05.map.exer2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName: CityMapTest
 * Description:
 *
 * @Author yao
 * @Create 2026/5/4 11:34
 * @Version 1.0
 */
public class CityMapTest {
    public static void main(String[] args) {
        // 1. 获取 map，并遍历 map 中的所有 key
        Map map = CityMap.model;
        for (Object provinces : map.keySet()) {
            System.out.print(provinces + "\t\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String[] cities;
        // 2. 根据提示，从键盘获取省份，并校验省份是否存在，如果存在遍历其 value 中的各个城市。不存在，则提示用户重新输入。
        while (true) {
            System.out.println("请输入省份：");
            String province = scanner.next();
            cities = (String[]) map.get(province);
            if (cities == null || cities.length == 0) {
                System.out.println("您输入的省份不存在，请重新输入");
            } else {
                break;
            }
        }
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + "\t\t");
        }
        // 3. 根据提示，从键盘获取城市，并校验城市是否存在，如果存在，则提示：登记成功。不存在，则提示用户重新输入。
        loop:
        while (true) {
            System.out.println("\n" + "请输入城市：");
            String city = scanner.next();
            // for (int i = 0; i < cities.length; i++) {
            //     if (cities[i].equals(city)) {
            //         System.out.println("登记成功");
            //         break loop;
            //     }
            // }

            // 方式2：
            if (containsCity(cities, city)) {
                System.out.println("登记成功");
                break;
            }
            System.out.println("您输入的城市不存在，请重新输入");
        }

        scanner.close();
    }

    // 方式2：
    public static boolean containsCity(String[] cities, String city) {
        for (String s : cities) {
            if (s.equals(city)) {
                return true;
            }
        }
        return false;
    }
}

class CityMap {
    public static Map model = new HashMap();

    static {
        model.put("北京", new String[]{"北京"});
        model.put("上海", new String[]{"上海"});
        model.put("浙江", new String[]{"杭州", "金华", "宁波"});
        model.put("河南", new String[]{"郑州", "开封", "洛阳"});
        model.put("河北", new String[]{"承德", "沧州", "邯郸"});
    }
}