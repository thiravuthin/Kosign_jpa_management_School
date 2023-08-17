package com.kosign.school_management.domain.subject;

import jakarta.persistence.*;

@Entity
@Table(name = "subject_tb")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;
    @Column(name = "subject_name")
    private String subjectName;
}
