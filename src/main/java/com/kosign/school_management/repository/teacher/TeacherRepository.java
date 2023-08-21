package com.kosign.school_management.repository.teacher;

import com.kosign.school_management.domain.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findByTeacherId(Long teacherId);

}
