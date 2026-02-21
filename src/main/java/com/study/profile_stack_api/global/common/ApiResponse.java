package com.study.profile_stack_api.global.common;

public class ApiResponse<T> {

    private boolean success;    // 성공/실패 여부
    private T data;             // 실제 응답 데이터
    private ErrorInfo error;    // 에러 정보 (실패 시)

    private  ApiResponse() {}

    /**
     * 성공 응답 생성 메서드
     */
    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> response = new ApiResponse<>();
        response.success = true;
        response.data = data;
        response.error = null;
        return response;
    }

    // Getter

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public ErrorInfo getError() {
        return error;
    }

    public static class ErrorInfo {
        private String code;    // 에러 코드
        private String message; // 에러 메세지

        public ErrorInfo(String code, String message) {
            this.code = code;
            this.message = message;
        }

        //Getter
        public String getCode() { return code; }
        public String getMessage() { return message;}
    }
}
