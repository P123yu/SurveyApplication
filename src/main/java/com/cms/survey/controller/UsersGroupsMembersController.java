package com.cms.survey.controller;

import com.cms.survey.co.UsersGroupsMembersCo;
import com.cms.survey.dto.UsersGroupsMembersDTO;
import com.cms.survey.service.UsersGroupsMembersService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/group-user-member")
@Validated
public class UsersGroupsMembersController {

    private final UsersGroupsMembersService usersGroupsMembersService;

    public UsersGroupsMembersController(UsersGroupsMembersService usersGroupsMembersService) {
        this.usersGroupsMembersService = usersGroupsMembersService;
    }


    @PostMapping
    public ResponseEntity<ResponseUtil<UsersGroupsMembersDTO>> createSvSurveySchedule(@Valid @RequestBody UsersGroupsMembersCo usersGroupsMembersCo) {
        System.out.println(String.valueOf(usersGroupsMembersCo+"usersGroupsMembersCo"));
        UsersGroupsMembersDTO createdSubSurveyCat = usersGroupsMembersService.createUsers(usersGroupsMembersCo);
        ResponseUtil<UsersGroupsMembersDTO> response = ResponseUtil.<UsersGroupsMembersDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("Users Groups Members created successfully")
                .data(createdSubSurveyCat)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<ResponseUtil<UsersGroupsMembersDTO>> updateSvSurveySchedule(@PathVariable Long id, @Valid @RequestBody UsersGroupsMembersCo usersGroupsMembersCo) {
//        UsersGroupsMembersDTO updatedSurveySubCat = usersGroupsMembersService.updateUsers(id, usersGroupsMembersCo);
//        ResponseUtil<UsersGroupsMembersDTO> response = ResponseUtil.<UsersGroupsMembersDTO>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("Users Groups Members updated successfully")
//                .data(updatedSurveySubCat)
//                .build();
//        return ResponseEntity.ok(response);
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<ResponseUtil<Void>> deleteUsers(@PathVariable Long id) {
//        usersGroupsMembersService.deleteUsers(id);
//        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
//                .status(HttpStatus.NO_CONTENT.value())
//                .success(true)
//                .message("Users Groups Members deleted successfully")
//                .build();
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
//    }
//
//    @GetMapping("/list-all")
//    public ResponseEntity<ResponseUtil<List<UsersGroupsMembersDTO>>> getAllUsers() {
//        List<UsersGroupsMembersDTO> surveySubCatList = usersGroupsMembersService.getAllUsers();
//        ResponseUtil<List<UsersGroupsMembersDTO>> response = ResponseUtil.<List<UsersGroupsMembersDTO>>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("All Users Groups Members retrieved successfully")
//                .data(surveySubCatList)
//                .build();
//        return ResponseEntity.ok(response);
//    }
//
//
//    @GetMapping("/{userId}")
//    public ResponseEntity<ResponseUtil<UsersGroupsMembersDTO>> getUsersById(@PathVariable Long userId) {
//        UsersGroupsMembersDTO usersGroupsMembersDTO = usersGroupsMembersService.getUsersById(userId);
//        ResponseUtil<UsersGroupsMembersDTO> response = ResponseUtil.<UsersGroupsMembersDTO>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("UsersGroupsMembersById  retrieved successfully")
//                .data(usersGroupsMembersDTO)
//                .build();
//        return ResponseEntity.ok(response);
//    }

}

