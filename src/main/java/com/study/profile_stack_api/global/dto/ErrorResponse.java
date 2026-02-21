package com.study.profile_stack_api.global.dto;

import com.study.profile_stack_api.global.exception.ErrorCode;
import lombok.Getter;

@Getter
public class ErrorResponse {
    private final String code;
    private final String message;

    public ErrorResponse(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
}
