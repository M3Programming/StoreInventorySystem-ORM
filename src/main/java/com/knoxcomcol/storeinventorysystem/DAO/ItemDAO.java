/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.knoxcomcol.storeinventorysystem.DAO;

/**
 *
 * @author user
 */
import com.knoxcomcol.storeinventorysystem.Model.Item;
import org.hibernate.Session;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ItemDAO {

    private static final Logger logger = Logger.getLogger(ItemDAO.class.getName());

    public void saveItem(Item item) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Item.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        try {

            session.beginTransaction();
            session.persist(item);
            session.getTransaction().commit();
            logger.log(Level.INFO, "Item saved successfully: {0}");
        }catch(HibernateException e){
            System.out.print(e);
        }
    }

}
