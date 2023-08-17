package com.kosign.school_management.service.teacher;

import com.kosign.school_management.domain.teacher.Teacher;
import com.kosign.school_management.payload.TeacherResponse;
import com.kosign.school_management.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService{


    private final TeacherRepository teacherRepository;

    public List<Teacher> getAllTeacher() {
    var teachers = teacherRepository.findAll();
        return teachers;
    }

    @Override
    public Object getById(Integer id) {
        return teacherRepository;
    }
}

