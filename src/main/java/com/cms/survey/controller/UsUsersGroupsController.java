//package com.cms.survey.controller;
//
//import com.cms.survey.co.UsUsersGroupsCo;
//import com.cms.survey.dto.UsUsersGroupsDTO;
//import com.cms.survey.service.UsUsersGroupsService;
//
//import com.cms.survey.util.ResponseUtil;
//import jakarta.validation.Valid;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/api/master/users_groups")
//@Validated
//public class UsUsersGroupsController {
//
//    private final UsUsersGroupsService usUsersGroupsService;
//
//    public UsUsersGroupsController(UsUsersGroupsService usUsersGroupsService) {
//        this.usUsersGroupsService = usUsersGroupsService;
//    }
//
//
//    @PostMapping
//    public ResponseEntity<ResponseUtil<UsUsersGroupsDTO>> createSvSurveySchedule(@Valid @RequestBody UsUsersGroupsCo usUsersGroupsCo) {
//        UsUsersGroupsDTO createdSubSurveyCat = usUsersGroupsService.createUsers(usUsersGroupsCo);
//        ResponseUtil<UsUsersGroupsDTO> response = ResponseUtil.<UsUsersGroupsDTO>builder()
//                .status(HttpStatus.CREATED.value())
//                .success(true)
//                .message("Users Groups created successfully")
//                .data(createdSubSurveyCat)
//                .build();
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<ResponseUtil<UsUsersGroupsDTO>> updateSvSurveySchedule(@PathVariable Long id, @Valid @RequestBody UsUsersGroupsCo usUsersGroupsCo) {
//        UsUsersGroupsDTO updatedSurveySubCat = usUsersGroupsService.updateUsers(id, usUsersGroupsCo);
//        ResponseUtil<UsUsersGroupsDTO> response = ResponseUtil.<UsUsersGroupsDTO>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("Users Groups updated successfully")
//                .data(updatedSurveySubCat)
//                .build();
//        return ResponseEntity.ok(response);
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<ResponseUtil<Void>> deleteUsers(@PathVariable Long id) {
//        usUsersGroupsService.deleteUsers(id);
//        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
//                .status(HttpStatus.NO_CONTENT.value())
//                .success(true)
//                .message("Users Groups deleted successfully")
//                .build();
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
//    }
//
//    @GetMapping("/list-all")
//    public ResponseEntity<ResponseUtil<List<UsUsersGroupsDTO>>> getAllUsers() {
//        List<UsUsersGroupsDTO> surveySubCatList = usUsersGroupsService.getAllUsers();
//        ResponseUtil<List<UsUsersGroupsDTO>> response = ResponseUtil.<List<UsUsersGroupsDTO>>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("All Users Groups retrieved successfully")
//                .data(surveySubCatList)
//                .build();
//        return ResponseEntity.ok(response);
//    }
//
//
//    @GetMapping("/{userId}")
//    public ResponseEntity<ResponseUtil<UsUsersGroupsDTO>> getUsersById(@PathVariable Long userId) {
//        UsUsersGroupsDTO usersDTO = usUsersGroupsService.getUsersById(userId);
//        ResponseUtil<UsUsersGroupsDTO> response = ResponseUtil.<UsUsersGroupsDTO>builder()
//                .status(HttpStatus.OK.value())
//                .success(true)
//                .message("getUsersGroupsById  retrieved successfully")
//                .data(usersDTO)
//                .build();
//        return ResponseEntity.ok(response);
//    }
//
//}
