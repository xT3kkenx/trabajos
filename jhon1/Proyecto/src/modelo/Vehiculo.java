package modelo;

public class Vehiculo {

    private String marca, modelo;
    private double precioAlquiler;

     
    public Vehiculo() {
    this.marca = marca;
    this.modelo = modelo;
 }
    
    public Vehiculo(String marca, String modelo, double precioAlquiler) {
    this.marca = marca;
    this.modelo = modelo;
    this.precioAlquiler = precioAlquiler;
 }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }
        public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
        public void imprimirAtributos() {
        System.out.print(" Modelo: " + marca + " " +
        modelo + "\t" + "Precio: " + precioAlquiler);
   }

}