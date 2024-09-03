package com.ashify.studennt_management_systme.Repository;

import com.ashify.studennt_management_systme.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}

