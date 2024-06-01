package com.atguigu05.method_more._02args;

/**
 * ClassName: ArgsTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 上午11:20
 * @Version 1.0
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest at = new ArgsTest();
        at.print();
        at.print(new int[]{1,2,3});
        //at.print(1,2,3,4);
        at.print(1);
        at.print(1,3);
    }
    public void print (int... nums) {
        System.out.println("1111");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(i + ":" + nums[i] + '\t');
        }
        System.out.println();
    }
    public void print(int i, int... nums) {}

    //public void print(int[] nums) {} 与 public void print (int... nums){} 不构成重载，被视为相同的定义方法
    public void print(int i) {
        System.out.println("2222");
    }
    public void print(int i, int j) {
        System.out.println("3333");
    }
    /* 编译不通过
    public void print(int... nums, int j){
        Vararg 形参必须为列表中的最后一个形参
    }
    */

    /*
    * 场景举例
    * String sql = "update customers set name = ?,email = ? where id = ?";
    *
    * String sql1 = "update customers set name = ? where id = ?";
    *
    * public void update(String sql, Object... objs);
    *
    * */
}
