package com.example.ERP.DAO.impl;

import com.example.ERP.DAO.DomainDAO;
import com.example.ERP.beans.Course;
import com.example.ERP.beans.Domain;

import com.example.ERP.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DomainDAOImpl implements DomainDAO {

    @Override
    public ArrayList<Domain> fetchDomain()  {

        List<Domain> domains = new ArrayList<>();
        System.out.println("inside fetch domain");
        try(Session session = SessionUtil.getSession())
        {
            session.beginTransaction();
            domains = session.createQuery("from Domain").list();
            for (Iterator iterator = domains.iterator(); iterator.hasNext(); ) {
                Domain domain1 = (Domain) iterator.next();
                System.out.println(domain1.getBatch());
            }
            return (ArrayList<Domain>) domains;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }


    @Override
    public void addDomain(Domain domain) {
        System.out.println("a5");

        try(Session session = SessionUtil.getSession()){
            System.out.println("a6");
            session.beginTransaction();
            System.out.println(domain.getProgram());
            //Integer id = (Integer)
            session.save(domain);
            System.out.println("Domain created with id:");
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("hii");
            e.printStackTrace();
        }
    }
}
