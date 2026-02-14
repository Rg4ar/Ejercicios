public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;

    // Constructor básico
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    // Constructor completo
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor por defecto
    public Vehiculo() {
        this.placa = "Sin placa";
        this.marca = "Genérica";
        this.modelo = "Base";
    }

    // Método sobrecargado 1
    public double calcularMantenimiento(int km) {
        return km * 0.05;
    }

    // Método sobrecargado 2
    public double calcularMantenimiento(int km, String tipoServicio) {
        double costoBase = km * 0.05;

        if (tipoServicio.equalsIgnoreCase("premium")) {
            return costoBase + 200;
        } else if (tipoServicio.equalsIgnoreCase("basico")) {
            return costoBase + 100;
        }
        return costoBase;
    }
}
