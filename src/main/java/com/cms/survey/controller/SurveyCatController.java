package com.cms.survey.controller;
import com.cms.survey.co.SurveyCatCo;
import com.cms.survey.dto.SurveyCatDTO;
import com.cms.survey.service.SurveyCatService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/survey-category")
@Validated
public class SurveyCatController   {

    private final SurveyCatService surveyCatService;

    public SurveyCatController(SurveyCatService surveyCatService) {
        this.surveyCatService = surveyCatService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<SurveyCatDTO>> createSurveyCat(@Valid @RequestBody SurveyCatCo surveyCatCo) {
        System.out.println(surveyCatCo+"surveyCatCo");
        SurveyCatDTO createdSurveyCat = surveyCatService.createSurveyCat(surveyCatCo);
        ResponseUtil<SurveyCatDTO> response = ResponseUtil.<SurveyCatDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("SurveyCat created successfully")
                .data(createdSurveyCat)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{catId}")
    public ResponseEntity<ResponseUtil<SurveyCatDTO>> updateSurveyCat(@PathVariable String catId, @Valid @RequestBody SurveyCatCo surveyCatCo) {
        SurveyCatDTO updatedSurveyCat = surveyCatService.updateSurveyCat(catId, surveyCatCo);
        ResponseUtil<SurveyCatDTO> response = ResponseUtil.<SurveyCatDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Survey updated successfully")
                .data(updatedSurveyCat)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{catId}")
    public ResponseEntity<ResponseUtil<Void>> deleteSurveyCat(@PathVariable String catId) {
        surveyCatService.deleteSurveyCat(catId);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("Survey Category deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("")
    public ResponseEntity<ResponseUtil<List<SurveyCatDTO>>> getAllSurveyCats() {
        List<SurveyCatDTO> surveyCatList = surveyCatService.getAllSurveyCat();
        ResponseUtil<List<SurveyCatDTO>> response = ResponseUtil.<List<SurveyCatDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All Survey Category retrieved successfully")
                .data(surveyCatList)
                .build();
        return ResponseEntity.ok(response);
    }


//    @GetMapping("/{catId}")
//    public ResponseEntity<ResponseUtil<SurveyCatDTO>> getSurveyCatById(@PathVariable String catId) {
//        SurveyCatDTO surveyCat = surveyCatService.getSurveyCatById(catId);
//        ResponseUtil<SurveyCatDTO> response = ResponseUtil.<SurveyCatDTO>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("Survey Category retrieved successfully")
//                .data(surveyCat)
//                .build();
//        return ResponseEntity.ok(response);
//    }
}

