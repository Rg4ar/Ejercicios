/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablademultiplicar;

import java.util.Scanner;
/**
 *
 * @author estiben
 */
public class TabladeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // solicitar numero al usuario
        System.out.println("Ingrese un numero para ver su tabla de multiplicar: ");
        int numero = sc.nextInt();
        
        // Imprimir encabezado
        System.out.println("\n====================");
        System.out.println("Tabla del " + numero);
        System.out.println("======================");
        
        // generar tabla con ciclo for (1 al 10)
        for (int i = 1; i <=10; i++){
            System.out.println(numero + "*" + i+ "=" + (numero*i));
            
        }
          System.out.println("====================");  
          sc.close();
    }
    
}
