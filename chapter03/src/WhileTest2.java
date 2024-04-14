/*
 * 世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?

 */
public class WhileTest2 {
  public static void main(String[] args) {
    // 1. 声明珠峰的高度，纸的默认厚度
    double zf = 8848.86 * 1000,
      paper = 0.1;
    System.out.println(zf);
    // 2. 定义一个变量，记录折纸的次数
    int count = 0;
    // 3. 通过循环结构，不断调整纸的厚度，当纸的厚度超过珠峰的高度，停止循环。
    while(paper <= zf) {
      paper *= 2;
      count++;
    }
    System.out.println("paper的高度为：" + (paper / 1000) + "米，珠峰的高度为：" + zf / 1000 + "米");
    System.out.println("共折纸" + count + "次");
  }
}
