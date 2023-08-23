package com.kosign.school_management.repository.teacher;

import com.kosign.school_management.domain.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findByTeacherId(Long teacherId);
//    @Query("select t from Teacher t where t.teacherId = ?1 and t.firstName= ?2")


    Optional<Teacher> findTeacherByTeacherIdAndFirstName( Long id , String name);

}
