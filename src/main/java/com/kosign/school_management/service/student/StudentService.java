package com.kosign.school_management.service.student;

import com.kosign.school_management.domain.entity.student.Student;
import com.kosign.school_management.payload.student.StudentRequest;
import com.kosign.school_management.payload.student.StudentResponse;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentService {

    Object getAllStudent();

   Object findStudentById(Long id);

    Object insert(StudentRequest studentRequest);

    void deleteStudentById(Long id);

    Object updateById(Long id, Student student);
}
