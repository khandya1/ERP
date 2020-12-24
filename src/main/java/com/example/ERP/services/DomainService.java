package com.example.ERP.services;

import com.example.ERP.DAO.impl.DomainDAOImpl;
import com.example.ERP.beans.Domain;

import java.util.ArrayList;

public class DomainService {

    public ArrayList<Domain> fetchDomain() {
        return new DomainDAOImpl().fetchDomain();
    }
}
