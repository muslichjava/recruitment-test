package com.test.recruitment.controller;

import com.test.recruitment.common.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public abstract class BaseController {
    public static BaseResponse buildResponse(String code, String message, Object data) {
        return BaseResponse.builder()
                .code(code)
                .message(message)
                .data(data)
                .build();
    }
}
