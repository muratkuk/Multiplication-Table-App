/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.muratkuk.nesneproje;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author muratkuk
 */
public class UserCredentialsTest {
    
    public UserCredentialsTest() {
    }

    /**
     * Test of saveCredentials method, of class UserCredentials.
     */
    @org.junit.Test
    public void testSaveCredentials() {
        System.out.println("saveCredentials");
        String username = "Test";
        String password = "asd";
        String userType = "Child";
        UserCredentials instance = new UserCredentials();
        instance.saveCredentials(username, password, userType);
        
    }

    /**
     * Test of getChildUsernames method, of class UserCredentials.
     */
    @org.junit.Test
    public void testGetChildUsernames() {
        System.out.println("getChildUsernames");
        String expResult = "child1";
        List<String> result = UserCredentials.getChildUsernames();
        assertEquals(expResult, result.get(0));      
    }

    /**
     * Test of getUserType method, of class UserCredentials.
     */
    @org.junit.Test
    public void testGetUserType() {
        System.out.println("getUserType");
        String username = "child1";
        UserCredentials instance = new UserCredentials();
        String expResult = "Child";
        String result = instance.getUserType(username);
        assertEquals(expResult, result);       
    }

    /**
     * Test of isParent method, of class UserCredentials.
     */
    @org.junit.Test
    public void testIsParent() {
        System.out.println("isParent");
        String username = "parent1";
        UserCredentials instance = new UserCredentials();
        boolean expResult = true;
        boolean result = instance.isParent(username);
        assertEquals(expResult, result);      
    }

    /**
     * Test of checkCredentials method, of class UserCredentials.
     */
    @org.junit.Test
    public void testCheckCredentials() {
        System.out.println("checkCredentials");
        String username = "child1";
        String password = "asd";
        UserCredentials instance = new UserCredentials();
        boolean expResult = true;
        boolean result = instance.checkCredentials(username, password);
        assertEquals(expResult, result);
    }
    
    
}
