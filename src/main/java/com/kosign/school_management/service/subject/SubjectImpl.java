package com.kosign.school_management.service.subject;

import com.kosign.school_management.repository.subject.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectImpl implements SubjectService{

    private final SubjectRepository subjectRepository;

    @Override
    public Object findAll() {
        return subjectRepository.findAll();
    }
}
