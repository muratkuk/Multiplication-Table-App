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
public class HighScoreManagerTest {
    
    public HighScoreManagerTest() {
    }

    /**
     * Test of saveHighScore method, of class HighScoreManager.
     */
    @Test
    public void testSaveHighScore() {
        System.out.println("saveHighScore");
        String username = "Test";
        int speedScore = 0;
        int accuracyScore = 0;
        HighScoreManager instance = new HighScoreManager("ilk");
        instance.saveHighScore(username, speedScore, accuracyScore);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of loadHighScores method, of class HighScoreManager.
     */
    @Test
    public void testLoadHighScores() {
        System.out.println("loadHighScores");
        HighScoreManager instance = new HighScoreManager("ilk");
        List result = instance.loadHighScores();
        assertNotNull(result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
