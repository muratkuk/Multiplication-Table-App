/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.muratkuk.nesneproje;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author muratkuk
 */
public class ExerciseManager {
    private String filePath = "exercises.txt";

    public void createAndSaveExercise(String name, int a, int b, int N) {
        Exercise exercise = new Exercise(name, a, b, N);
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(exercise.getName() + ":" + exercise.getA() + ":" + exercise.getB() + ":" + exercise.getN());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Could not be saved");
            e.printStackTrace();
        }
    }

    public List<Exercise> loadExercises() {
        List<Exercise> exercises = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 4) {
                    String name = parts[0];
                    int a = Integer.parseInt(parts[1]);
                    int b = Integer.parseInt(parts[2]);
                    int N = Integer.parseInt(parts[3]);
                    exercises.add(new Exercise(name, a, b, N));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Could not be loaded");
            e.printStackTrace();
        }
        return exercises;
    }
}
