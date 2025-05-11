package com.example.jpa.jpahibernate.rest;

import com.example.jpa.jpahibernate.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class TestController{

    private  List<Student> students;

    @PostConstruct
    public void init(){
        students = new ArrayList<>();
        students.add(new Student("Nayan", "padia"));
        students.add(new Student("Diprit", "Khaitan"));

    }
    @GetMapping("/test")
    public List<Student> nayan() {


        return students;
    }
    @GetMapping("/test/{studentid}")
    public  Student getstudent(@PathVariable int studentid) {

        return students.get(studentid);
    }
}
