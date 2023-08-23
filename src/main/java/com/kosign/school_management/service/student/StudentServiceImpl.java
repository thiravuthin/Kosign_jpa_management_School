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
    public Optional<Object> getAllStudent() {
        var studentList = studentRepository.findAll();
        return Optional.of(studentList.stream().map(student ->
                StudentResponse.builder()
                        .studentId(student.getId())
                        .firstName(student.getFirstName())
                        .lastName(student.getLastName())
                        .gender(student.getGender())
                        .dateOfBirth(student.getDateOfBirth())
                        .groupYear(student.getGroupYear())
                        .build()).toList());
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
        System.out.println(studentOptional);
               var studentResponse=  StudentResponse.builder()
                       .studentId(studentOptional.getId())
                        .firstName(studentRequest.getFirstName())
                        .lastName(studentRequest.getLastName())
                        .gender(studentRequest.getGender())
                        .dateOfBirth(studentRequest.getDateOfBirth())
                        .groupYear(studentRequest.getGroupYear())
                        .build();
        System.out.println(studentResponse);
             return   studentResponse ;
    }

    @Override
    public Optional<Student> deleteStudentById(Long id )  {

//        System.err.println(id);
//        var st = studentRepository.deleteById(id, Status.NORMAL.getValue()).orElseThrow(()-> new MyResourceNotFoundException("Student id not found"));
//        st.setStatus(Status.DELETE.getValue());
//        System.err.println(Status.DELETE.getValue());
//        studentRepository.save(st);

       Optional<Student> findStudent = Optional.of(studentRepository.findById(id).orElseThrow(() -> new MyResourceNotFoundException("The Student Id not found!"+ id)));        studentRepository.deleteById(id);
       studentRepository.deleteById(id);
        return findStudent;
    }

    @Override
    public void updateById(Long id, StudentRequest studentRequest) {
        var student= studentRepository.findById(id).orElseThrow(() ->
                new MyResourceNotFoundException("not found id :" + id));

        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
        student.setGender(studentRequest.getGender());
        student.setDateOfBirth(studentRequest.getDateOfBirth());
        student.setGroupYear(studentRequest.getGroupYear());

         studentRepository.save(student);


    }
}
