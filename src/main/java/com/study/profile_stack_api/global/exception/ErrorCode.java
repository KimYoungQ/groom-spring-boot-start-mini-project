package com.study.profile_stack_api.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    DUPLICATE_EMAIL("DUPLICATE_EMAIL", "이미 사용중인 이메일입니다", HttpStatus.CONFLICT),
    PROFILE_NOT_FOUND("PROFILE_NOT_FOUND", "프로필을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    TECHSTACK_NOT_FOUND("TECHSTACK_NOT_FOUND", "기술스택을 찾을 수 없습니다.", HttpStatus.NOT_FOUND);

    private final String code;
    private final String message;
    private final HttpStatus httpStatus;
}
