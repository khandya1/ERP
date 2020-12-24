package com.example.ERP.DAO;

import com.example.ERP.beans.Course_Schedule;
import java.util.ArrayList;

public interface CourseScheduleDAO {

    public abstract ArrayList<Course_Schedule> fetchCS();

    public abstract ArrayList<Course_Schedule> checkCourse(int course_schedule);
}
