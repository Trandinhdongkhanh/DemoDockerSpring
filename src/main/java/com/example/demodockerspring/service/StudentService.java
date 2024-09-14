package com.example.demodockerspring.service;

import com.example.demodockerspring.entity.Student;
import com.example.demodockerspring.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student addStudent(String name, String description) {
        return studentRepo.save(Student.builder()
                .name(name)
                .description(description)
                .build());
    }
}
