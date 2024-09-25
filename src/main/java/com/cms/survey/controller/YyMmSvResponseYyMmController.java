package com.cms.survey.controller;

import com.cms.survey.co.YyMmSvResponseYyMmCo;
import com.cms.survey.dto.YyMmSvResponseYyMmDTO;
import com.cms.survey.service.UsersGroupService;
import com.cms.survey.service.YyMmSvResponseYyMmService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/master/YyMmSvResponseYyMm")
@Validated
public class YyMmSvResponseYyMmController   {

    private final YyMmSvResponseYyMmService yyMmSvResponseYyMmService ;

    public YyMmSvResponseYyMmController(YyMmSvResponseYyMmService yyMmSvResponseYyMmService) {
        this.yyMmSvResponseYyMmService = yyMmSvResponseYyMmService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<YyMmSvResponseYyMmDTO>> createYyMmResponse(@Valid @RequestBody YyMmSvResponseYyMmCo usersGroupCo) {
        YyMmSvResponseYyMmDTO createdQuiz = yyMmSvResponseYyMmService.createYyMmResponse(usersGroupCo);
        ResponseUtil<YyMmSvResponseYyMmDTO> response = ResponseUtil.<YyMmSvResponseYyMmDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("YyMmSvResponseYyMm created successfully")
                .data(createdQuiz)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<YyMmSvResponseYyMmDTO>> updateYyMmResponse(@PathVariable String id, @Valid @RequestBody YyMmSvResponseYyMmCo usersGroupCo) {
        YyMmSvResponseYyMmDTO updatedQuiz = yyMmSvResponseYyMmService.updateYyMmResponse(id, usersGroupCo);
        ResponseUtil<YyMmSvResponseYyMmDTO> response = ResponseUtil.<YyMmSvResponseYyMmDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("YyMmSvResponseYyMm updated successfully")
                .data(updatedQuiz)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteYyMmResponse(@PathVariable String id) {
        yyMmSvResponseYyMmService.deleteYyMmResponse(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("YyMmSvResponseYyMm deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list-all")
    public ResponseEntity<ResponseUtil<List<YyMmSvResponseYyMmDTO>>> getAllYyMmResponse() {
        List<YyMmSvResponseYyMmDTO> surveyList = yyMmSvResponseYyMmService.getAllYyMmResponse();
        ResponseUtil<List<YyMmSvResponseYyMmDTO>> response = ResponseUtil.<List<YyMmSvResponseYyMmDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All YyMmSvResponseYyMm  retrieved successfully")
                .data(surveyList)
                .build();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseUtil<YyMmSvResponseYyMmDTO>> getYyMmResponseById(@PathVariable String id) {
        YyMmSvResponseYyMmDTO survey = yyMmSvResponseYyMmService.getYyMmResponseById(id);
        ResponseUtil<YyMmSvResponseYyMmDTO> response = ResponseUtil.<YyMmSvResponseYyMmDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("YyMmSvResponseYyMm  retrieved successfully")
                .data(survey)
                .build();
        return ResponseEntity.ok(response);
    }

}
