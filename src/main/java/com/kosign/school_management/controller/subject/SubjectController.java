package com.kosign.school_management.controller.subject;

import com.kosign.school_management.domain.entity.subject.Subject;
import com.kosign.school_management.payload.subject.SubjectRequest;
import com.kosign.school_management.service.subject.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")

public class SubjectController {

    private final SubjectService subjectService;
    @GetMapping("/subjects")
    public Object getAllSubject(){
        return subjectService.findAll();
    }

    @GetMapping("/subject/{id}")
    public Object getSubjectById(@PathVariable Long id ){
        return subjectService.findSubjectById(id);
    }

    @PostMapping("/subject")
    public Object InsertNewSubject(@RequestBody Subject subject){
        return subjectService.insertNewSubject(subject);
    }

    @DeleteMapping("/subject/{id}")
    public void deleteSubjectById(@PathVariable Long id){
         subjectService.deleteSubjectById(id);
    }

    @PutMapping("/subject/{id}")
    public Object updateSubject(@PathVariable Long id, @RequestBody SubjectRequest subjectRequest){
        return subjectService.updateSubjectById(id, subjectRequest);
    }



}
