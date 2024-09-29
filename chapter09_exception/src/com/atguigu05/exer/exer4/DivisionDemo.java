package com.atguigu05.exer.exer4;

/**
 * ClassName: DivisionDemo
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 11:09
 * @Version 1.0
 */
public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);

            int result = divide(m, n);
            System.out.println("结果为：" + result);
        } catch (BelowZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("除0");
        }
    }

    public static int divide(int m, int n) throws BelowZeroException {
        if (n < 0 || m < 0) {
            // 手动抛出异常类型对象
            throw new BelowZeroException("不能为负数");
        }
        return m / n;
    }
}
