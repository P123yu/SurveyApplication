package com.cms.survey.controller;

import com.cms.survey.co.SurveyCo;
import com.cms.survey.co.SurveyScheduleConfigCo;
import com.cms.survey.dto.SurveyDTO;
import com.cms.survey.dto.SurveyScheduleConfigRenderDTO;
//import com.cms.survey.model.SurveyScheduleConfig;
import com.cms.survey.model.Survey;
import com.cms.survey.service.SurveyService;
import com.cms.survey.util.ResponseUtil;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/survey")
@Validated
public class SurveyController   {

    private final SurveyService surveyService;

    public SurveyController(SurveyService quizService) {
        this.surveyService = quizService;
    }

    @PostMapping("")
    public ResponseEntity<ResponseUtil<SurveyDTO>> createSurvey(@Valid @RequestBody SurveyCo surveyCo) {
        SurveyDTO createdQuiz = surveyService.createSurvey(surveyCo);
        ResponseUtil<SurveyDTO> response = ResponseUtil.<SurveyDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("Survey created successfully")
                .data(createdQuiz)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<SurveyDTO>> updateSurvey(@PathVariable String id, @Valid @RequestBody SurveyCo surveyCo) {
        SurveyDTO updatedQuiz = surveyService.updateSurvey(id, surveyCo);
        ResponseUtil<SurveyDTO> response = ResponseUtil.<SurveyDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Survey updated successfully")
                .data(updatedQuiz)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteSurvey(@PathVariable String id) {
        surveyService.deleteSurvey(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("Survey deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("")
    public ResponseEntity<ResponseUtil<List<SurveyDTO>>> getAllSurveys() {
        List<SurveyDTO> surveyList = surveyService.getAllSurvey();
        ResponseUtil<List<SurveyDTO>> response = ResponseUtil.<List<SurveyDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All Survey retrieved successfully")
                .data(surveyList)
                .build();
        return ResponseEntity.ok(response);
    }

    @PutMapping("/list")
    public ResponseEntity<ResponseUtil<List<SurveyDTO>>> getAllSurveyPageAndSort(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "30") int perPage,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String order) {

        List<SurveyDTO> surveyList = surveyService.getAllSurveyPageAndSort(page, perPage, sortBy, order);
        ResponseUtil<List<SurveyDTO>> response = ResponseUtil.<List<SurveyDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All Survey retrieved Page And Sort successfully")
                .data(surveyList)
                .build();
        return ResponseEntity.ok(response);
    }

//    @GetMapping("/list")
//    public ResponseEntity<Page<Survey>> listSurveys(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "30") int perPage,
//            @RequestParam(defaultValue = "id") String[] sortBy,
//            @RequestParam(defaultValue = "asc") String[] order) {
//
//        // Use the service to get the paginated and sorted surveys
//        Page<Survey> surveys = surveyService.listSurveys(page, perPage, sortBy, order);
//
//        return ResponseEntity.ok(surveys);
//    }



    @GetMapping("/{id}")
    public ResponseEntity<ResponseUtil<SurveyDTO>> getSurveyById(@PathVariable String id) {
        SurveyDTO survey = surveyService.getSurveyById(id);
        ResponseUtil<SurveyDTO> response = ResponseUtil.<SurveyDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Survey retrieved successfully")
                .data(survey)
                .build();
        return ResponseEntity.ok(response);
    }



//    @PostMapping("/v1/survey/build")
//    public ResponseEntity<ResponseUtil<SurveyScheduleConfig>> v1CreateSurvey(@Valid @RequestBody SurveyScheduleConfigCo surveyScheduleConfigCo) {
//     SurveyScheduleConfig createdQuiz =
//            surveyService.saveSurveyScheduleConfig(surveyScheduleConfigCo);
//        ResponseUtil<SurveyScheduleConfig> response = ResponseUtil.<SurveyScheduleConfig>builder()
//            .status(HttpStatus.CREATED.value())
//            .success(true)
//            .message("Survey created successfully")
//            .data(createdQuiz)
//            .build();
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
//
//    @GetMapping("/v1/survey/build/by-schedule/{scheduleId}")
//    public ResponseEntity<ResponseUtil<List<SurveyScheduleConfigRenderDTO>>>  getConfigsByScheduleId(@PathVariable Integer scheduleId) {
//        List<SurveyScheduleConfigRenderDTO> surveyConfig = surveyService.getConfigsByScheduleId(scheduleId);
//
//        ResponseUtil<List<SurveyScheduleConfigRenderDTO>> response = ResponseUtil.<List<SurveyScheduleConfigRenderDTO>>builder()
//            .status(HttpStatus.OK.value())
//            .success(true)
//            .message("All Survey retrieved successfully")
//            .data(surveyConfig)
//            .build();
//        return ResponseEntity.ok(response);
//    }
//

}
