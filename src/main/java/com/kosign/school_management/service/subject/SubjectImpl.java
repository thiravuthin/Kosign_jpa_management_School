package com.kosign.school_management.service.subject;

import com.kosign.school_management.domain.entity.subject.Subject;
import com.kosign.school_management.exception.MyResourceNotFoundException;
import com.kosign.school_management.payload.subject.SubjectRequest;
import com.kosign.school_management.payload.subject.SubjectResponse;
import com.kosign.school_management.repository.subject.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubjectImpl implements SubjectService{

    private final SubjectRepository subjectRepository;

    @Override
    public Object findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Object findSubjectById(Long id) {
        return subjectRepository.findById(id);
    }

    @Override
    public Object insertNewSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteSubjectById(Long id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public Object updateSubjectById(Long id, SubjectRequest subjectRequest) {

        Optional<Subject> optionalSubject = Optional.of(subjectRepository.findById(id).orElseThrow(
                () -> new MyResourceNotFoundException("Id is not found !" + id)));

        optionalSubject.stream().map(subject ->
                SubjectResponse.builder()
                        .subjectId(subject.getSubjectId())
                        .subjectName(subject.getSubjectName())
                        .build()
        ).toList();
        return subjectRepository.save(optionalSubject.get());
    }
}
