package com.cms.survey.controller;

import com.cms.survey.co.SurveyScheduleBlockCo;
import com.cms.survey.co.SurveyScheduleCo;
import com.cms.survey.dto.SurveyScheduleBlockDTO;
import com.cms.survey.dto.SurveyScheduleDTO;
import com.cms.survey.service.SurveyScheduleBlockService;
import com.cms.survey.service.SurveyScheduleService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/master/block")
@Validated

public class SurveyScheduleBlockController {

    private final SurveyScheduleBlockService surveyScheduleBlockService;

    public SurveyScheduleBlockController(SurveyScheduleBlockService surveyScheduleBlockService) {
        this.surveyScheduleBlockService = surveyScheduleBlockService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<SurveyScheduleBlockDTO>> createSurveyScheduleBlock(@Valid @RequestBody SurveyScheduleBlockCo surveyScheduleBlockCo) {
        SurveyScheduleBlockDTO createdSurveySchedule = surveyScheduleBlockService.createSurveyScheduleBlock(surveyScheduleBlockCo);
        ResponseUtil<SurveyScheduleBlockDTO> response = ResponseUtil.<SurveyScheduleBlockDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("Survey Schedule created successfully")
                .data(createdSurveySchedule)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<SurveyScheduleBlockDTO>> updateSurveyScheduleBlock(@PathVariable Long id, @Valid @RequestBody SurveyScheduleBlockCo surveyScheduleBlockCo) {
        SurveyScheduleBlockDTO updatedSurveySchedule = surveyScheduleBlockService.updateSurveyScheduleBlock(id, surveyScheduleBlockCo);
        ResponseUtil<SurveyScheduleBlockDTO> response = ResponseUtil.<SurveyScheduleBlockDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Survey Schedule updated successfully")
                .data(updatedSurveySchedule)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteSurveyScheduleBlock(@PathVariable Long id) {
        surveyScheduleBlockService.deleteSurveyScheduleBlock(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("Survey Schedule Block deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }




    @GetMapping("/schedule/{surveyScheduleId}")
    public ResponseEntity<ResponseUtil<SurveyScheduleBlockDTO>> getSurveyById(@PathVariable Integer surveyScheduleId) {
        SurveyScheduleBlockDTO scheduleBlock = surveyScheduleBlockService.getSurveyScheduleBlockByScheduleId(surveyScheduleId);
        ResponseUtil<SurveyScheduleBlockDTO> response = ResponseUtil.<SurveyScheduleBlockDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Survey Schedule Block retrieved successfully")
                .data(scheduleBlock)
                .build();
        return ResponseEntity.ok(response);
    }

}
