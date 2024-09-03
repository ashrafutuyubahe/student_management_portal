package com.ashify.studennt_management_systme.Controllers;

import com.ashify.studennt_management_systme.Entities.Student;
import com.ashify.studennt_management_systme.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student_mgs")
public class StudController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudent() {
        var students = studentRepository.findAll();
        for (var student : students) {
            return students;
        }
        return students;
    }

    @PostMapping("/AddStudent/terminal")
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @PostMapping("/addStudentInDatabase")
    public String addStudentEndpoint(@RequestBody Student student) {
        System.out.println(student);
        if (student == null) {
            return "The student object is null";
        }

        var savedStudent = studentRepository.save(student);

        if (savedStudent == null) {
            System.out.println("Failed to add student");
            return "Failed to add student";
        } else {
            System.out.println("Student added successfully");
            return "Student added successfully";
        }
    }

}
