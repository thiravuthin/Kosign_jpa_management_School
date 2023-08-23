package com.kosign.school_management.payload.student;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StudentRequest  {

    @NotBlank(message = ": first name must be not blank!")
    private String  firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String gender;
    @NotBlank
    private Date dateOfBirth;
    @NotNull
    private Integer groupYear;
    @NotNull
    private Integer status;

}
