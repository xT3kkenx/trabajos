package Empresa;

public class Empresa extends Cliente{
private int nit;

public Empresa(int nit, String Nombre , int Telefono , String Direccion){

    super(Nombre,Direccion,Telefono);
    this.nit = nit;
}

public int getNit() {
    return nit;
}

public void setNit(int nit) {
    this.nit = nit;
}
public String toString(){
    return super.toString() + ", Nit: " + nit;
    
}
}