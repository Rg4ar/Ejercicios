/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeropares;

/**
 *
 * @author estiben
 */
public class NumeroPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 2; // esto indica que iniciara en 2 (primer numero par)
        System.out.println("Numeros pares del 2 al 100:");
        
        while (num <= 100){ // contunua miestras num sea menor o igual a 100
            System.out.println(num);
            num +=2; // Incrementa de 2 en 2 para obtener el valor par 
        }
    }
    
}
