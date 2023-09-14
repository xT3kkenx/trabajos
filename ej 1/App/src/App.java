import App.Circulo;
import App.Punto;
public class App {
/**
* Método main que crea un círculo localizado en el punto (2,3) y
* con un radio de 5. Luego, imprime los datos del círculo en
* pantalla.
*/
public static void main(String[] args) throws Exception {
Circulo círculo1 = new Circulo(new Punto(2, 3),5);
círculo1.imprimir();
}
}