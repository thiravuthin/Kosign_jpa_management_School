package com.kosign.school_management.repository.student;

import com.kosign.school_management.domain.entity.student.Student;
import com.kosign.school_management.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface StudentRepository extends JpaRepository<Student, Long > {
//    @Query("select s from Student s where cast(s.id as text) = ?1 and s.status = ?2")

    @Query(value="select tc.teacher_id from tb_teacher tc where teacher_id = :id ", nativeQuery = true)
    Optional<Student> findStudentById(@Param("id") Long id);




}
