package com.kosign.school_management.payload.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@NoArgsConstructor
public class StudentResponse {
    private Long studentId;
    private String  firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private Integer groupYear;
    @Builder
    public StudentResponse(Long studentId, String firstName, String lastName, String gender, Date dateOfBirth, Integer groupYear) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.groupYear = groupYear;
    }
}
