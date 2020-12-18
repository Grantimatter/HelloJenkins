package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    private static SessionFactory sessionFactory;
    private static Session session;

    public static Session getSession(){
        if(session == null){
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            configuration.setProperty("hibernate.connection.username", System.getenv("postgresUsername"));
            configuration.setProperty("hibernate.connection.password", System.getenv("postgresPassword"));
            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.openSession();
        }

        return session;
    }

    public static void closeSession(){
        session.close();
        session = null;
    }
}
