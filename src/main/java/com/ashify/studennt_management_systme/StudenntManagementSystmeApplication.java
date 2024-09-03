package com.ashify.studennt_management_systme;

import com.ashify.studennt_management_systme.Controllers.StudController;
import com.ashify.studennt_management_systme.Entities.Student;
import com.ashify.studennt_management_systme.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class StudenntManagementSystmeApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudController studController;

    public static void main(String[] args) {
        SpringApplication.run(StudenntManagementSystmeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var studentDataToAdd = new Student();
        studentDataToAdd.setStudClass("Y1C");
        studentDataToAdd.setStudAge(20);
        studentDataToAdd.setStudName("Hackim");
        studentDataToAdd.setStudId(1);
        studController.addStudent(studentDataToAdd);

         var students= studController.getAllStudent();
        System.out.println(students);
    }
}
