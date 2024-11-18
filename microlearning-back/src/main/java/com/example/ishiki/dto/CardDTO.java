package com.example.ishiki.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class CardDTO {
    private long id;
    private String title;
    private String content;
    private Date createdAt = new Date();
    private String img;
    private long course_id;
}
