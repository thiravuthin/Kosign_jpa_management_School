package com.kosign.school_management.domain.class_school;

import com.kosign.school_management.domain.class_list.ClassList;
import com.kosign.school_management.domain.classroom.Classroom;
import com.kosign.school_management.domain.subject.Subject;
import com.kosign.school_management.domain.teacher.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_class")
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
