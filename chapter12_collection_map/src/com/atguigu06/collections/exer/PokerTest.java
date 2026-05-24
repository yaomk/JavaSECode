package com.atguigu06.collections.exer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * ClassName: PokerTest
 * Description:
 * 模拟斗地主洗牌和发牌
 *
 * @Author yao
 * @Create 2026/5/24 10:01
 * @Version 1.0
 */
public class PokerTest {
    public static void main(String[] args) {

        // 1. 组成一副牌
        String[] colors = {"方块♦", "梅花♣", "红桃♥", "黑桃♠"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        ArrayList poker = new ArrayList();
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color + " " + number);
            }
        }
        poker.add("小王");
        poker.add("大王");

        // 2. 洗牌
        Collections.shuffle(poker);
        // 3. 发牌
        HashMap personMap = new HashMap();
        personMap.put("Tom", new ArrayList());
        personMap.put("Jerry", new ArrayList());
        personMap.put("Me", new ArrayList());
        personMap.put("lastCards", new ArrayList());

        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {
                ArrayList o = (ArrayList) personMap.get("lastCards");
                o.add(poker.get(i));
            } else if (i % 3 == 0) {
                ((ArrayList) personMap.get("Tom")).add(poker.get(i));
            } else if (i % 3 == 1) {
                ((ArrayList) personMap.get("Jerry")).add(poker.get(i));
            } else if (i % 3 == 2) {
                ((ArrayList) personMap.get("Me")).add(poker.get(i));
            }
        }
        // 4. 遍历牌
        for (Object name : personMap.keySet()) {
            System.out.println(name + ":");
            System.out.println(personMap.get(name));
        }
    }
}
