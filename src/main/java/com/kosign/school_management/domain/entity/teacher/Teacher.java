package com.kosign.school_management.domain.entity.teacher;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teacher_tb")
@Setter
@Getter
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id", nullable = false)
    private Long teacherId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "subject_taught", nullable = false)
    private String subjectTaught;

    @Column(name = "level",nullable = false)
    private String level;


    @Builder
    public Teacher(Long teacherId, String firstName, String lastName, String gender, String subjectTaught, String level) {
        this.teacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.subjectTaught = subjectTaught;
        this.level = level;
    }
}
