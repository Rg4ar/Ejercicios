
public class Main {
    public static void main(String[] args) {
        // Constructor por defecto
        Vehiculo vehiculo1 = new Vehiculo();

        // Constructor básico
        Vehiculo vehiculo2 = new Vehiculo("A123BC");

        // Constructor completo
        Vehiculo vehiculo3 = new Vehiculo("B456CD", "Toyota", "Corolla");


        // Método sobrecargado 1 (solo km)
        double costo1 = vehiculo3.calcularMantenimiento(10000);
        System.out.println("Costo mantenimiento (solo km): $" + costo1);

        // Método sobrecargado 2 (km + tipo servicio básico)
        double costo2 = vehiculo3.calcularMantenimiento(10000, "basico");
        System.out.println("Costo mantenimiento (servicio básico): $" + costo2);

        // Método sobrecargado 2 (km + tipo servicio premium)
        double costo3 = vehiculo3.calcularMantenimiento(10000, "premium");
        System.out.println("Costo mantenimiento (servicio premium): $" + costo3);
        }
    }
