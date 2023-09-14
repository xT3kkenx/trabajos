package Empresa;

public class Producto {
    private int identificador; 
    private String nombre; 
    private String descripción; 
    private int precio; 
    /**
    * @param identificador 
    * @param nombre 
    * @param descripción 
    * @param precio 
    */
    public Producto(int identificador, String nombre, String descripción, int precio) {
    this.identificador = identificador;
    this.nombre = nombre;
    this.descripción = descripción;
    this.precio = precio; 
    }
    /**
    * @return 
    */
    public int getIdentificador() {
    return identificador;
    }
    /**
    * @param identificador
    */
    public void setIdentificador(int identificador) {
    this.identificador = identificador;
    }
    /**
    * @return 
    */
    public String getNombre() {
    return nombre;
    }
    /**
    * @param nombre
    */
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    /**
    * @return 
    */
    public String getDescripción() {
    return descripción;
    } 
    /**
    * @param descripción 
    */
    public void setDescripción(String descripción) {
    this.descripción = descripción;
    }
    /**
    * @return 
    */
    public int getPrecio() {
    return precio;
    }
    /**
    * @param precio 
    */
    public void setPrecio(int precio) {
    this.precio = precio;
    }
    /**
    * @return 
    */
    public String toString() {
    return "id = " + identificador + ", Nombre = " + nombre + ",Descripción = "
    + descripción + ", Precio = $ " + precio;
    }
}
