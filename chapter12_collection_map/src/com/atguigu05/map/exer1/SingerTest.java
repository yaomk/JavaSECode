package com.atguigu05.map.exer1;

import java.util.*;

/**
 * ClassName: SingerTest
 * Description: 添加你喜欢的歌手以及他唱过的歌曲，并遍历
 *
 * @Author yao
 * @Create 2026/5/4 11:25
 * @Version 1.0
 */
public class SingerTest {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> hashMap = new HashMap<>();
        String singerName1 = "周杰伦";
        HashSet<String> songList1 = new HashSet<>();
        songList1.add("七里香");
        songList1.add("夜曲");
        songList1.add("青花瓷");
        songList1.add("稻香");
        hashMap.put(singerName1, songList1);

        String singerName2 = "林俊杰";
        HashSet<String> songList2 = new HashSet<>();
        songList2.add("江南");
        songList2.add("曹操");
        songList2.add("小酒窝");
        songList2.add("可惜没如果");

        hashMap.put(singerName2, songList2);

        Set<Map.Entry<String, HashSet<String>>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, HashSet<String>> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Iterator<Map.Entry<String, HashSet<String>>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, HashSet<String>> entry = iterator.next();
            System.out.println("歌手：" + entry.getKey());
            System.out.println("歌曲：" + entry.getValue());
        }
    }
}
