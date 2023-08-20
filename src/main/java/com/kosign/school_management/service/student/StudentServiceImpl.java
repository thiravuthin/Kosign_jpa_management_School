package com.kosign.school_management.service.student;
import com.kosign.school_management.repository.student.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


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
        return studentRepository.findById(id);
    }
}
