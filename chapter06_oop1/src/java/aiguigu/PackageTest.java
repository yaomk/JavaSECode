package java.aiguigu;

/**
 * ClassName: PackageTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/8 上午10:27
 * @Version 1.0
 */
public class PackageTest {
    public static void main(String[] args) {
        // Error: A JNI error has occurred, please check your installation and try again
        // Exception in thread "main" java.lang.SecurityException: Prohibited package name: java.aiguigu
        System.out.println("取包名时不要使用 java.xx 包，报错");
    }
}
