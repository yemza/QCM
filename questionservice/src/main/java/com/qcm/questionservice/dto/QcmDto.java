package com.qcm.questionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QcmDto {

    private Long id;
    private String title;
    private String description;
    private Long categoryId;
    private String difficultyLevel;
}
