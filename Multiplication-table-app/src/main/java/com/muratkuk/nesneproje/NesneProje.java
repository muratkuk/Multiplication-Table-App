/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muratkuk.nesneproje;

/**
 *
 * @author muratkuk
 */
public class NesneProje {
    public static void main(String[] args) {
        UserCredentials userCredentials = new UserCredentials();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame(userCredentials).setVisible(true);
            }
        });
    }
}
