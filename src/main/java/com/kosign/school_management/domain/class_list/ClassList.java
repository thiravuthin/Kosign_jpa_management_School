package com.kosign.school_management.domain.class_list;

import jakarta.persistence.*;

@Entity
@Table(name = "class_list_tb")
public class ClassList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "class_list_id")
    private Long classListId;
    @Column(name = "student_id")
    private Long studentId;
}
