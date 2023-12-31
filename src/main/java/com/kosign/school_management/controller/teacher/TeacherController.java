package com.kosign.school_management.controller.teacher;

import com.kosign.school_management.common.api.ApiResponse;
import com.kosign.school_management.common.api.HttpStatusCode;
import com.kosign.school_management.payload.teacher.TeacherRequest;
import com.kosign.school_management.service.teacher.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/teachers")
    public ResponseEntity<?> getAllTeacher() {
        ApiResponse response =  ApiResponse.builder()
                .status(HttpStatusCode.SUCCESS)
                .data(teacherService.getTeachers())
                .build();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/teacher/{id}")
    public ResponseEntity<?> getTeacherByNameOrId(@PathVariable Long id){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatusCode.SUCCESS)
                .data(teacherService.getTeacherById(id))
                .build();
        return ResponseEntity.ok().body(apiResponse);
    }

    @PostMapping("/teacher")
    public Object insertTeacher(@RequestBody TeacherRequest teacherRequest){

        return teacherService.insertNewTeacher(teacherRequest);
    }

    @DeleteMapping("/teacher/{id}")
    public void deleteTeacher(@PathVariable Long id){
            teacherService.delete(id);
    }

    @PutMapping("/teacher/{id}")
    public Object updateTeacherById(@PathVariable Long id,@Valid @RequestBody TeacherRequest teacherRequest){
        return teacherService.updateTeacherById(id, teacherRequest);
    }

}

