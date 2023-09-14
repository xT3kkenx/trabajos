import Modelo.Biblioteca;
import Modelo.Libro;
import Modelo.Revista;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");

        // Agregar libros a la biblioteca
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967,
                                 "Sudamericana", "858.67/M566");
        biblioteca1.anadirLibro(libro1);

        Libro libro2 = new Libro("Rayuela", "Julio Cortázar", 1963,
                                 "Sudamericana", "863.55/J667");
        biblioteca1.anadirLibro(libro2);

        Libro libro3 = new Libro("La tía julia y el escribidor", "Mario Vargas Llosa", 1977,
                                 "Seix Barral", "868.23/L567");
        biblioteca1.anadirLibro(libro3);

        // Agregar revistas a la biblioteca
        Revista revista1 = new Revista("National Geographic", "Varios", 2022,
                                      "Revista Nacional Geographic", "Mensual", "2022", "Estados Unidos");
        biblioteca1.anadirRevista(revista1);

        Revista revista2 = new Revista("Science", "Varios", 2021,
                                      "American Association for the Advancement of Science", "Semanal", "2021", "Estados Unidos");
        biblioteca1.anadirRevista(revista2);

        // Listar libros y revistas en la biblioteca
        biblioteca1.listarLibros();
        biblioteca1.listarRevistas();
    }
}