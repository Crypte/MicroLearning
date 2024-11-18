package com.example.ishiki.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class FieldDTO {
    private Long id;
    private String name;
    private String description;
    private Date created_at = new Date();
}
