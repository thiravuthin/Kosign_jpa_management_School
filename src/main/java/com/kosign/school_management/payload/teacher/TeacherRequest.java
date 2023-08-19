package com.kosign.school_management.payload.teacher;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record TeacherRequest(
        @NotBlank
         @JsonProperty("first_name")
        String firstName,

        @NotBlank
        @JsonProperty("last_name")
        String lastName,

        @NotBlank
        String gender,

        @NotBlank
        String level,

        @NotBlank
        @JsonProperty("subject_taught")
        String subjectTaught
) {
}
