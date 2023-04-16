package com.test.recruitment.controller;

import com.test.recruitment.common.ApiPath;
import com.test.recruitment.common.ResponseCode;
import com.test.recruitment.common.BaseResponse;
import com.test.recruitment.dto.LoginDtoRequest;
import com.test.recruitment.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPath.login)
@AllArgsConstructor
public class LoginController extends BaseController{
    private LoginService loginService;
    @PostMapping
    public BaseResponse<String>login(@RequestBody LoginDtoRequest dtoRequest){
        return buildResponse(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(),
                loginService.login(dtoRequest));
    }
}
