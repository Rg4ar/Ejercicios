/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estiben
 */
public class Prueba {
    public static void main(String[] args){
    Calculadora calc = new Calculadora();
    
    System.out.println("===CALCULADORA - SOBRECARGA DE METODOS ===\n");
    
    // PRUEBAS CON 2 PARAMETROS 
    
        System.out.println(" Operaciones con 2 numeros:");
        System.out.println("  suma (5+3): "+ calc.sumar(5,3));
        System.out.println("  resta (10 - 4): "+ calc.restar(10, 4));
        System.out.println("  multiplicar (6 * 7): " + calc.multiplicar(6, 7));
        System.out.println("  dividir (20/5): " + calc.dividir(20, 5));
        
        System.out.println("\n--\n");
        
        System.out.println(" Operaciones con 2 numeros:");
        System.out.println("  suma (2 + 3 + 4): "+ calc.sumar(2,3, 4));
        System.out.println("  resta (15 - 5 - 3): "+ calc.restar(15, 5, 3));
        System.out.println("  multiplicar (2 * 3* 4): " + calc.multiplicar(2, 3, 4));
        
        System.out.println("\n--\n");
        
        System.out.println(" Operaciones con 2 numeros:");
        System.out.println("  suma (1 + 2 + 3 + 4): "+ calc.sumar(1,2, 3,4));
        System.out.println("  resta (20 - 5 - 3 - 2): "+ calc.restar(20, 5, 3,2));
        System.out.println("  multiplicar (1 * 2 * 3 * 4): " + calc.multiplicar(1, 2, 3,4));
        
    
    
  }
}
