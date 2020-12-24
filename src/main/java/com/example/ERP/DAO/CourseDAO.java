package com.example.ERP.DAO;
import com.example.ERP.beans.Course;

import java.util.ArrayList;

public interface CourseDAO {
    public abstract void addCourses(Course course);
    public abstract ArrayList<Course> fetchTT();
}

