/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.muratkuk.nesneproje;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author muratkuk
 */
public class ExerciseTest {
    Exercise instance;
    public ExerciseTest() {
        instance = new Exercise("Test",5,5,5);
    }
    
    /**
     * Test of getA method, of class Exercise.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        int expResult = 5;
        int result = instance.getA();
        assertEquals(expResult, result);

    }

    /**
     * Test of getB method, of class Exercise.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        int expResult = 5;
        int result = instance.getB();
        assertEquals(expResult, result);
    }

    /**
     * Test of getN method, of class Exercise.
     */
    @Test
    public void testGetN() {
        System.out.println("getN");
        int expResult = 5;
        int result = instance.getN();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Exercise.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Test";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
}
