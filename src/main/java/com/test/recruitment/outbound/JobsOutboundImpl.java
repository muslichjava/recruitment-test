package com.test.recruitment.outbound;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.recruitment.common.ApiPath;
import com.test.recruitment.common.BusinessLogicException;
import com.test.recruitment.common.ResponseCode;
import com.test.recruitment.config.DansProperties;
import com.test.recruitment.dto.JobsDto;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
@Slf4j
@AllArgsConstructor
public class JobsOutboundImpl implements JobsOutbound{

    private RestTemplate restTemplate;
    private DansProperties dansProperties;
    @Override
    @SneakyThrows
    public List<JobsDto> getAllJobs() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<String> response =  restTemplate.getForEntity(
                dansProperties.getBaseUrl().concat(ApiPath.dansGetAllJobOutbound), String.class);

        if (!HttpStatus.OK.equals(response.getStatusCode())){
            throw new BusinessLogicException(ResponseCode.FAILED.getCode(), ResponseCode.FAILED.getMessage());
        }

        ObjectMapper objectMapper = new ObjectMapper();
        List<JobsDto> resultResponse = objectMapper.readValue(response.getBody(), new TypeReference<>() {});

        return resultResponse;

    }

    @Override
    @SneakyThrows
    public JobsDto findById(String id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<String> response =  restTemplate.getForEntity(
                dansProperties.getBaseUrl().concat(ApiPath.dansGetByIdJobOutbound).concat(id), String.class);

        if (!HttpStatus.OK.equals(response.getStatusCode())){
            throw new BusinessLogicException(ResponseCode.FAILED.getCode(), ResponseCode.FAILED.getMessage());
        }

        ObjectMapper objectMapper = new ObjectMapper();
        JobsDto resultResponse = objectMapper.readValue(response.getBody(), new TypeReference<>() {});

        return resultResponse;
    }

}
