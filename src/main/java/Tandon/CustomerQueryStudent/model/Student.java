package Tandon.CustomerQueryStudent.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "Student_tbl")
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private  long studentId;
    @Column(name = "first_name")
    private  String firstName;
    @Column(name = "last_name")
    private  String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "is_active")
    private  boolean active;
    @Column(name = "admission_date")
    private Date admissionDate;



}
