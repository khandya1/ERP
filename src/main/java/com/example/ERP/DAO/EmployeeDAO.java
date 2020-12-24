package com.example.ERP.DAO;

import com.example.ERP.beans.Employee;
import java.util.ArrayList;

public interface EmployeeDAO {

    public abstract void addEmployee(Employee employee);
    public abstract ArrayList<Employee> checkEmp(Employee employee);
}
