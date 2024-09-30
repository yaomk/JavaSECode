package com.atguigu06.project.model.service;

/**
 * ClassName: Status
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 17:21
 * @Version 1.0
 */
public enum Status {
    FREE("空闲"), // 空闲
    BUSY("已加入开发团队"), // 已加入开发团队
    VOCATION("正在休假"); // 正在休假
    private final String desc;

    Status(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + desc + ")";
    }
}
