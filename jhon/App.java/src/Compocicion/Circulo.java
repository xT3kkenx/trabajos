package Compocicion;

public class Circulo {
    private Punto centro;
private int radio; 
/**
* @param x 
* @param y 
* @param radio
*/
public Circulo(Punto centro, int radio) {
this.centro = centro;
this.radio = radio;
}
/**
* @return
*/
int getRadio() {
return radio;
}
/**
* @param Parámetro
*/
void setRadio(int radio) {
this.radio = radio;
}

public void imprimir() {
System.out.println("El centro del círculo es la coordenada (" +
centro.getX() + "," + centro.getX() + ") y tiene un radio = " +radio);
}
    
}
