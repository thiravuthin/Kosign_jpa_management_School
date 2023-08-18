package com.kosign.school_management.controller.student;

import com.kosign.school_management.common.api.ApiResponse;
import com.kosign.school_management.common.api.StatusCode;
import com.kosign.school_management.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudent(){
        ApiResponse<Object> response =  ApiResponse.builder()
                .status(StatusCode.SUCCESS)
                .data(studentService.getAllStudent())
                .build();
        return ResponseEntity.ok().body(response);

    }
    @GetMapping("/student/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Integer id){
        return null;
    }


}
