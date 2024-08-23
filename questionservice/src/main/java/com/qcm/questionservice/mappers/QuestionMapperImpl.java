package com.qcm.questionservice.mappers;


import com.qcm.questionservice.dto.QuestionDto;
import com.qcm.questionservice.entities.Question;
import org.springframework.stereotype.Service;

@Service
public class QuestionMapperImpl implements QuestionMapper {

    public QuestionDto questionToQuestionDto(Question question) {
        return new QuestionDto(question.getId(),
                              question.getQuestion(),
                              question.getCorrect_answer(),
                              question.getRightAnswer(),
                              question.getCategory(),
                              question.getOption1(),
                              question.getOption2(),
                              question.getOption3(),
                              question.getOption4());
    }
    public Question questionDtoToQuestion(QuestionDto questionDto) {
        return new Question(questionDto.getId(),
                questionDto.getQuestion(),
                questionDto.getCorrect_answer(),
                questionDto.getRightAnswer(),
                questionDto.getCategory(),
                questionDto.getQcmDto().getId(),
                questionDto.getOption1(),
                questionDto.getOption2(),
                questionDto.getOption3(),
                questionDto.getOption4());
    }
}
