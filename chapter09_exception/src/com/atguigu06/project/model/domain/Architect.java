package com.atguigu06.project.model.domain;

/**
 * ClassName: Architect
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 17:28
 * @Version 1.0
 */
public class Architect extends Designer {
    private int stock; // 股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getEquipment().getDescription() + "\t" + getBonus() + "\t" + stock + "\t";
    }

    @Override
    public String getDetailsForTeam() {
        return getBasicDetailsForTeam() + "\t架构师\t" + getBonus() + "\t" + getStock();
    }
}
