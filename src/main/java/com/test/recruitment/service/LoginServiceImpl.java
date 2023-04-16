package com.test.recruitment.service;

import com.test.recruitment.common.BusinessLogicException;
import com.test.recruitment.common.ResponseCode;
import com.test.recruitment.dto.LoginDtoRequest;
import com.test.recruitment.repository.MUserRepository;
import com.test.recruitment.utils.JwtUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService{

    private MUserRepository mUserRepository;
    private JwtUtils jwtUtils;
    @Override
    public String login(LoginDtoRequest requestDto) {
        return mUserRepository.findByUsernameAndPassword(requestDto.getUsername(), requestDto.getPassword())
                .map(user -> jwtUtils.generateToken(user.getUsername(), user.getPassword()))
                .orElseThrow(() -> new BusinessLogicException(ResponseCode.USER_NAME_PASSOWRD_NOT_MATCH.getCode(),ResponseCode.USER_NAME_PASSOWRD_NOT_MATCH.getCode()));
    }
}
