package com.qcm.questionservice.service;

import com.qcm.questionservice.dto.QuestionDto;
import java.util.List;

public interface QuestionService {
      List<QuestionDto> getAllQcm() ;
      QuestionDto getQcmById(Long qcmId);
      QuestionDto createQcm(QuestionDto qcmDto);
      QuestionDto updateQcm(QuestionDto qcmDto);
      void deleteQCM(Long qcmId);
}
