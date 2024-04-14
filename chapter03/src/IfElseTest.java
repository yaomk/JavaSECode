/*
 * java流程结构：顺序结构、分支结构、循环结构
 *
 * if-else条件判断结构
 *
 * 1.格式
 * 格式1：
 * if(条件表达式) {
 *    语句块;
 * }
 *
 * 格式2：
 * if(条件表达式) {
 *    语句块1;
 * } else {
 *    语句块2;
 * }
 *
 * 格式3：
 * if(条件表达式) {
 *    语句块1;
 * } else if(条件表达式2) {
 *    语句块2;
 * } else if(条件表达式3) {
 *    语句块3;
 * } else {
 *    语句块n;
 * }
 */
public class IfElseTest {
  public static void main(String[] args) {
    /*
     * 案例1:
     * 成年人心率的正常范围是每分钟60-100次。
     * 体检时，如果心率不在此范围内，则提示需要做进一步的检查。
     */
    int heartBeats = 89;
    //错误写法： if(60 <= heartBeats <= 100) {}
    if(heartBeats < 60 || heartBeats > 100) {
      System.out.println("需要进一步检查");
    }

    /*
     * 案例2：
     * 定义一个整数，判定是偶数还是奇数
     */
    int num = 13;
    if(num % 2 == 0) {
      System.out.println(num + "是偶数");
    } else {
      System.out.println(num + "是奇数");
    }
    /*
     * 案例3：
     * 考试成绩为100分，奖励一辆跑车；
     * 成绩为(80, 99]分时，奖励一辆自行车；
     * 成绩为[60, 80]分时，奖励一辆独轮车；
     * 其他为胖揍一顿
     */
    int score = 61;
    if(score == 100) {
      System.out.println("奖励一辆跑车");
    } else if(score > 80 && score <= 99) {
      System.out.println("奖励一辆自行车");
    } else if(score >= 60 && score <= 80) {
      System.out.println("奖励一辆独轮车");
    } else {
      System.out.println("胖揍一顿");
    }
  }
}
