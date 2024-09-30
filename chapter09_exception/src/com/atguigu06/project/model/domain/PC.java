package com.atguigu06.project.model.domain;

/**
 * ClassName: PC
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 17:12
 * @Version 1.0
 */
public class PC implements Equipment {
    private String model;
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
