package modelo;

public class Autobus extends Vehiculo {
 private int numPlazas;
 
 public Autobus(String marca, String modelo,
 double precioAlquiler, int numPlazas) {
 
    super(marca, modelo, precioAlquiler);

     setNumPlazas(numPlazas);
    }

public int getNumPlazas() {
    return numPlazas;
}

public void setNumPlazas(int numPlazas) {
    this.numPlazas = numPlazas;
}
    
}
