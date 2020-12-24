package com.example.ERP.services;


import com.example.ERP.DAO.impl.CourseScheduleDAOImpl;
import com.example.ERP.beans.Course_Schedule;

import java.util.ArrayList;

public class CourseScheduleServices {

    public ArrayList<Course_Schedule> fetchCS() {
        return new CourseScheduleDAOImpl().fetchCS();
    }

    public ArrayList<Course_Schedule> checkCourse(int course_id) {
        return new CourseScheduleDAOImpl().checkCourse(course_id);
    }
}
