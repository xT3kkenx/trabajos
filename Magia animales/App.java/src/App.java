import Magia.Mago;
import Magia.Mascota;
import Zoologico.Animal;
import Zoologico.Dueño;
public class App {
    public static void main(String[] args) throws Exception {
        Mascota m1 = new Mascota("Perro", "Max");
        Mago l1 = new Mago("Jhonatan", m1);
        l1.mostrarDatos();

    Animal v1 = new Animal("Perro", "Max");
    Dueño z1 = new Dueño("Jhonatan", v1);
    z1.mostrarDatos();
    
    }
}
