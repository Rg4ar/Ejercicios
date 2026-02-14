
public class Cliente {

    private String nombre;
    private String numeroTelefonico;
    private Plan plan;

    public Cliente(String nombre, String numeroTelefonico, Plan plan) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }

    public Plan getPlan() {
        return plan;
    }

    public String getNombre() {
        return nombre;
    }
}
