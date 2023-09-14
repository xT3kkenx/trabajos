package Modelo;

public class Libro extends Publicacion {
    private String editorial;
    private String referenciaBibliografica;

    public Libro(String titulo, String autor, int anioPublicacion, String editorial, String referenciaBibliografica) {
        super(titulo, autor, anioPublicacion);
        this.editorial = editorial;
        this.referenciaBibliografica = referenciaBibliografica;
    }

    // Métodos getters y setters para los atributos específicos de Libro

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getReferenciaBibliografica() {
        return referenciaBibliografica;
    }

    public void setReferenciaBibliografica(String referenciaBibliografica) {
        this.referenciaBibliografica = referenciaBibliografica;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Detalles del libro:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año de publicación: " + getAnioPublicacion());
        System.out.println("Editorial: " + editorial);
        System.out.println("Referencia bibliográfica: " + referenciaBibliografica);
        System.out.println();
    }
}