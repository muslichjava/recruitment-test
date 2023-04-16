package com.test.recruitment.service;

import com.test.recruitment.dto.LoginDtoRequest;

public interface LoginService {
    String login(LoginDtoRequest requestDto);
}
