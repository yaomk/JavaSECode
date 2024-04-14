package com.atguigu1.two.exer3;

/**
 * ClassName: YangHuTest
 * Description: 二维数组存储数据，并遍历
 *
 * @Author yao
 * @Create 2024/4/6 下午12:10
 * @Version 1.0
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        // 其中 10 代表普通职员，13 代表设计师，11 代表程序员，12 代表架构师
        String[][] employees = {
                {"10", "1", "张三", "22", "3000"},
                {"13", "2", "李四", "32", "13000", "15000", "200"},
                {"11", "3", "王五", "30", "8000"},
                {"12", "4", "熊大", "40", "20000", "40000", "500"},
        };
        System.out.println("员工类型\t编号\t姓名\t年龄\t薪资\t\t奖金\t\t股票");
        for (int i = 0; i < employees.length; i++) {
            String row = "";
            switch (employees[i][0]) {
                case "10":
                    row += "普通职员";
                    break;
                case "11":
                    row += "程序员";
                    break;
                case "13":
                    row += "设计师";
                    break;
                case "12":
                    row += "架构师";
                    break;
                default:
                    break;
            }
            row += '\t';
            for (int j = 1; j < employees[i].length; j++) {
                row += employees[i][j] + '\t';

            }
            System.out.println(row);
        }
    }
}














