package com.cms.survey.controller;
import com.cms.survey.co.UsersCo;
import com.cms.survey.dto.UsersDTO;
import com.cms.survey.service.UsersService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/users")
@Validated
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }


    @PostMapping
    public ResponseEntity<ResponseUtil<UsersDTO>> createSvSurveySchedule(@Valid @RequestBody UsersCo usersCo) {
        UsersDTO createdSubSurveyCat = usersService.createUsers(usersCo);
        ResponseUtil<UsersDTO> response = ResponseUtil.<UsersDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("Users created successfully")
                .data(createdSubSurveyCat)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<UsersDTO>> updateSvSurveySchedule(@PathVariable Long id, @Valid @RequestBody UsersCo usersCo) {
        UsersDTO updatedSurveySubCat = usersService.updateUsers(id, usersCo);
        ResponseUtil<UsersDTO> response = ResponseUtil.<UsersDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("Users updated successfully")
                .data(updatedSurveySubCat)
                .build();
        return ResponseEntity.ok(response);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteUsers(@PathVariable Long id) {
        usersService.deleteUsers(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("Users deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list-all")
    public ResponseEntity<ResponseUtil<List<UsersDTO>>> getAllUsers() {
        List<UsersDTO> surveySubCatList = usersService.getAllUsers();
        ResponseUtil<List<UsersDTO>> response = ResponseUtil.<List<UsersDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All Users  retrieved successfully")
                .data(surveySubCatList)
                .build();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{userId}")
    public ResponseEntity<ResponseUtil<UsersDTO>> getUsersById(@PathVariable Long userId) {
        UsersDTO usersDTO = usersService.getUsersById(userId);
        ResponseUtil<UsersDTO> response = ResponseUtil.<UsersDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("getUsersById  retrieved successfully")
                .data(usersDTO)
                .build();
        return ResponseEntity.ok(response);
    }

}
