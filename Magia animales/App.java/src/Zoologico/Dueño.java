package Zoologico;

public class Dueño {
    private String nombre;
    private Animal complice;

    public void mostrarDatos() {
        System.out.println("El animal se llama: " + nombre + " " + "Tiene de mascota un(a)" + complice.getNombre());

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal getComplice() {
        return complice;
    }

    public Dueño(String nombre, Animal complice) {
        this.nombre = nombre;
        this.complice = complice;
    }    
}
