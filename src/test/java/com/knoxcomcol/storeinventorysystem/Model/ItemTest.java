/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.knoxcomcol.storeinventorysystem.Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Marlon
 */
public class ItemTest {
    
    public ItemTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getItemid method, of class Item.
     */
    @Test
    public void testGetItemid() {
        System.out.println("getItemid");
        Item instance = new Item();
        long expResult = 0L;
        long result = instance.getItemid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemid method, of class Item.
     */
    @Test
    public void testSetItemid() {
        System.out.println("setItemid");
        long itemid = 0L;
        Item instance = new Item();
        instance.setItemid(itemid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemName method, of class Item.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        Item instance = new Item();
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemName method, of class Item.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        Item instance = new Item();
        instance.setItemName(itemName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Item.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Item instance = new Item();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Item.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Item instance = new Item();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Item.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Item instance = new Item();
        long expResult = 0L;
        long result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Item.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        long quantity = 0L;
        Item instance = new Item();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Item.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Item instance = new Item();
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Item.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        Item instance = new Item();
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
