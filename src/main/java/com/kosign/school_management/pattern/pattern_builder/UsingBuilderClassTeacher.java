package com.kosign.school_management.pattern.pattern_builder;

public class UsingBuilderClassTeacher {
    public String getTeacher() {

        String result = "";

        Teacher th = new Teacher.Builder()

                .setName("vuthin")

                .setGender("male")

                .setAge(12)

                .setDateOfBirth("005010X220A1")

                .build();

        result = th.toString();

        return result;
    }


}
