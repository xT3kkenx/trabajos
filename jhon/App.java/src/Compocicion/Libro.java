package Compocicion;

public class Libro {
    private String titulo, autor, editorial, referenciaBibliografica;
private int anioPublicacion;
public Libro(String titulo, String autor, int anioPublicacion, String editorial,String
referenciaBibliografica ) {
this.titulo = titulo;
this.autor = autor;
this.editorial = editorial;
this.referenciaBibliografica = referenciaBibliografica;
this.anioPublicacion = anioPublicacion;
}
public void imprimir(){
System.out.println("Título del libro = " +titulo);
System.out.println("Autor = " + autor);
System.out.println("Año de publicación = " + anioPublicacion);
System.out.println("Editorial = " + editorial);
System.out.println("Referencia bibliográfica = " + referenciaBibliografica);
System.out.println();
}

}
