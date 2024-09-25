package com.cms.survey.controller;

import com.cms.survey.co.SectionCo;
import com.cms.survey.dto.SectionDTO;
import com.cms.survey.service.SectionService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/master/section")
@Validated
public class SectionController   {

    private final SectionService sectionService;

    public SectionController(SectionService sectionService) {
        this.sectionService = sectionService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<SectionDTO>> createSection(@Valid @RequestBody SectionCo sectionCo) {
        SectionDTO createdSection = sectionService.createSection(sectionCo);
        ResponseUtil<SectionDTO> response = ResponseUtil.<SectionDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("Section created successfully")
                .data(createdSection)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<SectionDTO>> updateSection(@PathVariable String id, @Valid @RequestBody SectionCo sectionCo) {
        SectionDTO updatedSection = sectionService.updateSection(id, sectionCo);
        ResponseUtil<SectionDTO> response = ResponseUtil.<SectionDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Section updated successfully")
                .data(updatedSection)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteSection(@PathVariable String id) {
        sectionService.deleteSection(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("Section deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list-all")
    public ResponseEntity<ResponseUtil<List<SectionDTO>>> getAllSection() {
        List<SectionDTO> sectionList = sectionService.getAllSection();
        ResponseUtil<List<SectionDTO>> response = ResponseUtil.<List<SectionDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All Section retrieved successfully")
                .data(sectionList)
                .build();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseUtil<SectionDTO>> getSectionById(@PathVariable String id) {
        SectionDTO sectionDto = sectionService.getSectionById(id);
        ResponseUtil<SectionDTO> response = ResponseUtil.<SectionDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Section retrieved successfully")
                .data(sectionDto)
                .build();
        return ResponseEntity.ok(response);
    }

//    @PostMapping("/v1/survey/build")
//    public ResponseEntity<ResponseUtil<SurveyScheduleConfig>> v1CreateSurvey(@Valid @RequestBody SurveyScheduleConfigCo surveyScheduleConfigCo) {
//     SurveyScheduleConfig createdQuiz =
//            sectionService.saveSurveyScheduleConfig(surveyScheduleConfigCo);
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
//        List<SurveyScheduleConfigRenderDTO> surveyConfig = sectionService.getConfigsByScheduleId(scheduleId);
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

