package com.kosign.school_management.domain.student;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;
    @Column(name = "f_name")
    private String fName;
    @Column(name = "l_name")
    private String lName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "group_year")
    private Integer groupYear;


}
