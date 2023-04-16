package com.test.recruitment.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginDtoRequest {
    private String username;
    private String password;
}
