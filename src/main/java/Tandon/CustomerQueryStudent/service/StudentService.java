package Tandon.CustomerQueryStudent.service;

import Tandon.CustomerQueryStudent.model.Student;
import Tandon.CustomerQueryStudent.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository repository;
    // get student bt Student id
    public Student getStudent(Long id) {
        return repository.findById(id).orElse(null);
    }

    // add student by passing data of the student
    public Student createStudent(Student student) {
        return repository.save(student);
    }

public List<Student> getAllStudents(Student student){
        return repository.findAllStudents();
}



}
