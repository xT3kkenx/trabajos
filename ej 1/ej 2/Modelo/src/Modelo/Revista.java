package Modelo;

public class Revista extends Publicacion {
    private String nombreRevista;
    private String periodicidad;
    private String anioPublicacionRevista;
    private String paisPublicacion;

    public Revista(String titulo, String autor, int anioPublicacion, String nombreRevista,
                   String periodicidad, String anioPublicacionRevista, String paisPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.nombreRevista = nombreRevista;
        this.periodicidad = periodicidad;
        this.anioPublicacionRevista = anioPublicacionRevista;
        this.paisPublicacion = paisPublicacion;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getAnioPublicacionRevista() {
        return anioPublicacionRevista;
    }

    public void setAnioPublicacionRevista(String anioPublicacionRevista) {
        this.anioPublicacionRevista = anioPublicacionRevista;
    }

    public String getPaisPublicacion() {
        return paisPublicacion;
    }

    public void setPaisPublicacion(String paisPublicacion) {
        this.paisPublicacion = paisPublicacion;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Detalles de la revista:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año de publicación: " + getAnioPublicacion());
        System.out.println("Nombre de la revista: " + nombreRevista);
        System.out.println("Periodicidad: " + periodicidad);
        System.out.println("Año de publicación de la revista: " + anioPublicacionRevista);
        System.out.println("País de publicación de la revista: " + paisPublicacion);
        System.out.println();
    }
}