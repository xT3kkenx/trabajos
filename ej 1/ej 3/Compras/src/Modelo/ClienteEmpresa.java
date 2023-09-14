package Modelo;

public class ClienteEmpresa extends Cliente {
    private String razonSocial;
    private String nit;

    public ClienteEmpresa(String razonSocial, String nit, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
        this.razonSocial = razonSocial;
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Tipo de cliente: Empresa\n" +
               "Razón social: " + razonSocial + "\n" +
               "NIT: " + nit + "\n" +
               super.toString();
    }
}