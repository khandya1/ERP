package com.example.ERP.DAO.impl;

import com.example.ERP.beans.Employee;
import com.example.ERP.DAO.EmployeeDAO;
import com.example.ERP.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

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
        public Employee checkEmp(Employee employee) {

            Employee employee1 = new Employee();
            System.out.println("Checking Email");
            try(Session session = SessionUtil.getSession())
            {

                session.beginTransaction();
                Query query = session.createQuery("FROM Employee where email=:email and password=:password and department=:department");
                query.setParameter("email", employee.getEmail());
                query.setParameter("password", employee.getPassword());
                query.setParameter("department","Admin");
                employee1 = (Employee) query.list();
                return employee1;
            } catch (HibernateException exception) {
                System.out.print(exception.getLocalizedMessage());
                return null;
            }
        }
}

