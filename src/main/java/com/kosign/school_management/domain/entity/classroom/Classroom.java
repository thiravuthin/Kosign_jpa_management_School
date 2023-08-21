package com.kosign.school_management.domain.entity.classroom;

import jakarta.persistence.*;

@Entity
@Table(name = "class_room_tb")
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
