/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compradordedosnumero;
import java.util.Scanner;
/**
 *
 * @author estiben
 */
public class CompradorDeDosNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Solicitar los dos numero al usuario 
        System.out.println("Ingrese el primer numero; ");
        double numero1 = sc.nextDouble();
        
        // Solicitar los dos numero al usuario 
        System.out.println("Ingrese el segundo numero; ");
        double numero2 = sc.nextDouble();
        
        // Comparar los numeros usando if - else 
        if (numero1 > numero2){
            System.out.println("\n RESULTADO");
            System.out.println("El numero mayor es: " + numero1);
            System.out.println("El numero menor es: " + numero2);
        }else if (numero2> numero2){
            System.out.println("\n RESULTADO");
            System.out.println("El numero mayor es: " + numero1);
            System.out.println("El numero menor es: " + numero2);
        }else{
            System.out.println("\n RESULTADO");
            System.out.println("Ambos numero son iguales : " + numero1);
        }
        
        sc.close();
               
    }   
}
