package com.atguigu04._throw;

/**
 * ClassName: BelowZeroException
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 10:32
 * @Version 1.0
 */
public class BelowZeroException extends Exception {
    @java.io.Serial
    static final long serialVersionUID = -3423423423L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
