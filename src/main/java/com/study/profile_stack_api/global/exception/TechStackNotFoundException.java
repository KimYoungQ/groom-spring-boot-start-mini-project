package com.study.profile_stack_api.global.exception;

public class TechStackNotFoundException extends BusinessException {

    public TechStackNotFoundException(long id) {
        super(ErrorCode.TECHSTACK_NOT_FOUND);
    }
}
