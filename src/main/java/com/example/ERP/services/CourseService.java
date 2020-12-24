package com.example.ERP.services;
import com.example.ERP.beans.Course;
import com.example.ERP.DAO.impl.CourseDAOImpl;

import java.util.ArrayList;


public class CourseService {
    public void addCourses(Course course){
        System.out.println("a4");
        new CourseDAOImpl().addCourses(course);
    }

    public ArrayList<Course> fetchTT() {
        return new CourseDAOImpl().fetchTT();

    }
}
