import java.util.Scanner;

/**
 * ClassName: HelloChina
 * Description:
 *
 * @Author yao
 * @Create 2024/3/17 20:49
 * @Version 1.0
 */
public class HelloChina {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        method();
    }
    public static void method() {
        System.out.println("method 中文");
    }
}
