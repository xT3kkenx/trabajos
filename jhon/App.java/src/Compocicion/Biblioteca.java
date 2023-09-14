package Compocicion;

import java.util.ArrayList;

public class Biblioteca {
private String nombre;
ArrayList<Libro> coleccionLibros = new ArrayList<Libro>();
public Biblioteca(String nombre) {
this.nombre = nombre;
}
public void anadirLibro(Libro libro) {
coleccionLibros.add(libro); 
}
/**
* @param newParam TODO
*/
public void listarLibros() {
for (int i= 0; i < coleccionLibros.size(); i++) {
Libro libro = (Libro) coleccionLibros.get(i);
libro.imprimir();
 }
}
}
    

