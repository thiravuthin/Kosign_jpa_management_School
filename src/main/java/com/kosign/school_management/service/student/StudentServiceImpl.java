package com.kosign.school_management.service.student;

import com.kosign.school_management.domain.entity.student.Student;
import com.kosign.school_management.exception.MyResourceNotFoundException;
import com.kosign.school_management.payload.student.StudentRequest;
import com.kosign.school_management.payload.student.StudentResponse;
import com.kosign.school_management.repository.student.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

        private final StudentRepository studentRepository;

    @Override
    public Object getAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        return studentList.stream().map(student ->
                StudentResponse.builder()
                        .studentId(student.getId())
                        .firstName(student.getFirstName())
                        .lastName(student.getLastName())
                        .gender(student.getGender())
                        .dateOfBirth(student.getDateOfBirth())
                        .groupYear(student.getGroupYear())
                        .build()).toList();
    }

    @Override
    public Object findStudentById(Long id) {
        Optional<Student> studentOptional = Optional.of(studentRepository.findById(id).orElseThrow(() -> new MyResourceNotFoundException("The student Id not is not found! : " + id)));
        return studentOptional.stream().map(student ->
                StudentResponse.builder()
                        .studentId(student.getId())
                        .firstName(student.getFirstName())
                        .lastName(student.getLastName())
                        .gender(student.getGender())
                        .dateOfBirth(student.getDateOfBirth())
                        .groupYear(student.getGroupYear())
                        .build()).toList();
    }
    @Override
    public Object insert(StudentRequest studentRequest) {

         Student studentOptional = Student.builder()
                 .firstName(studentRequest.getFirstName())
                 .lastName(studentRequest.getLastName())
                 .gender(studentRequest.getGender())
                 .dateOfBirth(studentRequest.getDateOfBirth())
                 .groupYear(studentRequest.getGroupYear())
                 .build();
        studentRepository.save(studentOptional);

               var studentResponse=  StudentResponse.builder()
                       .studentId(studentOptional.getId())
                        .firstName(studentRequest.getFirstName())
                        .lastName(studentRequest.getLastName())
                        .gender(studentRequest.getGender())
                        .dateOfBirth(studentRequest.getDateOfBirth())
                        .groupYear(studentRequest.getGroupYear())
                        .build();

             return   studentResponse ;
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Object updateById(Long id, Student student) {
        return studentRepository.findById(id).orElseThrow(() ->
                new MyResourceNotFoundException("not found id :" + id));
    }
}
