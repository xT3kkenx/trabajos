package Empresa;

public class Cliente {
    
    public String Nombre;
    public int Telefono;
    public String Direccion;
    

    public Cliente(String Nombre, String Direccion , int Telefono){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String toString(){
    return Nombre + "Nombre" +  Telefono +"Telefono" + Direccion + "Dirreccion";
        
    }
}
