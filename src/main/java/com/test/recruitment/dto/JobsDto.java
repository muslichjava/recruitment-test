package com.test.recruitment.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobsDto {
    private String id;

    private String type;

    private String url;

    @JsonAlias(value = "created_at")
    private String createdAt;

    private String company;

    @JsonAlias(value = "company_url")
    private String companyUrl;

    private String location;

    private String title;

    private String description;

    @JsonAlias(value = "how_to_apply")
    private String howToApply;

    @JsonAlias(value = "company_logo")
    private String companyLogo;


}
