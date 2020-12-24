package com.example.ERP.DAO;

import com.example.ERP.beans.Course;
import com.example.ERP.beans.Domain;

import java.util.ArrayList;

public interface DomainDAO {

    public abstract ArrayList<Domain> fetchDomain();
    public abstract void addDomain(Domain domain);
}
