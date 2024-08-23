package com.qcm.questionservice.dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class QuestionDto {

    @NonNull
    private Long id;

    @NonNull
    private String question;

    @NonNull
    private String correct_answer;

    @NonNull
    private String rightAnswer;

    @NonNull
    private String category;

    private QcmDto qcmDto;

    @NonNull
    private String option1;

    @NonNull
    private String option2;

    @NonNull
    private String option3;

    @NonNull
    private String option4;
}
