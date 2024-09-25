package com.cms.survey.controller;

import com.cms.survey.co.SurveyCatCo;
import com.cms.survey.co.SurveySubCatCo;
import com.cms.survey.dto.SurveySubCatDTO;
import com.cms.survey.service.SurveySubCatService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/survey-subcategory")
@Validated

public class SurveySubCatController {

    private final SurveySubCatService surveySubCatService;

    public SurveySubCatController(SurveySubCatService surveySubCatService) {
        this.surveySubCatService = surveySubCatService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<SurveySubCatDTO>> createSurveySubCat(@Valid @RequestBody SurveySubCatCo surveySubCatCo) {
        SurveySubCatDTO createdSubSurveyCat = surveySubCatService.createSurveySubCat(surveySubCatCo);
        ResponseUtil<SurveySubCatDTO> response = ResponseUtil.<SurveySubCatDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("SurveyCat created successfully")
                .data(createdSubSurveyCat)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{subCatId}")
    public ResponseEntity<ResponseUtil<SurveySubCatDTO>> updateSurveySubCat(@PathVariable String subCatId, @Valid @RequestBody SurveySubCatCo surveySubCatCo) {
        SurveySubCatDTO updatedSurveySubCat = surveySubCatService.updateSurveySubCat(subCatId, surveySubCatCo);
        ResponseUtil<SurveySubCatDTO> response = ResponseUtil.<SurveySubCatDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Survey Sub-Category updated successfully")
                .data(updatedSurveySubCat)
                .build();
        return ResponseEntity.ok(response);
    }


    @DeleteMapping("/{subCatId}")
    public ResponseEntity<ResponseUtil<Void>> deleteSurveySubCat(@PathVariable String subCatId) {
        surveySubCatService.deleteSurveySubCat(subCatId);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("Survey Sub-Category deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list/all/{catId}")
    public ResponseEntity<ResponseUtil<List<SurveySubCatDTO>>> getAllSurveySubCats(@PathVariable String catId) {
        List<SurveySubCatDTO> surveySubCatList = surveySubCatService.getAllSurveySubCat(catId);
        ResponseUtil<List<SurveySubCatDTO>> response = ResponseUtil.<List<SurveySubCatDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All Survey Sub-Category retrieved successfully")
                .data(surveySubCatList)
                .build();
        return ResponseEntity.ok(response);
    }


//    @GetMapping("/{id}")
//    public ResponseEntity<ResponseUtil<List<SurveySubCatDTO>>> getSurveyCatByCatId(@PathVariable String id) {
//        List<SurveySubCatDTO> surveySubCat = (List<SurveySubCatDTO>) surveySubCatService.getSurveyCatByCatId(id);
//        ResponseUtil<List<SurveySubCatDTO>> response = ResponseUtil.<SurveySubCatDTO>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("Survey Sub-Category retrieved successfully")
//                .data(surveySubCat)
//                .build();
//        return ResponseEntity.ok(response);
//    }

}
