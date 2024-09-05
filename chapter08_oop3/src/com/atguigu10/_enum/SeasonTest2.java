package com.atguigu10._enum;

// jdk5.0 中使用 enum 关键字
enum Season2 implements Info2 {

    // 1. 必须在枚举类的开头声明多个对象，对象之间使用,隔开
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("宁静的夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋意浓");
        }
    },
    WINTER("冬天", "白雪皑皑") {
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    // 2. 声明当前类的对象的实例变量，需要使用 private final 修饰
    private final String seasonName;
    private final String seasonDesc;

    // 3. 私有化类的构造器
    private Season2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 4. 提供实例变量的getter
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}


interface Info2 {
    void show();
}

/**
 * ClassName: SeasonTest2
 * Description:
 *
 * @Author yao
 * @Create 2024/9/5 11:39
 * @Version 1.0
 */
public class SeasonTest2 {
    public static void main(String[] args) {
        Season2[] season2 = Season2.values();
        for (Season2 season : season2) {
            season.show();
        }
    }
}