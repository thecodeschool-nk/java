package com.thecodeschool.hibrernate.connection;

import com.thecodeschool.hibrernate.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private SessionFactory sessionFactory = null;

    public Session getSession() {
        return sessionFactory == null ? buildSessionFactory().openSession() : sessionFactory.openSession();
    }

    private SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Product.class);

        sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }
}
