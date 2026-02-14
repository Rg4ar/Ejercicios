public class Factura {
    private Cliente cliente;
    private int minutosConsumidos;
    private double datosConsumidos;
    private double cargosExtras;

    public Factura(Cliente cliente, int minutosConsumidos, double datosConsumidos) {
        this.cliente = cliente;
        this.minutosConsumidos = minutosConsumidos;
        this.datosConsumidos = datosConsumidos;
        this.cargosExtras = calcularExceso();
    }

    private double calcularExceso() {
        double extra = 0;
        Plan plan = cliente.getPlan();

        if (minutosConsumidos > plan.getMinutosIncluidos()) {
            extra += (minutosConsumidos - plan.getMinutosIncluidos()) * 0.10;
        }

        if (datosConsumidos > plan.getDatosGB()) {
            extra += (datosConsumidos - plan.getDatosGB()) * 5;
        }

        return extra;
    }

    public double calcularTotal() {
        return cliente.getPlan().getPrecioMensual() + cargosExtras;
    }

    public void generarFactura() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}
