package com.study.profile_stack_api.global.exception;

import org.springframework.http.HttpStatus;

public class DuplicateEmailException extends BusinessException {

    public DuplicateEmailException(String email) {
        super(ErrorCode.DUPLICATE_EMAIL);
    }
}
