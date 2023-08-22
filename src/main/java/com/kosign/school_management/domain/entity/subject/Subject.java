package com.kosign.school_management.domain.entity.subject;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_subject")
@Getter
@Setter
@NoArgsConstructor
@Builder
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "subject_name")
    private String subjectName;

    @Builder
    public Subject(Long subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }
}
