// Agregacion
import Clases.Orden;
import Clases.Producto;
import Compocicion.Biblioteca;
//compocicion
import Compocicion.Circulo;
import Compocicion.Libro;
import Compocicion.Punto;

public class App {
    public static void main(String[] args) throws Exception {
        // Agregacion
        Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metálica",1000);
        Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro.", 3000);
        Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40 cms.",600);
        Orden orden = new Orden(1);
        orden.añadirItem(1, 5, producto1);
        orden.añadirItem(2, 3, producto2);
        orden.añadirItem(3, 2, producto1);
        orden.añadirItem(4, 4, producto4);
        orden.calcularTotalOrden();
        System.out.println(orden);
        
        //Compocicion
        Circulo círculo1 = new Circulo(new Punto(2, 3),5);
        círculo1.imprimir();

        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");
        
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Sudamericana","858.67/M566");
        biblioteca1.anadirLibro(libro1);
        Libro libro2 = new Libro("Rayuela","Julio Cortázar",1963,"Sudamericana","863.55/J667");
        biblioteca1.anadirLibro(libro2);
        Libro libro3 = new Libro("La tía julia y el escribidor", "Mario Vargas Llosa", 1977, "Seix Barral","868.23/L567");
        biblioteca1.anadirLibro(libro3);
        biblioteca1.listarLibros();

    }
}
