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
public class ExerciseLogTest {
    private ExerciseLog instance;
    public ExerciseLogTest() {
        instance = new ExerciseLog("Test","Test");
    }

    /**
     * Test of logQuestion method, of class ExerciseLog.
     */
    @Test
    public void testLogQuestion() {
        System.out.println("logQuestion");
        String question = "TestxTest";
        boolean correct = false;
        int responseTime = 5;
        instance.logQuestion(question, correct, responseTime);
        instance.logQuestion(question, correct, responseTime);
        instance.logQuestion(question, correct, responseTime);
        instance.logQuestion(question, correct, responseTime);
        instance.logQuestion(question, correct, responseTime);

    }


    /**
     * Test of saveToFile method, of class ExerciseLog.
     */
    @Test
    public void testSaveToFile() throws Exception {
        System.out.println("saveToFile");
        instance.saveToFile();

        
    }

    /**
     * Test of endExercise method, of class ExerciseLog.
     */
    @Test
    public void testEndExercise() {
        System.out.println("endExercise");
        instance.endExercise();
    }

    /**
     * Test of getUsername method, of class ExerciseLog.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "Test";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExerciseName method, of class ExerciseLog.
     */
    @Test
    public void testGetExerciseName() {
        System.out.println("getExerciseName");
        String expResult = "Test";
        String result = instance.getExerciseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStartTime method, of class ExerciseLog.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        long result = instance.getStartTime();
        assertNotNull(result);

    }

    /**
     * Test of getEndTime method, of class ExerciseLog.
     */
    @Test
    public void testGetEndTime() {
        System.out.println("getEndTime");
        long result = instance.getEndTime();
        assertNotNull(result);

    }

    /**
     * Test of getQuestions method, of class ExerciseLog.
     */
    @Test
    public void testGetQuestions() {
        System.out.println("getQuestions");
        List<String> result = instance.getQuestions();
        assertNotNull(result);
    }

    /**
     * Test of getCorrectAnswers method, of class ExerciseLog.
     */
    @Test
    public void testGetCorrectAnswers() {
        System.out.println("getCorrectAnswers");
        List<Boolean> result = instance.getCorrectAnswers();
        assertNotNull(result);

    }

    /**
     * Test of getResponseTimes method, of class ExerciseLog.
     */
    @Test
    public void testGetResponseTimes() {
        System.out.println("getResponseTimes");
        List<Integer> result = instance.getResponseTimes();
        assertNotNull(result);

    }

    /**
     * Test of getSpeedScore method, of class ExerciseLog.
     */
    @Test
    public void testGetSpeedScore() {
        System.out.println("getSpeedScore");
        int result = instance.getSpeedScore();
        assertNotNull(result);

    }

    /**
     * Test of getAccuracyScore method, of class ExerciseLog.
     */
    @Test
    public void testGetAccuracyScore() {
        System.out.println("getAccuracyScore");
        int result = instance.getAccuracyScore();
        assertNotNull(result);

    }

    /**
     * Test of setUsername method, of class ExerciseLog.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "TestTest";
        instance.setUsername(username);
    }

    /**
     * Test of setExerciseName method, of class ExerciseLog.
     */
    @Test
    public void testSetExerciseName() {
        System.out.println("setExerciseName");
        String exerciseName = "TestTest";
        instance.setExerciseName(exerciseName);
    }

    /**
     * Test of setStartTime method, of class ExerciseLog.
     */
    @Test
    public void testSetStartTime() {
        System.out.println("setStartTime");
        long startTime = 0L;
        instance.setStartTime(startTime);

    }

    /**
     * Test of setEndTime method, of class ExerciseLog.
     */
    @Test
    public void testSetEndTime() {
        System.out.println("setEndTime");
        long endTime = 0L;
        instance.setEndTime(endTime);

    }

    /**
     * Test of setQuestions method, of class ExerciseLog.
     */
    @Test
    public void testSetQuestions() {
        System.out.println("setQuestions");
        List<String> questions = null;
        instance.setQuestions(questions);

    }

    /**
     * Test of setCorrectAnswers method, of class ExerciseLog.
     */
    @Test
    public void testSetCorrectAnswers() {
        System.out.println("setCorrectAnswers");
        List<Boolean> correctAnswers = null;
        instance.setCorrectAnswers(correctAnswers);

    }

    /**
     * Test of setResponseTimes method, of class ExerciseLog.
     */
    @Test
    public void testSetResponseTimes() {
        System.out.println("setResponseTimes");
        List<Integer> responseTimes = null;
        instance.setResponseTimes(responseTimes);

    }
    
}
