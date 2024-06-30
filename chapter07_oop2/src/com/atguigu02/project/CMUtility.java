package com.atguigu02.project;

import java.util.Scanner;

/**
 * ClassName: CMUtility
 * Description:
 *
 * @Author yao
 * @Create 2024/6/29 上午10:31
 * @Version 1.0
 */
public class CMUtility {
    private static final Scanner scannerIns = new Scanner(System.in);

    public static void close() {
        scannerIns.close();
    }

    public static char readMenuSelection() {
        char code;
        for (; ; ) {
            String str = readKeyboard(1, false);
            code = str.charAt(0);
            if (code != '1' && code != '2' && code != '3' && code != '4' && code != '5') {
                System.out.print("输入错误，请重新输入：");
            } else break;
        }
        return code;
    }

    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyboard(3, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    public static int readNumber(int defaultValue) {
        int num = readNumber();
        return num == 0 ? defaultValue : num;
    }

    /**
     * 用于确认选择的输入。该方法从键盘读取‘Y’或’N’，并将其作为方法的返回值。
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyboard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
     */
    public static String readString(int limit) {
        return readKeyboard(limit, false);
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
     * 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值。
     */
    public static String readString(int limit, String defaultValue) {
        String str = readKeyboard(limit, true);
        return str.isEmpty() ? defaultValue : str;
    }

    public static char readChar() {
        char c;
        String str = readKeyboard(1, false);
        c = str.charAt(0);
        return c;
    }

    public static char readChar(char defaultValue) {
        String str = readKeyboard(1, true);
        return (str.isEmpty()) ? defaultValue : str.charAt(0);
    }

    private static String readKeyboard(int limit, boolean blankReturn) {
        String line = "";

        while (scannerIns.hasNextLine()) {
            line = scannerIns.nextLine();
            if (line.isEmpty()) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }
}

