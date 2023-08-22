package com.kosign.school_management.service.teacher;

import com.kosign.school_management.domain.entity.teacher.Teacher;
import com.kosign.school_management.payload.teacher.TeacherRequest;
import com.kosign.school_management.payload.teacher.TeacherResponse;
import com.kosign.school_management.repository.teacher.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    public Object getTeachers() {

        List<Teacher> teacherList = teacherRepository.findAll();

        return teacherList.stream().map(teacher ->
                        TeacherResponse.builder()
                                .teacherId(teacher.getTeacherId())
                                .firstName(teacher.getFirstName())
                                .lastName(teacher.getLastName())
                                .gender(teacher.getGender())
                                .level(teacher.getLevel())
                                .subjectTaught(teacher.getSubjectTaught())
                                .build()
                ).toList();
    }

    @Override
    public Object getTeacherById(Long id) {
    Object object= teacherRepository.findById(id);
        return teacherRepository.findById(id) ;
    }

    @Override
    public Object insertNewTeacher(TeacherRequest teacherRequest) {
        /**
         * Builder = insert new object or set new object
         **/
        Teacher teacher = Teacher.builder()
                .firstName(teacherRequest.firstName())
                .lastName(teacherRequest.lastName())
                .gender(teacherRequest.gender())
                .level(teacherRequest.level())
                .subjectTaught(teacherRequest.subjectTaught())
                .build();
        /* with out builder pattern*/
        /*
            Teacher  teacher = new Teacher;
            teacher.setFirstName(teacherRequest.firstName());
            teacher.setLastName(teacherRequest.lastName());
            teacher.setGender(teacherRequest.gender());
            teacher.setLevel(teacherRequest.level());
            teacher.setSubjectTaught(teacherRequest.subjectTaught());
        */
        teacherRepository.save(teacher);
        return teacher;
    }

    @Override
    public Object updateTeacherById(Long id, TeacherRequest teacherRequest) {
        Teacher teacher = teacherRepository.findByTeacherId(id);
        teacher.setFirstName(teacherRequest.firstName());
        teacher.setLastName(teacherRequest.lastName());
        teacher.setGender(teacherRequest.gender());
        teacher.setLevel(teacherRequest.level());
        teacher.setSubjectTaught(teacherRequest.subjectTaught());
        return teacherRepository.save(teacher);
    }

    @Override
    public void delete(Long id) {
        teacherRepository.deleteById(id);
    }
}

