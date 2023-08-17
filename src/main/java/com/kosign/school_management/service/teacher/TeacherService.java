package com.kosign.school_management.service.teacher;

import com.kosign.school_management.domain.teacher.Teacher;

public interface TeacherService {
    Object getAllTeacher();

    Object getById(Long id);


    void delete(Long id);

    Object insert(Teacher teacher);
}
