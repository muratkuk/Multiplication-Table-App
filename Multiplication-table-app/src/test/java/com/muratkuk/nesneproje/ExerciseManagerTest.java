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
public class ExerciseManagerTest {
    
    public ExerciseManagerTest() {
    }

    /**
     * Test of createAndSaveExercise method, of class ExerciseManager.
     */
    @Test
    public void testCreateAndSaveExercise() {
        System.out.println("createAndSaveExercise");
        String name = "Test";
        int a = 1;
        int b = 1;
        int N = 1;
        ExerciseManager instance = new ExerciseManager();
        instance.createAndSaveExercise(name, a, b, N);
    }

    /**
     * Test of loadExercises method, of class ExerciseManager.
     */
    @Test
    public void testLoadExercises() {
        System.out.println("loadExercises");
        ExerciseManager instance = new ExerciseManager();
        List<Exercise> result = instance.loadExercises();
        assertNotNull(result);

    }
    
}
