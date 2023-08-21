package com.kosign.school_management.domain.entity.classlist;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_class_list")
public class ClassList {
    @Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "class_list_id")
    private Long classListId;
    @Column(name = "student_id")
    private Long studentId;
}
