package com.example.ERP.DAO.impl;

import com.example.ERP.DAO.CourseDAO;
import com.example.ERP.beans.Course;
import com.example.ERP.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CourseDAOImpl implements CourseDAO {

    @Override
    public void addCourses(Course course) {
        System.out.println("a5");

        try(Session session = SessionUtil.getSession()){
            System.out.println("a6");
            session.beginTransaction();
            System.out.println(course.getName());
            //Integer id = (Integer)
            session.save(course);
            System.out.println("Student created with id:");
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("hii");
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Course> fetchTT() {

        List<Course> courses = new ArrayList<>();
        System.out.println("inside fetch tt course");
        try(Session session = SessionUtil.getSession())
        {
            session.beginTransaction();
            courses = session.createQuery("from Course").list();
            for (Iterator iterator = courses.iterator(); iterator.hasNext(); ) {
                Course course1 = (Course) iterator.next();
                System.out.println(course1.getName());
            }
            return (ArrayList<Course>) courses;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
}
