/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estiben
 */
public class Calculadora {
    // METODO CON 2 PARAMETROS 
    
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
    
    public int dividir(int a, int b) {
        if (b==0){
            System.out.println("ERROR: NO SE PUEDE DIVIDIR ENTRE CERO");
        }
        return a / b;
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    // METODO CON 3 PARAMETROS (SOBRE CARGA)
    
    public int sumar(int a, int b, int c){
        return a + b + c;
    }
    
    public int restar(int a, int b, int c){
        return a - b - c;
    }
    
    public int multiplicar(int a, int b, int c){
        return a * b * c;
    }
     // METODO CON 4 PARAMETRO
    public int sumar(int a, int b, int c, int d){
        return a + b + c + d;
    }
      
    public int restar(int a, int b, int c, int d){
        return a - b - c - d;
    }
        
    
    
    public int multiplicar(int a, int b, int c, int d){
         return a * b * c * d;
    }
}
