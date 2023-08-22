package com.kosign.school_management.exception;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorMessageResponse {
    @JsonProperty("status_code")
    private int statusCode;
    @JsonProperty("time_stamp")
    private Date timeStamp;
    @JsonProperty("_message")
    private String message;
    @JsonProperty("_path")
    private String path;
}
