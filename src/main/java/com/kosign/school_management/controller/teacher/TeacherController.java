package com.kosign.school_management.controller.teacher;

import com.kosign.school_management.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/teacher")
    public Object getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    @GetMapping("/get-teacher-by-name-or-id")
    public Object getTeacherByNameOrId(@PathVariable Integer id){
        return teacherService.getById(id);
    }

}
