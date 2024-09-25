package com.cms.survey.controller;
import com.cms.survey.co.SurveyScheduleCo;
import com.cms.survey.dto.SurveyScheduleDTO;
import com.cms.survey.service.SurveyScheduleService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/master/schedule")
@Validated

public class SurveyScheduleController {

    private final SurveyScheduleService surveyScheduleService;

    public SurveyScheduleController(SurveyScheduleService surveyScheduleService) {
        this.surveyScheduleService = surveyScheduleService;
    }

    @PostMapping("")
    public ResponseEntity<ResponseUtil<SurveyScheduleDTO>> createSurvey(@Valid @RequestBody SurveyScheduleCo surveyScheduleCo) {
        SurveyScheduleDTO createdSurveySchedule = surveyScheduleService.createSurveySchedule(surveyScheduleCo);
        ResponseUtil<SurveyScheduleDTO> response = ResponseUtil.<SurveyScheduleDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("Survey Schedule created successfully")
                .data(createdSurveySchedule)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<SurveyScheduleDTO>> updateSurvey(@PathVariable Long id, @Valid @RequestBody SurveyScheduleCo surveyScheduleCo) {
        SurveyScheduleDTO updatedSurveySchedule = surveyScheduleService.updateSurveySchedule(id, surveyScheduleCo);
        ResponseUtil<SurveyScheduleDTO> response = ResponseUtil.<SurveyScheduleDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Survey Schedule updated successfully")
                .data(updatedSurveySchedule)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteSurveySchedule(@PathVariable Long id) {
        surveyScheduleService.deleteSurveySchedule(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("Survey Schedule deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list-all")
    public ResponseEntity<ResponseUtil<List<SurveyScheduleDTO>>> getAllSurveys() {
        List<SurveyScheduleDTO> surveyList = surveyScheduleService.getAllSurveySchedule();
        ResponseUtil<List<SurveyScheduleDTO>> response = ResponseUtil.<List<SurveyScheduleDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All Survey Schedule retrieved successfully")
                .data(surveyList)
                .build();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseUtil<SurveyScheduleDTO>> getSurveyById(@PathVariable Long id) {
        SurveyScheduleDTO schedule = surveyScheduleService.getSurveyScheduleById(id);
        ResponseUtil<SurveyScheduleDTO> response = ResponseUtil.<SurveyScheduleDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Survey Schedule retrieved successfully")
                .data(schedule)
                .build();
        return ResponseEntity.ok(response);
    }

}
