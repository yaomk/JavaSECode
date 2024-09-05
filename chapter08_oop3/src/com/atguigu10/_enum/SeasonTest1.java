package com.atguigu10._enum;

// jdk5.0 中使用 enum 关键字
enum Season1 implements Info {

    // 1. 必须在枚举类的开头声明多个对象，对象之间使用,隔开
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "白雪皑皑");

    // 2. 声明当前类的对象的实例变量，需要使用 private final 修饰
    private final String seasonName;
    private final String seasonDesc;

    // 3. 私有化类的构造器
    private Season1(String seasonName, String seasonDesc) {
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
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}

interface Info {
    void show();
}

/**
 * ClassName: SeasonTest1
 * Description:
 *
 * @Author yao
 * @Create 2024/9/5 11:03
 * @Version 1.0
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        System.out.println(Season1.AUTUMN.getClass()); // class com.atguigu10._enum.Season1
        System.out.println(Season1.AUTUMN.getClass().getSuperclass()); // class java.lang.Enum
        System.out.println(Season1.AUTUMN.getClass().getSuperclass().getSuperclass()); // class java.lang.object

        // 测试方法
        // 1. toString()：默认返回的是常量名（对象名）
        System.out.println(Season1.SPRING);

        // 2. name()：得到当前枚举常量的名称。建议优先使用 toString()。
        System.out.println(Season1.SPRING.name());

        // 3. values()：静态方法，返回枚举类型的对象数组
        Season1[] values = Season1.values();
        for (Season1 season1 : values) {
            System.out.println(season1);
        }

        // 4. valueOf(String objName):静态方法 返回当前枚举类中名称为 objName 的枚举类对象
        // 如果枚举类中不存在名称为 objName 的对象，则报错
        Season1 season1 = Season1.valueOf("SUMMER");
        System.out.println(season1);

        // 5. ordinal()：返回当前枚举常量的次序号
        System.out.println(Season1.AUTUMN.ordinal());

        // 通过枚举类的对象调用重写接口的方法
        Season1.AUTUMN.show();

    }
}