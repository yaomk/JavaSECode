/*
 * 测试字符类型和布尔类型的使用
 *
 * 说明：
 * 1. char使用的是 unicode 字符集，包含了世界范围的所有的字符。
 * 2. boolean占几个字节？
 *    编译时不谈占几个字节。
 *    但是JVM在给boolean类型分配内存空间时，boolean类型的变量占据一个槽位（slot，等于4个字节）
 *    细节：true：1，false：0
 *    扩展：在内存中，byte、short、char、boolean、int、float：占用 1 个slot
 *      double、long：占用 2 个slot
 */
public class VariableCharAndBooleanTest {
  public static void main(String[] args) {
    // 1.字符类型：char（2字节）
    // 表示形式1：使用一对''单引号表示，内部有且仅有一个字符
    char c1 = '中';
    char c2 = 'a';
    char c3 = ' ';
    char c4 = '&';
    char c5 = 'β';

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);

    // 编译不通过，有且仅有一个字符
    // char c6 = '';
    // char c7 = 'ab';

    // 表示形式2：直接使用Unicode值来表示字符型常量：‘\\uxxxx’.
    char c8 = '\u0036'; // \u0036 对应字符：6
    System.out.println(c8);

    // 表示形式3：使用转义字符
    char c9 = '\n';
    char c10 = '\t';
    System.out.println("hello" + c9 + "world" + c10 + "!");

    // 表示形式4：使用具体字符对应的数值（比如 ASCII 码）
    char c11 = 97;
    System.out.println(c11);// a

    char c12 = 1;
    char c13 = '1';
    System.out.println(c12);
    System.out.println(c13);

    boolean b1 = true;
    if(b1) {
      System.out.println("此时b1的值为true" + b1);
    } else {
      System.out.println("此时b1的值为false" + b1);
    }
  }
}
