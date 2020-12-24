package com.example.ERP.DAO.impl;

import com.example.ERP.DAO.CourseDAO;
import com.example.ERP.beans.Course;
import com.example.ERP.beans.Domain;
import com.example.ERP.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

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

    @Override
    public ArrayList<Course> checkDomain(int id) {

        System.out.println("inside fetch courses");
        System.out.println(id);
        try(Session session = SessionUtil.getSession())
        {
            session.beginTransaction();

            Domain domain =new Domain();
            domain.setDomain_id(id);
            Query query = session.createQuery("select c from Domain d join d.courses c where d.domain_id = :id");
            System.out.println("here");
            query.setInteger("id", id);
          //  query.setParameter("id" , domain);
            List<Course> courses= query.list();
            for (Iterator iterator = courses.iterator(); iterator.hasNext(); ) {
                Course course = (Course) iterator.next();
                System.out.println(course.getDomain().get(0).getDomain_id());

            }
            return (ArrayList<Course>) courses;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }

}