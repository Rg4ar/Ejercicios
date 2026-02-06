/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoriado_while;

/**
 *
 * @author estiben
 */
public class SumatoriaDO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        int numero = 1;
        
        do{
            suma= suma + numero; // Acumula el valor actual 
            numero = numero + 1; // Incrementa el contador  
            
        }while (numero <=50);
        
        System.out.println("La sumatoria de los numeros del 1 al 50 es: "+ suma);
        
        
    }
    
}
