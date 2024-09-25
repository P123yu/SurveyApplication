//package com.cms.survey.controller;
//
//import com.cms.survey.co.SvSurveyScheduleCo;
//import com.cms.survey.dto.SvSurveyScheduleDTO;
//import com.cms.survey.service.SvSurveyScheduleService;
//import com.cms.survey.util.ResponseUtil;
//import jakarta.validation.Valid;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/api/master/SvSurvey")
//@Validated
//public class SvSurveyScheduleController {
//
//    private final SvSurveyScheduleService svSurveyScheduleService;
//
//    public SvSurveyScheduleController(SvSurveyScheduleService svSurveyScheduleService) {
//        this.svSurveyScheduleService = svSurveyScheduleService;
//    }
//
//
//    @PostMapping
//    public ResponseEntity<ResponseUtil<SvSurveyScheduleDTO>> createSvSurveySchedule(@Valid @RequestBody SvSurveyScheduleCo svSurveyScheduleCo) {
//        System.out.println(String.valueOf(svSurveyScheduleCo));
//        SvSurveyScheduleDTO createdSubSurveyCat = svSurveyScheduleService.createSvSurveySchedule(svSurveyScheduleCo);
//        ResponseUtil<SvSurveyScheduleDTO> response = ResponseUtil.<SvSurveyScheduleDTO>builder()
//                .status(HttpStatus.CREATED.value())
//                .success(true)
//                .message("Sv Survey Schedule created successfully")
//                .data(createdSubSurveyCat)
//                .build();
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<ResponseUtil<SvSurveyScheduleDTO>> updateSvSurveySchedule(@PathVariable Long id, @Valid @RequestBody SvSurveyScheduleCo svSurveyScheduleCo) {
//        SvSurveyScheduleDTO updatedSurveySubCat = svSurveyScheduleService.updateSvSurveySchedule(id, svSurveyScheduleCo);
//        ResponseUtil<SvSurveyScheduleDTO> response = ResponseUtil.<SvSurveyScheduleDTO>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("Survey Sub-Category updated successfully")
//                .data(updatedSurveySubCat)
//                .build();
//        return ResponseEntity.ok(response);
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<ResponseUtil<Void>> deleteSvSurveySchedule(@PathVariable Long id) {
//        svSurveyScheduleService.deleteSvSurveySchedule(id);
//        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
//                .status(HttpStatus.NO_CONTENT.value())
//                .success(true)
//                .message("Survey Sub-Category deleted successfully")
//                .build();
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
//    }
//
//    @GetMapping("/list-all")
//    public ResponseEntity<ResponseUtil<List<SvSurveyScheduleDTO>>> getAllSvSurveySchedule() {
//        List<SvSurveyScheduleDTO> surveySubCatList = svSurveyScheduleService.getAllSvSurveySchedule();
//        ResponseUtil<List<SvSurveyScheduleDTO>> response = ResponseUtil.<List<SvSurveyScheduleDTO>>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("All Survey Sub-Category retrieved successfully")
//                .data(surveySubCatList)
//                .build();
//        return ResponseEntity.ok(response);
//    }
//
//
//    @GetMapping("/{surveyId}")
//    public ResponseEntity<ResponseUtil<List<SvSurveyScheduleDTO>>> getSvSurveyScheduleBySurveyId(@PathVariable Long surveyId) {
//        List<SvSurveyScheduleDTO> svSurveySchedule = svSurveyScheduleService.getSvSurveyScheduleBySurveyId(surveyId);
//        ResponseUtil<List<SvSurveyScheduleDTO>> response = ResponseUtil.<List<SvSurveyScheduleDTO>>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("Survey Sub-Category retrieved successfully")
//                .data(svSurveySchedule)
//                .build();
//        return ResponseEntity.ok(response);
//    }
//
//}
