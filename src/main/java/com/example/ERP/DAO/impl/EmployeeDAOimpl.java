package com.example.ERP.DAO.impl;

import com.example.ERP.beans.Employee;
import com.example.ERP.DAO.EmployeeDAO;
import com.example.ERP.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.ArrayList;

public class EmployeeDAOimpl implements EmployeeDAO {


    @Override
    public void addEmployee(Employee employee) {
        System.out.println("testing");

        try ( Session session = SessionUtil.getSession();) {
            System.out.println("Adding Employee to DB");
            session.beginTransaction();
            System.out.println(employee.getFirst_name());
            //Integer id = (Integer)
            session.save(employee);
            System.out.println("Employee created with id:");
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("hii");
            e.printStackTrace();
        }
    }


        @Override
        public ArrayList<Employee> checkEmp(Employee employee) {

            ArrayList<Employee> employees = new ArrayList<Employee>();
            System.out.println("Checking Email");
            try(Session session = SessionUtil.getSession())
            {


                session.beginTransaction();
                employees = (ArrayList<Employee>) session.createQuery("FROM Employee where password=4 ").list();
//              query.setParameter("cgpa", student.getCgpa());
//                for (final Object fetch : query.list()) {
//                    return ArrayList<Student> fetch;
//                }
                return employees;
            } catch (HibernateException exception) {
                System.out.print(exception.getLocalizedMessage());
                return null;
            }
        }


}

