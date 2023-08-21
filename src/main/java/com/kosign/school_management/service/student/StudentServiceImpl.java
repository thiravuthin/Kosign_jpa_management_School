package com.kosign.school_management.service.student;
import com.kosign.school_management.domain.entity.student.Student;
import com.kosign.school_management.exception.MyResourceNotFoundException;
import com.kosign.school_management.repository.student.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.ErrorResponseException;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

        private final StudentRepository studentRepository;

    @Override
    public Object getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Object findStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new MyResourceNotFoundException("The student Id not is not found! : " + id)
        );
    }

    @Override
    public Object insert(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Object updateById(Long id, Student student) {
        return studentRepository.findById(id).orElseThrow(() -> new MyResourceNotFoundException("not found id :"+ id));

    }
}
