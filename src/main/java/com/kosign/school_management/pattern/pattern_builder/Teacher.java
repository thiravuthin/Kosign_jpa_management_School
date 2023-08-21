package com.kosign.school_management.pattern.pattern_builder;

public  class Teacher {
    private final String name;
    private final String gender;
    private final Integer age;
    private final String dateOfbirth;

    private Teacher(Builder builder) {

        this.name = builder.name;

        this.gender = builder.gender;

        this.age = builder.age;

        this.dateOfbirth = builder.dateOfbirth;

    }

    public static class Builder {
        private String name;
        private String gender;
        private Integer age;
        private String dateOfbirth;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfbirth = dateOfBirth;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);

        }

    }

}



