package com.study.profile_stack_api.global.exception;


public class ProfileNotFoundException extends BusinessException{

    public ProfileNotFoundException() {
        super(ErrorCode.PROFILE_NOT_FOUND);
    }
}
