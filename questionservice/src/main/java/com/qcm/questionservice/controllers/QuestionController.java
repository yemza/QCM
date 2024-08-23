package com.qcm.questionservice.controllers;



import com.qcm.questionservice.dto.QuestionDto;
import com.qcm.questionservice.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/question")
@AllArgsConstructor
public class QuestionController {

    private QuestionService questionService;

    @GetMapping("/all")
    public List<QuestionDto> getAllQcm() {
        return questionService.getAllQcm();
    }

    @GetMapping("/{questionId}")
    public QuestionDto getQcmById(@PathVariable("questionId") Long questionId) {
        return questionService.getQcmById(questionId);
    }

    @PostMapping("/create")
    public QuestionDto createQcm(@RequestBody QuestionDto questionDto) {
        return questionService.createQcm(questionDto);
    }

    @PutMapping("/update")
    public QuestionDto updateQcm(@RequestBody QuestionDto questionDto) {
        return  questionService.updateQcm(questionDto);
    }

    @GetMapping("/delete/{id}")
    public void deleteQCM(@PathVariable("questionId") Long questionId) {
        questionService.deleteQCM(questionId);
    }
}
