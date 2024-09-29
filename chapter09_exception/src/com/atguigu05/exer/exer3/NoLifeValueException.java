package com.atguigu05.exer.exer3;

/**
 * ClassName: NoLifeValueException
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 10:58
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException {
    static final long serialVersionUID = -21123423423L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }

    public NoLifeValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
