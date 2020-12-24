package com.example.ERP.DAO.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.example.ERP.beans.Student;
import com.example.ERP.DAO.StudentDAO;
import com.example.ERP.util.SessionUtil;

import java.util.ArrayList;


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

}