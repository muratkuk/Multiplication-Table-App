/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muratkuk.nesneproje;

/**
 *
 * @author muratkuk
 */
import java.io.*;
import java.util.*;

public class HighScoreManager {
    private File highScoresFile;

    public HighScoreManager(String exerciseName) {
        this.highScoresFile = new File(exerciseName + "_high_scores.txt");
        createFileIfNotExists();
    }
   
    
    private void createFileIfNotExists() {
        if (!highScoresFile.exists()) {
            try {
                highScoresFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public void saveHighScore(String username, int speedScore, int accuracyScore) {
        try (FileWriter writer = new FileWriter(highScoresFile, true)) {
            writer.write(username + "," + speedScore + "," + accuracyScore + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> loadHighScores() {
        List<String[]> highScores = new ArrayList<>();
        try (Scanner scanner = new Scanner(highScoresFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    highScores.add(parts);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return highScores;
    }
   
}

