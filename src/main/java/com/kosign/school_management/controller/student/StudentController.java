package com.kosign.school_management.controller.student;

import com.kosign.school_management.common.api.ApiResponse;
import com.kosign.school_management.common.api.HttpStatusCode;
import com.kosign.school_management.domain.entity.student.Student;
import com.kosign.school_management.payload.student.StudentRequest;
import com.kosign.school_management.service.student.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<?> getAllStudent(){
        ApiResponse<Object> response =  ApiResponse.builder()
                .status(HttpStatusCode.SUCCESS)
                .data(studentService.getAllStudent())
                .build();
        return ResponseEntity.ok().body(response);
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id){
        ApiResponse<Object> response =  ApiResponse.builder()
                .status(HttpStatusCode.SUCCESS)
                .data(studentService.findStudentById(id))
                .build();
         return ResponseEntity.ok().body(response);
    }

    @PostMapping("/student")
    public ResponseEntity<?> insertNewStudent(@RequestBody StudentRequest studentRequest){
        ApiResponse<Object> response =  ApiResponse.builder()
                .status(HttpStatusCode.SUCCESS)
                .data(studentService.insert(studentRequest))
                .build();
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable Long id){
        ApiResponse<Object> response = ApiResponse.builder()
                .status(HttpStatusCode.SUCCESS)
                .data("{}")
                .build();
     studentService.deleteStudentById(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<?> updateStudentById(@PathVariable Long id,@Valid @RequestBody StudentRequest studentRequest){
         ApiResponse<Object> response = ApiResponse.builder()
                 .status(HttpStatusCode.SUCCESS)
                 .data("{}")
                 .build();
         studentService.updateById(id,studentRequest);
         return ResponseEntity.ok().body(response);
    }




}
