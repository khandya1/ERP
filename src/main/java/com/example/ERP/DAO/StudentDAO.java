package com.example.ERP.DAO;

import com.example.ERP.beans.Student;

import java.util.ArrayList;

public interface StudentDAO {
     //  public abstract  void fetchStudent();
       public abstract void addStudent(Student student);
       public abstract ArrayList<Student> fetchTT(Student student);
}
