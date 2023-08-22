package com.kosign.school_management.service.subject;

import com.kosign.school_management.domain.entity.subject.Subject;
import com.kosign.school_management.payload.subject.SubjectRequest;

public interface SubjectService {

    Object findAll();

    Object findSubjectById(Long id);

    Object insertNewSubject(Subject subject);

    void deleteSubjectById(Long id);

    Object updateSubjectById(Long id, SubjectRequest subject);
}
