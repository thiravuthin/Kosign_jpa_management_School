package com.kosign.school_management.domain.teacher;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "teacher_db")
@ToString
@Setter
@Getter
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Long teacherId;

    @Column(name = "f_name", nullable = false)
    private String firstName;

    @Column(name = "l_name", nullable = false)
    private String lastName;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "subject_Taught", nullable = false)
    private String subjectTaught;

    @Column(name = "level",nullable = false)
    private String level;
}
