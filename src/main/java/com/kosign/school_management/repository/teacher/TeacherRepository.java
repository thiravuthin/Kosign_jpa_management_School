package com.kosign.school_management.repository.teacher;

import com.kosign.school_management.domain.entity_teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findByTeacherId(Long teacherId);

}
