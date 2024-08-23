package com.qcm.questionservice.mappers;

import com.qcm.questionservice.dto.QcmDto;
import com.qcm.questionservice.dto.QuestionDto;
import com.qcm.questionservice.entities.Question;

public interface QuestionMapper {

      QuestionDto questionToQuestionDto(Question question);
      Question questionDtoToQuestion(QuestionDto questionDto);
}
