// 文件编码格式：utf-8
// 可以使用该命令编译：javac -encoding UTF-8 xxx.java
// 生成文档：javadoc -encoding UTF-8 -d mydoc -author -version CommentTest.java
/*
 * 1. 单行注释
 * 2. 多行注释
 * 3. 文档注释：文档注释内容可以被 jdk 提供的工具 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档。
 */

// 单行注释

/**
 * 这是我的第一个 java 程序，开心 ^_^
 * @author yao
 * @version 1.0
 */
public class CommentTest {
  /**
   * 这是 main() 方法。格式是固定的。(文档注释)
   * @param args
   */

  /*
   * 这是 main() 方法。格式是固定的。（多行注释）
   * @param args
   */
  public static void main(String[] args){
    // 这是输出语句
    System.out.println("CommentTest.java");
  }
}
