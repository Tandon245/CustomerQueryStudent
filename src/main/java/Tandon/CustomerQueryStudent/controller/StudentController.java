package Tandon.CustomerQueryStudent.controller;

import Tandon.CustomerQueryStudent.model.Student;
import Tandon.CustomerQueryStudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService service;

    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        service.createStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
}
