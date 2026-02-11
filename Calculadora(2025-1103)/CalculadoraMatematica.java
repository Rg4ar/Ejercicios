/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramatematica;

import java.util.Scanner;

/**
 *
 * @author estiben
 */
public class CalculadoraMatematica {
 private double numero1;
 private double numero2;
 
 public CalculadoraMatematica(){
 this.numero1 = 0;
 this.numero2 = 0;
 }
 
 public void ingresarNumero (double numero1, double numero2){
 this.numero1 = numero1;
 this.numero2 = numero2;
 }
 
 public double sumar (){
 return numero1 + numero2; 
 }
 
 public double restar (){
 return numero1 - numero2;
 }
 
 public double multiplicar (){
 return numero1 * numero2;
 }
 
 public double division (){
 if (numero2 == 0){
     System.out.println("Error no se puede dividir entre 0");
     return 0;
 }
 return numero1 / numero2;
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraMatematica calculadora = new CalculadoraMatematica ();
        
        int opcion;
        do{
            System.out.println("\n===========Calculadora Matematica======");
            
            System.out.println("1 ingresar numero");
            System.out.println("2 Sumar");
            System.out.println("3 Restar");
            System.out.println("4 Multiplicacion");
            System.out.println("5 dividir");
            System.out.println("0. Salir");
            
            System.out.print("Selecciones una opcion:");
            
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    double n1 = scanner.nextDouble();
                    System.out.println("Ingrese el Segundo numero: ");
                    double n2 = scanner.nextDouble();
                    calculadora.ingresarNumero(n1, n2);
                    System.out.println("Su numero fueron ingresados ");
                    break;
                    
                case 2: 
                    System.out.println("El resultado de la suma es: " + calculadora.sumar());
                    break;
                case 3:
                    System.out.println("El resultado de la resta es: " + calculadora.restar());
                    break;
                    
                case 4:
                    System.out.println("El resultado de la Multiplicar es: " + calculadora.multiplicar());
                    break;
                    
                case 5: 
                    System.out.println("El resultado de la division es: " + calculadora.division());
                    break;
                     
                case 0:
                    System.out.println("Saliendo del sistema");
                    break;
                    
                default: 
                    System.out.println("Opcion Invalida");
                    
            }
        }while(opcion !=0);
        scanner.close();
    }
    
}
