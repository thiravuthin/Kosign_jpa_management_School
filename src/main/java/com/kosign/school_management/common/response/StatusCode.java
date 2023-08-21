package com.kosign.school_management.common.response;

import lombok.Getter;

@Getter
public enum StatusCode {

    SUCCESS(200, "200성공하였습니디."),
    FAIL(400, "400실패하였습니다.");

    int code;
    String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
