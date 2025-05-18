package com.example.jpa.jpahibernate.rest;

import com.example.jpa.jpahibernate.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class TestController {

    private List<Student> students;

    @PostConstruct
    public void init() {
        students = new ArrayList<>();
        students.add(new Student("Nayan", "Padia"));
        students.add(new Student("Diprit", "Khaitan"));
    }

    @GetMapping("/test")
    public List<Student> getAllStudents() {
        return students;
    }

    @GetMapping("/test/{studentid}")
    public Student getStudent(@PathVariable int studentid) {
        if (studentid < 0 || studentid >= students.size()) {
            throw new Studentnotfoundexception("Student not found -- " + studentid);
        }
        return students.get(studentid);
    }
}
