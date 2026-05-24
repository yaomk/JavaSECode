package com.atguigu06.collections.exer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * ClassName: PokerTest1
 * Description:
 * 模拟斗地主洗牌和发牌，发完牌后排序输出
 *
 * @Author yao
 * @Create 2026/5/24 10:14
 * @Version 1.0
 */
public class PokerTest1 {
    // 静态权重映射
    private static final HashMap<String, Integer> CARD_VALUE_MAP = new HashMap<>();

    static {
        // 牌面值权重
        String[] ranks = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "小王", "大王"};
        for (int i = 0; i < ranks.length; i++) {
            CARD_VALUE_MAP.put(ranks[i], i + 1); // 3->1, 4->2, ..., 大王->15
        }
    }

    public static void main(String[] args) {
        // 创建牌
        String[] colors = {"方块♦", "梅花♣", "红桃♥", "黑桃♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        reverse(numbers);
        ArrayList<String> poker = new ArrayList<>();
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color.concat(number));
            }
        }
        poker.add("小王");
        poker.add("大王");
        Collections.shuffle(poker);
        HashMap<String, ArrayList<String>> personMap = new HashMap<>();
        personMap.put("Tom", new ArrayList<>());
        personMap.put("Jerry", new ArrayList<>());
        personMap.put("Me", new ArrayList<>());
        personMap.put("lastCards", new ArrayList<>());
        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {
                personMap.get("lastCards").add(poker.get(i));
            } else if (i % 3 == 0) {
                personMap.get("Tom").add(poker.get(i));
            } else if (i % 3 == 1) {
                personMap.get("Jerry").add(poker.get(i));
            } else {
                personMap.get("Me").add(poker.get(i));
            }
        }
        personMap.values().forEach(PokerTest1::sortCards);
        // 遍历牌
        for (Object name : personMap.keySet()) {
            System.out.println(name + ":");
            System.out.println(personMap.get(name));
        }


    }

    public static void reverse(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // 根据权重排序（降序，即权重大的在前）
    public static void sortCards(List<String> cards) {
        cards.sort((o1, o2) -> getCardWeight(o2) - getCardWeight(o1));
    }

    // 从HashMap中获取单张牌的权重
    public static int getCardWeight(String card) {
        if (card.contains("小王") || card.contains("大王")) {
            return CARD_VALUE_MAP.get(card);
        }
        if (card.contains("10")) {
            return CARD_VALUE_MAP.get("10");
        }
        // getOrDefault()：如果键在map中不存在,则返回默认值
        return CARD_VALUE_MAP.getOrDefault(card.substring(card.length() - 1), 0);
    }
}
