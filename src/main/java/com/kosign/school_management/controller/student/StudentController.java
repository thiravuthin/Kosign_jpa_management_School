package com.kosign.school_management.controller.student;

import com.kosign.school_management.common.api.ApiResponse;
import com.kosign.school_management.common.api.HttpStatusCode;
import com.kosign.school_management.domain.entity.student.Student;
import com.kosign.school_management.payload.student.StudentRequest;
import com.kosign.school_management.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public void deleteStudentById(@PathVariable Long id){
         studentService.deleteStudentById(id);
    }

    @PutMapping("/student")
    public Object updateStudentById(@PathVariable Long id, @RequestBody Student student){

        return studentService.updateById(id,student);
    }

}
