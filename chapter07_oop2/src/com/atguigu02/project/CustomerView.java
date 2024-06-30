package com.atguigu02.project;

/**
 * ClassName: CustomerView
 * Description:
 * CustomerView 为主模块，负责菜单的显示和处理用户操作
 *
 * @Author yao
 * @Create 2024/6/29 上午11:12
 * @Version 1.0
 */
public class CustomerView {
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.customerList.addCustomer(new Customer("张三", '男', 23, "13012341234", "1234@163.com"));
        customerView.enterMainMenu();
    }

    CustomerList customerList = new CustomerList(10);

    /**
     * 进入主界面方法
     */
    public void enterMainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("\n---------------------拼电商客户管理系统---------------------");
            System.out.println("                       1 添加客户");
            System.out.println("                       2 修改客户");
            System.out.println("                       3 删除客户");
            System.out.println("                       4 客户列表");
            System.out.println("                       5 退 出");
            System.out.print("                       请选择（1-5）：");

            char input = CMUtility.readMenuSelection();

            switch (input) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    getAllCustomer();
                    break;
                case '5':
                    flag = !exit();
                    break;
                default:
                    break;
            }
        }
    }

    private void addNewCustomer() {
        System.out.print("请输入客户名：");
        String name = CMUtility.readString(4);
        System.out.print("请输入客户性别：");
        char gender = getInputGender('0');
        System.out.print("请输入客户年龄：");
        int age = getInputAge(false, 0);
        System.out.print("请输入客户手机号：");
        String phone = CMUtility.readString(11);
        System.out.print("请输入客户邮箱：");
        String email = CMUtility.readString(20);
        customerList.addCustomer(new Customer(name, gender, age, phone, email));

    }

    private void modifyCustomer() {
        System.out.print("请输入要修改的客户的次序(-1退出)：");
        int idx = getInputIdx();
        if (idx == -1) return;
        Customer cus = customerList.getCustomer(0);

        System.out.print("姓名(" + cus.getName() + "): ");
        String name = CMUtility.readString(4, cus.getName());

        System.out.print("性别(" + cus.getGender() + "): ");
        char gender = getInputGender(cus.getGender());

        System.out.print("年龄(" + cus.getAge() + "): ");
        int age = getInputAge(true, cus.getAge());

        System.out.print("电话(" + cus.getPhone() + "): ");
        String phone = CMUtility.readString(11, cus.getPhone());

        System.out.print("邮箱(" + cus.getEmail() + "): ");
        String email = CMUtility.readString(20, cus.getEmail());

        boolean result = customerList.replaceCustomer(idx - 1, new Customer(name, gender, age, phone, email));
        if (result) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    private void deleteCustomer() {
        System.out.print("请输入要删除客户的次序(-1退出)：");
        int idx = getInputIdx();
        if (idx == -1) return;
        System.out.print("是否确认删除客户名为：" + customerList.getCustomer(idx - 1).getName() + " (Y/N)? ");
        char inputFlag = CMUtility.readConfirmSelection();
        if (inputFlag == 'Y' && customerList.deleteCustomer(idx - 1)) {
            System.out.println("删除成功！");
        }
    }

    private void getAllCustomer() {
        System.out.println("\n---------------------客户列表---------------------");
        Customer[] cuts = customerList.getAllCustomers();
        System.out.println("\n姓名\t性别\t年龄\t手机号\t邮箱");
        for (int i = 0; i < cuts.length; i++) {
            Customer c = cuts[i];
            System.out.println(c.getName() + "\t" + c.getGender() + "\t" + c.getAge() + "\t" + c.getPhone() + "\t" + c.getEmail());
        }
    }

    private boolean exit() {
        System.out.print("是否确认退出(Y/N)? ");
        char inputFlag = CMUtility.readConfirmSelection();
        if (inputFlag == 'Y') {
            CMUtility.close();
            System.out.println("退出成功！");
            return true;
        }
        return false;
    }

    private int getInputAge(boolean hasDefault, int defaultVal) {
        int age;
        for (; ; ) {
            if (hasDefault) {
                age = CMUtility.readNumber(defaultVal);
            } else {
                age = CMUtility.readNumber();
            }
            if (age > 0) {
                break;
            }
            System.out.print("年龄输入有误，请重新输入年龄：");
        }
        return age;
    }

    private char getInputGender(char defaultVal) {
        char gender;
        for (; ; ) {
            if (defaultVal == '0') {
                gender = CMUtility.readChar();
            } else {
                gender = CMUtility.readChar(defaultVal);
            }
            if (gender == '男' || gender == '女') {
                break;
            }
            System.out.print("性别输入有误，请重新输入：");
        }
        return gender;
    }

    private int getInputIdx() {
        int idx = CMUtility.readNumber();
        while (idx <= 0 || idx > customerList.getTotal()) {
            if (idx == -1) {
                break;
            }
            System.out.print("序号输入有误，请重新输入：");
            idx = CMUtility.readNumber();
        }
        return idx;
    }
}
