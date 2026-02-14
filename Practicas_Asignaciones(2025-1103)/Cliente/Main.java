
public class Main {
    public static void main(String[] args) {
        // Crear un plan
        Plan planBasico = new Plan(500, 5, 25.00);


        // Crear cliente
        Cliente cliente1 = new Cliente("Carlos Rodríguez", "809-555-1234", planBasico);

        // Crear factura (consumo real)
        Factura factura1 = new Factura(cliente1, 650, 7);
        // Consumió 650 minutos y 7GB

        // Generar factura
        factura1.generarFactura();

        }
    }
