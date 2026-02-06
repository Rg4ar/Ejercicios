/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paroimpar;

import java.util.Scanner;

/**
 *
 * @author estiben
 */
public class ParOimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Solicitar numero al usuario 
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        
        //Verificar si es par o impar usando el operador modulo % 
        if (numero % 2== 0){
            System.out.println(numero +" es un numero Par");
        }else {
            System.out.println(numero + " es un numero Impar");
        }
        
        sc.close();
    }
    
}
