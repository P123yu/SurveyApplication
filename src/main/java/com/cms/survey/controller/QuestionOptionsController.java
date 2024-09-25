package com.cms.survey.controller;

import com.cms.survey.co.QuestionOptionsCo;
import com.cms.survey.dto.QuestionOptionsDTO;
import com.cms.survey.service.QuestionOptionsService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/master/questionOptions")
@Validated
public class QuestionOptionsController   {

    private final QuestionOptionsService questionOptionsService;

    public QuestionOptionsController(QuestionOptionsService questionOptionsService) {
        this.questionOptionsService = questionOptionsService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<QuestionOptionsDTO>> createQuestionOptions(@Valid @RequestBody QuestionOptionsCo questionOptionsCo) {
        QuestionOptionsDTO createdQuestionOptions= questionOptionsService.createQuestionOptions(questionOptionsCo);
        ResponseUtil<QuestionOptionsDTO> response = ResponseUtil.<QuestionOptionsDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("questionOptions created successfully")
                .data(createdQuestionOptions)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<QuestionOptionsDTO>> updateQuestionOptions(@PathVariable String id, @Valid @RequestBody QuestionOptionsCo questionOptionsCo) {
        QuestionOptionsDTO updatedQuestionOptions = questionOptionsService.updateQuestionOptions(id, questionOptionsCo);
        ResponseUtil<QuestionOptionsDTO> response = ResponseUtil.<QuestionOptionsDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("questionOptions updated successfully")
                .data(updatedQuestionOptions)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteQuestionOptions(@PathVariable String id) {
        questionOptionsService.deleteQuestionOptions(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("questionOptions deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list-all")
    public ResponseEntity<ResponseUtil<List<QuestionOptionsDTO>>> getAllQuestionOptions() {
        List<QuestionOptionsDTO> questionOptionsList = questionOptionsService.getAllQuestionOptions();
        ResponseUtil<List<QuestionOptionsDTO>> response = ResponseUtil.<List<QuestionOptionsDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All questionOptions retrieved successfully")
                .data(questionOptionsList)
                .build();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseUtil<QuestionOptionsDTO>> getQuestionOptionsById(@PathVariable String id) {
        QuestionOptionsDTO questionOptions = questionOptionsService.getQuestionOptionsById(id);
        ResponseUtil<QuestionOptionsDTO> response = ResponseUtil.<QuestionOptionsDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("questionOptions retrieved successfully")
                .data(questionOptions)
                .build();
        return ResponseEntity.ok(response);
    }

}
