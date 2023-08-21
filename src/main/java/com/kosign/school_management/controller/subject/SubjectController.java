package com.kosign.school_management.controller.subject;

import com.kosign.school_management.service.subject.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class SubjectController {
    private final SubjectService subjectService;
    @GetMapping("/subjects")
    public Object getAllSubject(){
        return subjectService.findAll();
    }
}
