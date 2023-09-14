package Empresa;
public class Particulares extends Cliente{
private int Cedula;
private String Apellido;

public Particulares(int Cedula, String Nombre , int Telefono , String Direccion , String Apellido){

    super(Nombre,Direccion,Telefono);
    this.Cedula = Cedula;
    this.Apellido = Apellido; 
}

public int getCedula() {
    return Cedula;
}

public void setCedula(int cedula) {
    Cedula = cedula;
}

public String getApellido() {
    return Apellido;
}

public void setApellido(String apellido) {
    Apellido = apellido;
}
public String toString(){
    return super.toString() + ", Cedula: " + Cedula + " Apellido: " + Apellido;
}
}