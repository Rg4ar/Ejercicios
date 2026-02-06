/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */
import java.util.Scanner;  // Correcto import de Scanner

public class PracticaArea1 {
    public static void main(String[] args) {
        calcularOperaciones(24, 12);
    }
    public static void calcularOperaciones(double a, double b) {

        double suma = a + b;
        double resta = a - b;
        double multiplicacion = a * b;
        double division = a / b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }
}