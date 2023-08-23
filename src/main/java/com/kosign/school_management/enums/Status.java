package com.kosign.school_management.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.stream.Stream;

/**
 * A class can be used for getting UserStatus enum
 */
public enum Status implements GenericEnum<Status, String> {
    NORMAL("1"),
    DELETE("9")
    ;
    private final String value;
    Status(String value){this.value=value;}

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getLabel() {
        return ("1".equals(value) ? "NORMAL" : "DELETE");
    }

    @JsonCreator
    public static Status fromValue(String value)
    {
        return Stream.of(Status.values()).filter(targetEnum -> targetEnum.value.equals(value)).findFirst().orElse(null);
    }
}
