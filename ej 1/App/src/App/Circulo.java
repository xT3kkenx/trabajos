package App;
/**
* Esta clase denominada Círculo modela este tipo de figura geometrica
* que se caracteriza por tener un centro y un radio como atributos.
*/
public class Circulo {
/* Atributo que identifica el punto central donde se encuentra
localizado un círculo */
private Punto centro;
private int radio; // Atributo que identifica el radio de un círculo
/**
* Constructor de la clase Círculo
* @param x Parámetro que define la coordenada x de un punto que
* establece el centro del círculo
* @param y Parámetro que define la coordenada y de un punto que
* establece el centro del círculo
* @param radio Parámetro que define el radio del círculo
*/
public Circulo(Punto centro, int radio) {
this.centro = centro;
this.radio = radio;
}
/**
* Método que devuelve el radio de un círculo
* @return El radio de un círculo
*/
int getRadio() {
return radio;
}
/**
* Método que establece el radio de un círculo
* @param Parámetro que define el radio de un círculo
*/
void setRadio(int radio) {
this.radio = radio;
}
/**
* Método que muestra en pantalla los datos de un círculo
*/
public void imprimir() {
System.out.println("El centro del círculo es la coordenada (" +
centro.getX() + "," + centro.getY() + ") y tiene un radio = " +radio);
}
}
