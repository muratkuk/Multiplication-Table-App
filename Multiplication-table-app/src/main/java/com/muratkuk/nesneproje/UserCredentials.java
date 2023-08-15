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

public class UserCredentials {
    private String filePath = "credentials.txt";
    private Map<String, String> credentials = new HashMap<>();
    private Map<String, String> userTypes = new HashMap<>();

    public UserCredentials() {
        loadCredentials();
    }

    private void loadCredentials() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 3) {
                    credentials.put(parts[0], parts[1]);
                    userTypes.put(parts[0], parts[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveCredentials(String username, String password, String userType) {
        credentials.put(username, password);
        userTypes.put(username, userType);
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(username + ":" + password + ":" + userType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
     
    public static List<String> getChildUsernames() {
        List<String> childUsernames = new ArrayList<>();
        String userType;
        try (BufferedReader reader = new BufferedReader(new FileReader("credentials.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 3) {
                    userType = parts[2];
                    if (userType.equals("Child")) {
                        childUsernames.add(parts[0]);
                    }
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        
        
        return childUsernames;  
    }
    
    public static List<String> getParentUsernames() {
        List<String> parentUsernames = new ArrayList<>();
        String userType;
        try (BufferedReader reader = new BufferedReader(new FileReader("credentials.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 3) {
                    userType = parts[2];
                    if (userType.equals("Parent")) {
                        parentUsernames.add(parts[0]);
                    }
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        
        
        return parentUsernames;  
    }    
    public boolean isthere(String username){
        List<String> childUsernames =getChildUsernames();
        List<String> parentUsernames = getParentUsernames();
        for(String childusername:childUsernames){
            for(String parentusername:parentUsernames){
                if(childusername.equals(username)|| parentusername.equals(username)){
                    return false;
                }                
            }

        }
        return true;
    }
    
    public String getUserType(String username) {
        return userTypes.get(username);
    }    
    public boolean isParent(String username) {
        if (!userTypes.containsKey(username)) { 
            return false;
        }
        String userType = userTypes.get(username);
        if (userType == null || !userType.equals("Parent")) {
            return false;
        }

        return true;
        //return userTypes.get(username).equals("Parent");
    }
    public boolean checkCredentials(String username, String password) {
        if (!credentials.containsKey(username)) { 
            return false;
        }
        String correctPassword = credentials.get(username);
        if (correctPassword == null || !correctPassword.equals(password)) {
            return false;
        }
        return true;
        //return credentials.get(username).equals(password);
    }
    
}

