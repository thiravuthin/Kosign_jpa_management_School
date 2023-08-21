package com.kosign.school_management.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class ErrorMessage {
    private int statusCode;
    private Date timeStamp;
    private String message;
    private String path;

}
