package com.kosign.school_management.controller.student;

import com.kosign.school_management.common.api.ApiResponse;
import com.kosign.school_management.common.api.StatusCode;
import com.kosign.school_management.domain.entity.student.Student;
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
                .status(StatusCode.SUCCESS)
                .data(studentService.getAllStudent())
                .build();
        return ResponseEntity.ok().body(response);

    }
    @GetMapping("/student/{id}")
    public Object getStudentById(@PathVariable Long id){
        return studentService.findStudentById(id);
    }

    @PostMapping("/student")
    public Object insertNewStudent(@RequestBody Student student){
        return  studentService.insert(student);
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
