package com.atguigu03.list.exer3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: KTVByArrayList
 * Description:
 *
 * @Author yao
 * @Create 2026/4/6 10:22
 * @Version 1.0
 */
public class KTVByArrayList {
    private static final ArrayList<String> musicList = new ArrayList<>();
    private static final Scanner scannerIns = new Scanner(System.in);

    public static void main(String[] args) {
        addDefMusic();
        boolean flag = true;
        while (flag) {
            System.out.println("当前歌曲列表：" + musicList);
            System.out.println("---------欢迎来到点歌系统---------");
            System.out.println("1: 添加歌曲");
            System.out.println("2: 将歌曲置顶");
            System.out.println("3: 将歌曲前移一位");
            System.out.println("4: 退出");
            System.out.print("请输入操作序号：");
            switch (scannerIns.nextInt()) {
                case 1:
                    addMusic();
                    break;
                case 2:
                    setTop();
                    break;
                case 3:
                    setBefore();
                    break;
                case 4:
                    flag = false;
                    System.out.println("退出系统成功！");
                    break;
            }
        }
        scannerIns.close();
    }

    /**
     * 添加默认歌曲
     */
    private static void addDefMusic() {
        musicList.add("本草纲目");
        musicList.add("最伟大的作品");
        musicList.add("夜的第七章");
        musicList.add("太阳之子");
    }

    /**
     * 添加歌曲
     */
    private static void addMusic() {
        System.out.print("请输入添加的歌曲名称：");
        String name = scannerIns.next();
        if (musicList.contains(name)) {
            System.out.println("歌曲列表已包含该歌曲");
            return;
        }
        musicList.add(name);
        System.out.println("已添加歌曲：" + name);
    }

    /**
     * 将歌曲置顶
     */
    private static void setTop() {
        System.out.print("请输入要置顶的歌曲名称：");
        String name = scannerIns.next();
        int idx = musicList.indexOf(name);
        if (idx < 0) {
            System.out.println("歌曲列表不存在歌曲：" + name + "，无法置顶");
        } else if (idx == 0) {
            System.out.println("当前歌曲：" + name + " 已置顶");
        } else {
            musicList.remove(idx);
            musicList.add(0, name);
            System.out.println("已将歌曲：" + name + " 置顶");
        }
    }

    /**
     * 将歌曲前移一位
     */
    private static void setBefore() {
        System.out.print("请输入要前移一位的歌曲名称：");
        String name = scannerIns.next();
        int idx = musicList.indexOf(name);
        if (idx < 0) {
            System.out.println("歌曲列表不存在歌曲：" + name + "，无法前移");
        } else if (idx == 0) {
            System.out.println("歌曲：" + name + " 已在最顶部！");
        } else {
            musicList.remove(idx);
            musicList.add(idx - 1, name);
        }
    }
}
