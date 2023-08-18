package com.kosign.school_management.common.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude
@Getter
@Setter
@NoArgsConstructor
public class ApiResponse<T> {

    @JsonProperty("status")
    private ApiStatus apiStatus;
    private T data;

    @Builder
    public ApiResponse(StatusCode status, T data) {
        this.apiStatus = new ApiStatus(status.getCode(), status.getMessage());
        this.data = data;
    }
}
