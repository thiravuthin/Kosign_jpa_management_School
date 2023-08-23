package com.kosign.school_management.service.student;

import com.kosign.school_management.domain.entity.student.Student;
import com.kosign.school_management.payload.student.StudentRequest;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentService {

    Object getAllStudent();

   Object findStudentById(Long id);

    Object insert(StudentRequest studentRequest);

    Optional<Student> deleteStudentById(Long id);

    void updateById(Long id, StudentRequest student);
}
