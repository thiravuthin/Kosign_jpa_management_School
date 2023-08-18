package com.kosign.school_management.controller.teacher;

import com.kosign.school_management.common.api.ApiResponse;
import com.kosign.school_management.common.api.ApiStatus;
import com.kosign.school_management.common.api.StatusCode;
import com.kosign.school_management.payload.teacher.TeacherRequest;
import com.kosign.school_management.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/teachers")
    public ResponseEntity<?> getAllTeacher(  ) {
        var response =  ApiResponse.builder()
                .status(StatusCode.SUCCESS)
                .data(teacherService.getTeachers())
                .build();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/teacher/{id}")
    public Object getTeacherByNameOrId(@PathVariable Long id){
        return teacherService.getTeacherById(id);
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
    public Object updateTeacherById(@PathVariable Long id, @RequestBody TeacherRequest teacherRequest){
        return teacherService.updateTeacherById(id, teacherRequest);
    }

}
