package com.cms.survey.controller;

import com.cms.survey.co.QuestionCo;
import com.cms.survey.dto.QuestionDTO;
import com.cms.survey.service.QuestionService;
import com.cms.survey.service.SurveyService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/master/question")
@Validated
public class QuestionController   {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<QuestionDTO>> createQuestion(@Valid @RequestBody QuestionCo questionCo) {
        QuestionDTO createdQuiz = questionService.createQuestion(questionCo);
        ResponseUtil<QuestionDTO> response = ResponseUtil.<QuestionDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("question created successfully")
                .data(createdQuiz)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<QuestionDTO>> updateQuestion(@PathVariable String id, @Valid @RequestBody QuestionCo questionCo) {
        QuestionDTO updatedQuiz = questionService.updateQuestion(id, questionCo);
        ResponseUtil<QuestionDTO> response = ResponseUtil.<QuestionDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("question updated successfully")
                .data(updatedQuiz)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteQuestion(@PathVariable String id) {
        questionService.deleteQuestion(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("question deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list-all")
    public ResponseEntity<ResponseUtil<List<QuestionDTO>>> getAllQuestion() {
        List<QuestionDTO> surveyList = questionService.getAllQuestion();
        ResponseUtil<List<QuestionDTO>> response = ResponseUtil.<List<QuestionDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All question retrieved successfully")
                .data(surveyList)
                .build();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseUtil<QuestionDTO>> getQuestionById(@PathVariable String id) {
        QuestionDTO survey = questionService.getQuestionById(id);
        ResponseUtil<QuestionDTO> response = ResponseUtil.<QuestionDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("question retrieved successfully")
                .data(survey)
                .build();
        return ResponseEntity.ok(response);
    }

}
