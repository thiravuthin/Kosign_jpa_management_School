package com.kosign.school_management.payload.student;

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
//@JsonNaming convert field entity in json to stack case
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@NoArgsConstructor
public class StudentResponse {
    private Long studentId;
    private String  firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private Integer groupYear;
    private Integer status;
    @Builder
    public StudentResponse(Long studentId, String firstName, String lastName, String gender, Date dateOfBirth, Integer groupYear, Integer status) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.groupYear = groupYear;
        this.status = status;
    }
}
