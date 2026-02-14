//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crear libros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "12345");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", "67890");

        // Crear usuario
        Usuario usuario1 = new Usuario("Juan Pérez", "U001");

        // Mostrar disponibilidad inicial
        System.out.println("¿Está disponible el libro 1? " + libro1.isDisponible());

        // Crear préstamo
        Prestamo prestamo1 = new Prestamo(usuario1, libro1);

        // Realizar préstamo
        prestamo1.realizarPrestamo();

        // Verificar disponibilidad después del préstamo
        System.out.println("¿Está disponible el libro 1? " + libro1.isDisponible());

        // Devolver libro
        libro1.devolverLibro();
        usuario1.devolverLibro(libro1);

        System.out.println("Libro devuelto correctamente.");

        // Verificar disponibilidad final
        System.out.println("¿Está disponible el libro 1? " + libro1.isDisponible());
        }
    }
