package com.atguigu06.project.model.junit;

import com.atguigu06.project.model.domain.Employee;
import com.atguigu06.project.model.service.NameListService;
import com.atguigu06.project.model.service.TeamException;
import org.junit.Test;

/**
 * ClassName: NameListServiceTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 18:23
 * @Version 1.0
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployee() {
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmployee() {
        NameListService nameListService = new NameListService();
        try {
            int id = 13;
            System.out.println(nameListService.getEmployee(id));
        } catch (TeamException e) {
            e.printStackTrace();
        }
    }
}
