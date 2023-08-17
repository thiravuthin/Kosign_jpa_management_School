package com.kosign.school_management.service.teacher;

import com.kosign.school_management.domain.teacher.Teacher;
import com.kosign.school_management.payload.TeacherResponse;
import com.kosign.school_management.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService{

    private final TeacherRepository teacherRepository;

    public Object getAllTeacher() {
        return  teacherRepository.findAll();
    }

    @Override
    public Object getById(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Object insert(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void delete( Long id) {
        teacherRepository.deleteById(id);
    }
}

