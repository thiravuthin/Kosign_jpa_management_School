package com.kosign.school_management.service.teacher;

import com.kosign.school_management.payload.teacher.TeacherRequest;

public interface TeacherService {
    Object getTeachers();

    Object getTeacherById(Long id);


    void delete(Long id);

    Object insertNewTeacher(TeacherRequest teacherRequest);

    Object updateTeacherById(Long id, TeacherRequest teacherRequest);
}
