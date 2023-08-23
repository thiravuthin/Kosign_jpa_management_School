package com.kosign.school_management.payload.student;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StudentRequest {
    @NotBlank
    private String  firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String gender;
    @NotBlank
    private Date dateOfBirth;
    @NotBlank( )
    private Integer groupYear;
}
