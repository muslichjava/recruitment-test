package com.test.recruitment.service;

import com.test.recruitment.dto.JobsDto;

import java.util.List;

public interface JobsService {
    List<JobsDto> getAllJobs();

    JobsDto getById(String id);

}
