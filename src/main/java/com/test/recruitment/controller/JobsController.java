package com.test.recruitment.controller;

import com.test.recruitment.common.ApiPath;
import com.test.recruitment.common.BaseResponse;
import com.test.recruitment.common.ResponseCode;
import com.test.recruitment.dto.JobsDto;
import com.test.recruitment.service.JobsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiPath.jobs)
@AllArgsConstructor
public class JobsController extends BaseController{
    private JobsService jobsService;

    @GetMapping
    public BaseResponse<List<JobsDto>> getAllJobs(){
        return buildResponse(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(), jobsService.getAllJobs());
    }

    @PostMapping(ApiPath.jobsById)
    public BaseResponse<JobsDto> findById(@PathVariable String id){
        return buildResponse(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(), jobsService.getById(id));
    }

}
