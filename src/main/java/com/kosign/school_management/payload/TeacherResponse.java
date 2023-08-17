package com.kosign.school_management.payload;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TeacherResponse {
    private Long id;
    private String name;
    private String gender;

    @Builder
    public TeacherResponse(Long id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
}
