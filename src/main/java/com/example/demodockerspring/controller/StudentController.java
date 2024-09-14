package com.example.demodockerspring.controller;

import com.example.demodockerspring.entity.Student;
import com.example.demodockerspring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(service.getAllStudents());
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(
            @RequestParam("name") String name,
            @RequestParam("description") String description
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.addStudent(name, description));
    }
}
