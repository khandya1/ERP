package com.example.ERP.DAO.impl;

import com.example.ERP.DAO.CourseScheduleDAO;
import com.example.ERP.beans.Course;
import com.example.ERP.beans.Course_Schedule;
import com.example.ERP.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseScheduleDAOImpl implements CourseScheduleDAO {

    @Override
    public ArrayList<Course_Schedule> fetchCS() {

      //  List<Course_Schedule> course_schedules = new ArrayList<>();
        System.out.println("inside fetch tt course");
        try(Session session = SessionUtil.getSession())
        {
            session.beginTransaction();
            Course course =new Course();
          //  Query query = session.createQuery("from Course_Schedule c WHERE c.course.course_id = :course_id");
            Query query = session.createQuery("from Course_Schedule ");
            System.out.println("here");
         //   query.setParameter("course_id" , course.getCourse_id());

            List<Course_Schedule> course_schedules= query.list();
            for (Iterator iterator = course_schedules.iterator(); iterator.hasNext(); ) {
                Course_Schedule course_schedule = (Course_Schedule) iterator.next();
                 System.out.println(course_schedule.getCourse().getCourse_id());

            }
            return (ArrayList<Course_Schedule>) course_schedules;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
    @Override
    public ArrayList<Course_Schedule> checkCourse(int id) {

        //  List<Course_Schedule> course_schedules = new ArrayList<>();
        System.out.println("inside fetch kkkk course");
        try(Session session = SessionUtil.getSession())
        {
            session.beginTransaction();
          //  System.out.println( id);
            Course course =new Course();
            Query query = session.createQuery("from Course_Schedule c where c.course.course_id = :course_id");
            System.out.println("here");
            //   query.setParameter("course_id" , course.getCourse_id());
            query.setParameter("course_id" , id);
            List<Course_Schedule> course_schedules= query.list();
            for (Iterator iterator = course_schedules.iterator(); iterator.hasNext(); ) {
                Course_Schedule course_schedule = (Course_Schedule) iterator.next();
                System.out.println(course_schedule.getCourse().getCourse_id());

            }
            return (ArrayList<Course_Schedule>) course_schedules;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }

}
