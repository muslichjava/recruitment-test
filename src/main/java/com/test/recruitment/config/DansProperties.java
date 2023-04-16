package com.test.recruitment.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties(value = "dans")
public class DansProperties {

    private String baseUrl;
}
