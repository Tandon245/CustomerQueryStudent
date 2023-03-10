package Tandon.CustomerQueryStudent.controller;

import Tandon.CustomerQueryStudent.model.Student;
import Tandon.CustomerQueryStudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        service.createStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/activeStudents")
    public List<Student> activeStudents() {
        return service.getActiveStudents();
    }

}
