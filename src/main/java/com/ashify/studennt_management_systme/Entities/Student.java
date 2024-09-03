package com.ashify.studennt_management_systme.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table()
public class Student {

    @Id
    private int StudId;
    private  String StudName;
    private String StudClass;
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
