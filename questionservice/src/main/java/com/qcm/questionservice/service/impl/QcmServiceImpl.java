package com.qcm.questionservice.service.impl;

import com.qcm.questionservice.dto.QcmDto;
import com.qcm.questionservice.dto.QuestionDto;
import com.qcm.questionservice.entities.Question;
import com.qcm.questionservice.feign.QcmFeign;
import com.qcm.questionservice.mappers.QuestionMapper;
import com.qcm.questionservice.repositories.QuestionRepository;
import com.qcm.questionservice.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class QcmServiceImpl implements QuestionService {


    private QuestionRepository questionRepository;
    private QuestionMapper questionMapper;
    private QcmFeign qcmFeign;

    public List<QuestionDto> getAllQcm() {
        List<Question> questionsResponse =  questionRepository.findAll();
        List<QuestionDto> questionsDtoResponse = questionsResponse.stream()
                .map(question -> {
                    QuestionDto questionDto = questionMapper.questionToQuestionDto(question);
                    QcmDto qcmDto = qcmFeign.getQcmById(question.getQcm_id());
                    questionDto.setQcmDto(qcmDto);
                    return questionDto;
                })
                .collect(Collectors.toList());

        return questionsDtoResponse;
    }

    public QuestionDto getQcmById(Long questionId) {
        Question questionResponse = questionRepository.findById(questionId).get();
        QuestionDto questionDtoResponse =  questionMapper.questionToQuestionDto(questionResponse);
        QcmDto qcmDto = qcmFeign.getQcmById(questionResponse.getQcm_id());
        questionDtoResponse.setQcmDto(qcmDto);
        return questionDtoResponse;
    }

    public QuestionDto createQcm(QuestionDto questionDto) {
        return  questionMapper.questionToQuestionDto(
                    questionRepository.save(
                        questionMapper.questionDtoToQuestion(questionDto)));
    }

    public QuestionDto updateQcm(QuestionDto questionDto) {
        return  questionMapper.questionToQuestionDto(
                questionRepository.save(
                        questionMapper.questionDtoToQuestion(questionDto)));
    }

    public void deleteQCM(Long qcmId) {
        questionRepository.deleteById(qcmId);
    }
}
