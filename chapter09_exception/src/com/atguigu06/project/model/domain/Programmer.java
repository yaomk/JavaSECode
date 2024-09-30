package com.atguigu06.project.model.domain;

import com.atguigu06.project.model.service.Status;

/**
 * ClassName: Programmer
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 17:20
 * @Version 1.0
 */
public class Programmer extends Employee {
    private int memberId; // 开发团队tId
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    protected String getBasicDetailsForTeam() {
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" +
                getSalary();
    }

    public String getDetailsForTeam() {
        return getBasicDetailsForTeam() + "\t程序员";
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t" + equipment.getDescription() + "\t";
    }
}
