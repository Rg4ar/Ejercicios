/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author estiben
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       var menu = 0;
       var a = 0;
       var b = 0;
    while (menu !=6){
           System.out.println("-----Calculadora-----");
           System.out.println("1. Ingrese valores (a y b)");
           System.out.println("2. Suma");
           System.out.println("3. Resta");
           System.out.println("4. Multiplicacion");
           System.out.println("5. Division");
           System.out.println("6. Salir");
           
           menu = sc.nextInt();
        
        switch (menu){
          
           case 1:
            System.out.println("Ingrese a: ");
            a = sc.nextInt();
            System.out.println("Ingrese b :");
            b = sc.nextInt();
            break;
           case 2:
            System.out.println("Suma = " + suma(a, b));
            break;
            case 3:
            System.out.println("Resta = " + resta(a, b));
            break;
           case 4:
            System.out.println("MUltiplicacion = " + multiplicacion(a, b));
            break;
            case 5:
            System.out.println("Division = " + Division(a, b));
            break;
           case 6:
            System.out.println("Saliendo... = ");
            break;
         default:
            System.out.println("Opcion invalida");
        }          
    }
    sc.close();
}
     public static float suma(int a, int b){
            return a + b;
     }
     
     public static float resta(int a, int b){
            return a - b;
     }
     
     
    public static float multiplicacion(int a, int b){
           return a * b;
    }
    public static float Division(int a, int b){
      
           return (float) a/b;
    }
}
    

    
  
       
