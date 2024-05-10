package com.knoxcomcol.storeinventorysystem;


import com.knoxcomcol.storeinventorysystem.DAO.ItemDAO;
import com.knoxcomcol.storeinventorysystem.Model.Item;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marlon
 */
public class Main {
     public static void main(String[] args) {
        Item item = new Item();
        ItemDAO itemdao = new ItemDAO();
        item.setItemName("SSD");
        item.setDescription("Technology");
        item.setLocation("Store");
        item.setQuantity(1000);
        itemdao.saveItem(item);
        
    }
}
