package com.ashify.studennt_management_systme.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table()
@Getter
@Setter
public class StudentFavouriteSubjects {

    @Id
    private int subject_id;
    private  String subject_name;
    private  String subject_Teacher;



    public StudentFavouriteSubjects(int subject_id, String subject_name, String subject_Teacher, List<Student> studentWhoLikeMostSubject) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.subject_Teacher = subject_Teacher;

    }

    public StudentFavouriteSubjects() {

    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }




    public String getSubject_Teacher() {
        return subject_Teacher;
    }

    public void setSubject_Teacher(String subject_Teacher) {
        this.subject_Teacher = subject_Teacher;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    @Override
    public String toString() {
        return "StudentFavouriteSubjects{" +
                "subject_id=" + subject_id +
                ", subject_name='" + subject_name + '\'' +
                ", subject_Teacher='" + subject_Teacher + '\'' +

                '}';
    }
}


