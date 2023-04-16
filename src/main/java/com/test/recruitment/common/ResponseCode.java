package com.test.recruitment.common;

import lombok.Getter;

@Getter
public enum ResponseCode {
    SUCCESS("00", "SUCCESS"),
    FAILED("99", "FAILED"),
    USER_NAME_PASSOWRD_NOT_MATCH("01", "USERNAME OR PASSWORD NOT MACTH");

    private String code;
    private String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
