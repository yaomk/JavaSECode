package com.atguigu06.project.model.domain;

/**
 * ClassName: Designer
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 17:26
 * @Version 1.0
 */
public class Designer extends Programmer {
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + getEquipment().getDescription() + "\t" + getBonus() + "\t";
    }

    @Override
    public String getDetailsForTeam() {
        return getBasicDetailsForTeam() + "\t设计师\t" + getBonus();
    }
}
