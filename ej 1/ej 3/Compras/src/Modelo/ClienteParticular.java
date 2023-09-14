package Modelo;

public class ClienteParticular extends Cliente {
    private String apellidos;
    private String numeroDocumento;

    public ClienteParticular(String apellidos, String numeroDocumento, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Tipo de cliente: Particular\n" +
               "Apellidos: " + apellidos + "\n" +
               "Número de documento: " + numeroDocumento + "\n" +
               super.toString();
    }
}