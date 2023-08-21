package com.kosign.kosign_jpa;

import com.kosign.school_management.pattern.pattern_builder.UsingBuilderClassTeacher;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KosignJpaLearingApplicationTests {

    @Test
    void contextLoads() {

    }

    public static void main(String[] args) {
        UsingBuilderClassTeacher teacher = new UsingBuilderClassTeacher();
        teacher.getTeacher().toString();
        System.err.println(" :"+teacher.getTeacher().toString());
    }

}
