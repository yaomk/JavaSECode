package com.atguigu06.project.model.domain;

/**
 * ClassName: NoteBook
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 17:13
 * @Version 1.0
 */
public class NoteBook implements Equipment {
    private String model;
    private double price;

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
