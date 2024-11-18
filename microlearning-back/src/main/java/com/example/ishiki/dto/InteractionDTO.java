package com.example.ishiki.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class InteractionDTO {
    private Long userId;
    private Long cardId;
}
