package modelo;

public class Persona {
    // Atributos
    private String dni, nombre, apellidos;
    private int añoNacimiento;
     // Metodo 
     public void mostrarNombre() {
     System.out.println(nombre + " " + apellidos);
 }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getAñoNacimiento() {
        return añoNacimiento;
    }
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
 
}
