/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estiben
 */
public class Tv {
    // Atributos Publicos 
    
    public String marca;
    public int pulgadas;
    public boolean encendido;
    public int volumen;
    
    
    // Estos son los metodos para encender 
    
    public void enceder(){
        System.out.println(" LA Tv se esta encendiendo....");
        encendido = true;
    }
    
    // este es el metodo para apagar 
    
    public void apagar (){
        System.out.println(" La Tv se esta apagando....");
        encendido = false;
    }
    
    // este es el metodo para subir el volumen 
    
    public void subirVolumen(){
        System.out.println("subiendo el volumen");
        volumen++;
    }
    
    public void bajarVolumen(){
        System.out.println("Banjando el volumen");
        volumen--;
    }

}