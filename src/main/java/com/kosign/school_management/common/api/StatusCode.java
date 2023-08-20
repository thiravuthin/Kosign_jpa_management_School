package com.kosign.school_management.common.api;

import lombok.Getter;

@Getter
public enum StatusCode {

    SUCCESS(200, "Success"),

    USER_NOT_FOUND(453, "User is not found");

    private final int code;
    private final String message;

    StatusCode(int code, String message) {
        this.message = message;
        this.code = code;
    }

}
