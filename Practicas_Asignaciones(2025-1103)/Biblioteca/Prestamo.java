import java.time.LocalDate;


public class Prestamo {
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }

    public void realizarPrestamo() {
        if (libro.isDisponible()) {
            libro.prestarLibro();
            usuario.agregarLibro(libro);
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }
}
