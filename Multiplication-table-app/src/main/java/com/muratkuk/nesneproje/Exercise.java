/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muratkuk.nesneproje;

/**
 *
 * @author muratkuk
 */
public class Exercise {
    private int a;
    private int b;
    private int N;
    private String name;

    public Exercise(String name, int a, int b, int N) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.N = N;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getN() {
        return N;
    }
    
    public String getName() {
        return name;
    }
    
}

