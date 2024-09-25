package com.cms.survey.controller;

import com.cms.survey.co.QuestionMetaDataCo;
import com.cms.survey.dto.QuestionMetaDataDTO;
import com.cms.survey.service.QuestionMetaDataService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/master/questionMetaData")
@Validated
public class QuestionMetaDataController   {

    private final QuestionMetaDataService questionMetaDataService;

    public QuestionMetaDataController(QuestionMetaDataService questionMetaDataService) {
        this.questionMetaDataService = questionMetaDataService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<QuestionMetaDataDTO>> createQuestionMetaData(@Valid @RequestBody QuestionMetaDataCo questionMetaDataCo) {
        QuestionMetaDataDTO createdQuestionMetaDataDTO = questionMetaDataService.createQuestionMetaData(questionMetaDataCo);
        ResponseUtil<QuestionMetaDataDTO> response = ResponseUtil.<QuestionMetaDataDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("QuestionMetaData created successfully")
                .data(createdQuestionMetaDataDTO)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<QuestionMetaDataDTO>> updateQuestionMetaData(@PathVariable String id, @Valid @RequestBody QuestionMetaDataCo questionMetaDataCo) {
        QuestionMetaDataDTO updatedQuestionMetaDataDTO = questionMetaDataService.updateQuestionMetaData(id, questionMetaDataCo);
        ResponseUtil<QuestionMetaDataDTO> response = ResponseUtil.<QuestionMetaDataDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("QuestionMetaData updated successfully")
                .data(updatedQuestionMetaDataDTO)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteQuestionMetaData(@PathVariable String id) {
        questionMetaDataService.deleteQuestionMetaData(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("QuestionMetaData deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list-all")
    public ResponseEntity<ResponseUtil<List<QuestionMetaDataDTO>>> getAllQuestionMetaData() {
        List<QuestionMetaDataDTO> questionMetaDataList = questionMetaDataService.getAllQuestionMetaData();
        ResponseUtil<List<QuestionMetaDataDTO>> response = ResponseUtil.<List<QuestionMetaDataDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All QuestionMetaData retrieved successfully")
                .data(questionMetaDataList)
                .build();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseUtil<QuestionMetaDataDTO>> getQuestionMetaDataById(@PathVariable String id) {
        QuestionMetaDataDTO quiz = questionMetaDataService.getQuestionMetaDataById(id);
        ResponseUtil<QuestionMetaDataDTO> response = ResponseUtil.<QuestionMetaDataDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("QuestionMetaData retrieved successfully")
                .data(quiz)
                .build();
        return ResponseEntity.ok(response);
    }

}

