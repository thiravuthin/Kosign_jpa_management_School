package com.kosign.school_management.service.student;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentService {

    Object getAllStudent();

   Object findStudentById(Long id);
}
