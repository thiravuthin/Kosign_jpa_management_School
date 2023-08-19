package com.kosign.school_management.domain.entity_class;

import com.kosign.school_management.domain.entity_classlist.ClassList;
import com.kosign.school_management.domain.entity_classroom.Classroom;
import com.kosign.school_management.domain.entity_subject.Subject;
import com.kosign.school_management.domain.entity_teacher.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "class_tb")
@Getter
@Setter
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "class_id")
    private Long classId;

    @ManyToOne
    @JoinColumn(name = "class_room_id")
    private Classroom classRoomId;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subjectId;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacherId;

    @ManyToOne
    @JoinColumn(name = "class_list_id")
    private ClassList classListId;

//    @Column(name = "period_time")
//    private Period periodTime;

}
