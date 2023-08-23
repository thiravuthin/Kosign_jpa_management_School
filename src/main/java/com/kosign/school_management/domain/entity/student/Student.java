package com.kosign.school_management.domain.entity.student;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "tb_student")
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;
    @Column(name = "first_name")
    private String  firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "group_year")
    private Integer groupYear;
    @Column(name = "status", nullable = false, columnDefinition = "char(1)")
    private Integer status;

    @Builder
    public Student(Long id, String firstName, String lastName, String gender, Date dateOfBirth, Integer groupYear, Integer status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.groupYear = groupYear;
        this.status= status;
    }
}
