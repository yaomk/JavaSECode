package com.atguigu05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 11:12
 * @Version 1.0
 */
public class BelowZeroException extends Exception {
    static final long serialVersionUID = -23423411134L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
