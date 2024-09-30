package com.atguigu06.project.model.service;

import java.io.Serial;

/**
 * ClassName: TeamException
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 18:20
 * @Version 1.0
 */
public class TeamException extends Exception {
    @Serial
    private static final long serialVersionUID = -34112341L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
