package com.test.recruitment.outbound;

import com.test.recruitment.dto.JobsDto;

import java.util.List;

public interface JobsOutbound {
    List<JobsDto> getAllJobs();
    JobsDto findById(String id);

}
