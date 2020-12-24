package com.example.ERP.services;

import com.example.ERP.DAO.impl.StudentDAOimpl;
import com.example.ERP.beans.Student;

import java.util.ArrayList;

public class StudentService {

    public ArrayList<Student> fetchTT(Student student) {
        return new StudentDAOimpl().fetchTT(student);

    }

    public void addStudent(Student student){
        System.out.println("a4");
        new StudentDAOimpl().addStudent(student);
    }

    public ArrayList<Student> checkStudent(Integer id) {
        return new StudentDAOimpl().checkStudent(id);
    }
//
}
