package com.example.ERP.services;

import com.example.ERP.DAO.impl.EmployeeDAOimpl;
import com.example.ERP.DAO.impl.StudentDAOimpl;
import com.example.ERP.beans.Employee;

import java.util.ArrayList;

public class EmployeeService {



    public void addEmployee(Employee employee){
        System.out.println("a4");
        new EmployeeDAOimpl().addEmployee(employee);
    }

    public ArrayList<Employee> checkemp(Employee employee) {
        return new EmployeeDAOimpl().checkEmp(employee);
    }
}
