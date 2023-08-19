package com.kosign.school_management.controller.teacher;

import com.kosign.school_management.domain.teacher.Teacher;
import com.kosign.school_management.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/get-all-teacher")
    public Object getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    @GetMapping("/get-teacher-by-id/{id}")
    public Object getTeacherByNameOrId(@PathVariable Long id){
        return teacherService.getById(id);
    }

    @PostMapping("/insert-teacher")
    public Object insertTeacher(@RequestBody Teacher teacher){
        return teacherService.insert(teacher);
    }

    @DeleteMapping("/delete-teacher/{id}")
    public void deleteTeacher(@PathVariable Long id){
            teacherService.delete(id);
    }

//    @PutMapping("/update-teacher")
//    public

}

