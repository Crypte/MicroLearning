package com.example.ishiki.dto;

import com.example.ishiki.model.Field;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CourseDTO {
    private long id;
    private String name;
    private String content;
    private long field_id;
}


