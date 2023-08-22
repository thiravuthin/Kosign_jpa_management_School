package com.kosign.school_management.payload.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class StudentRequest {

    @JsonProperty("first_name")
    @NotBlank
    private String  firstName;

    @JsonProperty("last_name")
    @NotBlank
    private String lastName;

    @JsonProperty("gender")
    @NotBlank
    private String gender;

    @JsonProperty("date_of_birth")
    @NotBlank
    private Date dateOfBirth;

    @JsonProperty("group_year")
    @NotBlank
    private Integer groupYear;
}
