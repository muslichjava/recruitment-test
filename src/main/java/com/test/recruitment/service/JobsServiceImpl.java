package com.test.recruitment.service;

import com.test.recruitment.common.BusinessLogicException;
import com.test.recruitment.common.ResponseCode;
import com.test.recruitment.dto.JobsDto;
import com.test.recruitment.outbound.JobsOutbound;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class JobsServiceImpl implements JobsService{

    private JobsOutbound jobsOutbound;
    @Override
    public List<JobsDto> getAllJobs() {
        return jobsOutbound.getAllJobs();
    }

    @Override
    public JobsDto getById(String id) {
        return Optional.ofNullable(jobsOutbound.findById(id))
                .orElseThrow(() -> new BusinessLogicException(ResponseCode.FAILED.getCode(), ResponseCode.FAILED.getMessage()));
    }

}
