package com.kosign.school_management.payload.teacher;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherResponse {

    @JsonProperty("teacher_id")
    private Long teacherId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    private String gender;

    @JsonProperty("subject_taught")
    private String subjectTaught;


    private String level;


}
