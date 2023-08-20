package com.kosign.school_management.repository.student;

import com.kosign.school_management.domain.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long > {

}
