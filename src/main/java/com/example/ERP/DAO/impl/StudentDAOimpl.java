package com.example.ERP.DAO.impl;

import com.example.ERP.beans.Course;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.example.ERP.beans.Student;
import com.example.ERP.DAO.StudentDAO;
import com.example.ERP.util.SessionUtil;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudentDAOimpl implements StudentDAO {
//    @Override
//    public void fetchStudent() {
//
//    }

    @Override
    public void addStudent(Student student) {
        try (Session session = SessionUtil.getSession()) {
            session.beginTransaction();
            Integer id = (Integer) session.save(student);
            System.out.println("Student created with id:" + id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Student> fetchTT(Student student) {

        ArrayList<Student> students = new ArrayList<Student>();
        System.out.println("inside fetch tt");
        try(Session session = SessionUtil.getSession())
        {


            session.beginTransaction();
            students = (ArrayList<Student>) session.createQuery("FROM Student where cgpa=4 ").list();
            //      query.setParameter("cgpa", student.getCgpa());
//                for (final Object fetch : query.list()) {
//                    return ArrayList<Student> fetch;
//                }
            return students;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }

    @Override
    public ArrayList<Student> checkStudent(int id) {
        System.out.println("inside fetch courses");
        System.out.println(id);
        try(Session session = SessionUtil.getSession())
        {
            session.beginTransaction();
            Course course =new Course();
            course.setCourse_id(id);
//            Query query = session.createQuery("select c from Domain d join d.courses c where d.domain_id = :id");
            Query query = session.createQuery("select s from Course c join c.student s where c.course_id = :id");
            System.out.println("here");
            query.setInteger("id", id);
            //  query.setParameter("id" , domain);
            List<Student> students= query.list();
            for (Iterator iterator = students.iterator(); iterator.hasNext(); ) {
                Student student = (Student) iterator.next();
                System.out.println(student.getEmail());
            }
            return (ArrayList<Student>) students;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }

}