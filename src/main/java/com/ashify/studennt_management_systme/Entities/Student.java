package com.ashify.studennt_management_systme.Entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table()
public class Student {

    @Id
    @SequenceGenerator(
            name = "stud_seq",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator ="stud_seq",
            strategy = GenerationType.IDENTITY

    )
    private int StudId;

    @Column( nullable = false)
    private  String StudName;

    @Column( nullable = false)
    private String StudClass;

    @Column( nullable = false)
    private int StudAge;

    public Student(int studId, String studName, String studClass, int studAge) {
        StudId = studId;
        StudName = studName;
        StudClass = studClass;
        StudAge = studAge;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "StudId=" + StudId +
                ", StudName='" + StudName + '\'' +
                ", StudClass='" + StudClass + '\'' +
                ", StudAge=" + StudAge +
                '}';
    }
}
