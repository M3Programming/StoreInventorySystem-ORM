package com.knoxcomcol.storeinventorysystem;

import com.knoxcomcol.storeinventorysystem.DAO.ItemDAO;
import com.knoxcomcol.storeinventorysystem.Model.Item;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Marlon
 */
public class Main {

    private static final Logger logger = Logger.getLogger(Item.class.getName());

    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Item.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        try {
            Item item = new Item();
            item.setItemName("SSD");
            item.setDescription("Technology");
            item.setLocation("Store");
            item.setQuantity(1000);
            session.beginTransaction();
            session.persist(item);
            session.getTransaction().commit();
            logger.log(Level.INFO, "Item saved successfully: ");
        } catch (HibernateException e) {
            System.out.print(e);
        }

       

    }
}
