/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muratkuk.nesneproje;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author muratkuk
 */
public class ExerciseLog {
    private String username;
    private String exerciseName;
    private long startTime;
    private long endTime;
    private List<String> questions;
    private List<Boolean> correctAnswers;
    private List<Integer> responseTimes;
    private int speedScore;
    private int accuracyScore;
    private List<String> logLines;

    public ExerciseLog(String username, String exerciseName) {
        this.username = username;
        this.exerciseName = exerciseName;
        this.startTime = System.currentTimeMillis();
        this.questions = new ArrayList<>();
        this.correctAnswers = new ArrayList<>();
        this.responseTimes = new ArrayList<>();
        logLines = new ArrayList<>();
    }

    public void logQuestion(String question, boolean correct, int responseTime) {
        questions.add(question);
        correctAnswers.add(correct);
        responseTimes.add(responseTime);
    }
       
    
    public void calculateScores() {
        int totalTime = 0;
        int correctAnswersCount = 0;
        for (int i = 0; i < responseTimes.size(); i++) {
            totalTime += responseTimes.get(i);
            if (correctAnswers.get(i)) {
                correctAnswersCount++;
            }
        }

        // Speed score is inversely proportional to the total time
        this.speedScore = (int) ((1.0 / totalTime) * 1000000);
        // Accuracy score is proportional to the percentage of correct answers
        this.accuracyScore = (correctAnswersCount * 100) / responseTimes.size();
    }   

    public void saveToFile() throws IOException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String startTimeStr = df.format(new Date(startTime));
        String filename = username + "_" + exerciseName + "_" + startTimeStr + ".csv";
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        writer.println("Exercise log for " + username + ", exercise: " + exerciseName+";;;;");
        writer.println("Start time: " + new Date(startTime).toString()+";;;;");
        writer.println("End time: " + new Date(endTime).toString()+";;;;");
        writer.println("SpeedScore;AccuracyScore");
        writer.println(speedScore + ";" + accuracyScore);
        writer.println("Questions;Results;ResponseTime");
            for (int i = 0; i < questions.size(); i++) {
                String result = correctAnswers.get(i) ? "correct" : "incorrect";
                writer.println(questions.get(i) + ";" + result + ";" + responseTimes.get(i));
            }
        
        writer.close();
    }    
    
    
    public void endExercise() {
        this.endTime = System.currentTimeMillis();
    }

    public String getUsername() {
        return username;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public List<Boolean> getCorrectAnswers() {
        return correctAnswers;
    }

    public List<Integer> getResponseTimes() {
        return responseTimes;
    }

    public int getSpeedScore() {
        return speedScore;
    }

    public int getAccuracyScore() {
        return accuracyScore;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public void setCorrectAnswers(List<Boolean> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public void setResponseTimes(List<Integer> responseTimes) {
        this.responseTimes = responseTimes;
    }

}

