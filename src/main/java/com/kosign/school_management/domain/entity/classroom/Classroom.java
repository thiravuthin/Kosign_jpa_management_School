package com.kosign.school_management.domain.entity.classroom;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_class_room")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_room_id")
    private Long classRoomId;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "facilities")
    private String facilities;

}
