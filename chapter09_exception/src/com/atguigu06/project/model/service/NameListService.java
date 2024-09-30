package com.atguigu06.project.model.service;

import com.atguigu06.project.model.domain.*;

import static com.atguigu06.project.model.service.Data.*;

/**
 * ClassName: NameListService
 * Description:
 * 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
 *
 * @Author yao
 * @Create 2024/9/29 17:30
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            String[] data = EMPLOYEES[i];
            int type = Integer.parseInt(data[0]);
            int id = Integer.parseInt(data[1]);
            String name = data[2];
            int age = Integer.parseInt(data[3]);
            double salary = Double.parseDouble(data[4]);
            //employees[i] = switch (type) {
            //    case EMPLOYEE ->  new Employee();
            //    case PROGRAMMER ->  new Programmer();
            //    case DESIGNER ->  new Designer();
            //    case ARCHITECT ->  new Architect();
            //    default -> null;
            //};
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    employees[i] = new Programmer(id, name, age, salary, createEquipment(i));
                    break;
                case DESIGNER:
                    employees[i] = new Designer(id, name, age, salary, createEquipment(i), Double.parseDouble(data[5]));
                    break;
                case ARCHITECT:
                    employees[i] = new Architect(id, name, age, salary, createEquipment(i), Double.parseDouble(data[5]), Integer.parseInt(data[6]));
                    break;
            }
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不指定的员工");
    }

    private Equipment createEquipment(int index) {
        String[] data = EQUIPMENTS[index];

        int equipment = Integer.parseInt(data[0]);
        String modelOrName = data[1];
        String priceDisplayOrType = data[2];

        return switch (equipment) {
            case PC -> new PC(modelOrName, priceDisplayOrType);
            case NOTEBOOK -> new NoteBook(modelOrName, Double.parseDouble(priceDisplayOrType));
            case PRINTER -> new Printer(modelOrName, priceDisplayOrType);
            default -> throw new IllegalStateException("Unexpected value: " + equipment);
        };
    }
}
