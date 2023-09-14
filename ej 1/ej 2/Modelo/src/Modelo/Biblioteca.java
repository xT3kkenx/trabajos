package Modelo;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> coleccionLibros = new ArrayList<>();
    private ArrayList<Revista> coleccionRevistas = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void anadirLibro(Libro libro) {
        coleccionLibros.add(libro);
    }

    public void anadirRevista(Revista revista) {
        coleccionRevistas.add(revista);
    }

    public void listarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : coleccionLibros) {
            libro.imprimirDetalles();
        }
    }

    public void listarRevistas() {
        System.out.println("Revistas en la biblioteca:");
        for (Revista revista : coleccionRevistas) {
            revista.imprimirDetalles();
        }
    }
}