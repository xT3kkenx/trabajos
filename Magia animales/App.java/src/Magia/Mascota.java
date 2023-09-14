package Magia;

public class Mascota {
    private String tipoAnimal, nombre;

    public Mascota(String tipoAnimal, String nombre) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void SetTipoAnimal(String tipoAnimal){
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
