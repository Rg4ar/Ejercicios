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
    
        // Aqui voy a creae intamcias de tv
        
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();
        
        // Aqui lo que hago es asinar valores a tv1
        
        tv1.marca = "Samsung";
        tv1.pulgadas = 43;
        tv1.volumen = 20;
        tv1.encendido = false;
        
        System.out.println("---TV 1---");
        System.out.println("marca: " + tv1.marca);
        System.out.println("pulgada: " + tv1.pulgadas);
        System.out.println("voulumen: " + tv1.volumen);
        
         // ESTA ES LA PROBAR TV1
        
        tv1.enceder();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();
        
        // Aqui lo que hago es asinar valores a tv2
        System.out.println("\n");
        tv2.marca = "LG";
        tv2.pulgadas = 55;
        tv2.volumen = 30;
        tv2.encendido = false;
        
        System.out.println("---TV 2---");
        System.out.println("marca: " + tv2.marca);
        System.out.println("pulgada: " + tv2.pulgadas);
        System.out.println("voulumen: " + tv2.volumen);
       
        // ESTA ES LA PROBAR TV2
        tv2.enceder();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();
        
        // Aqui lo que hago es asinar valores a tv3
        System.out.println("\n");
        tv3.marca = "SONY";
        tv3.pulgadas = 65;
        tv3.volumen = 40;
        tv3.encendido = false;
        
        System.out.println("---TV 3 ---");
        System.out.println("marca: " + tv3.marca);
        System.out.println("pulgada: " + tv3.pulgadas);
        System.out.println("voulumen: " + tv3.volumen);
        
       // ESTA ES LA PROBAR TV3
         
        tv3.enceder();
        tv3.subirVolumen();
        tv3.apagar();
    }
}
