package com.kosign.school_management.repository;

import com.kosign.school_management.domain.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {

    List<Teacher> findAllBy();
}
