import java.util.ArrayList;
import java.util.List;

import modelo.Autobus;
import modelo.Cuenta;
import modelo.Persona;
import modelo.Turismo;
import modelo.Vehiculo;
public class App {
    public static void main(String[] args) throws Exception {
    // Objetos//
     Persona p1 = new Persona();
     Persona p2 = new Persona();
     
     
     // Atributos //
     p1.setNombre("Jhon");
     p1.setApellidos("Serrato");
     p2.setNombre("Jhonatan");
     p2.setApellidos("Garzon");

     //p1.nombre = "Juan";
     //p1.apellidos = "Gonzales";
     //p2.nombre = "Luis";
     //p2.apellidos = "Gomez";
     //p1.mostrarNombre();
     //p2.mostrarNombre(); 
     // importacion que corre el codigo //
    p1.mostrarNombre();
    p2.mostrarNombre();

     //Atributos

    Cuenta miCuenta1 = new Cuenta();
    Cuenta miCuenta2 = new Cuenta(6000);

    //imprecion en pantalla
     System.out.print("Limite cuenta 1 (normal):" );
     System.out.println(miCuenta1.getLimiteCredito());
     System.out.print("Limite cuenta 2 (vip):");
     System.out.println(miCuenta2.getLimiteCredito());
    

        String pi = new String("3.141592");
        double PI;
        PI = Double.parseDouble(pi);
        System.out.println(pi);
        System.out.println(PI+1);

        List listaVehiculos = new ArrayList();

        listaVehiculos.add(new Vehiculo("Mercedes","E",55));
        listaVehiculos.add(new Autobus("Mercedes","M20",100,20));
        listaVehiculos.add(new Turismo("","", 50, 4));
        listaVehiculos.add(new Turismo("Audi","A4",55,4));
        listaVehiculos.add(new Autobus("Mercedes","M10",120,30));
        listaVehiculos.add(new Turismo("VW","Passat",35,4));
        listaVehiculos.add(new Turismo("Audi","A3",30,2));
        listaVehiculos.add(new Turismo("Mercedes","E",60,4));
        listaVehiculos.add(new Vehiculo("Audi","A3",30));
        imprimirElementosLista((ArrayList)listaVehiculos);
    }

    private static void imprimirElementosLista(ArrayList listaVehiculos) {
      for (int i = 0; i < listaVehiculos.size(); i++) {
       Vehiculo v = (Vehiculo)listaVehiculos.get(i);
        v.imprimirAtributos();
        System.out.println("");
       }
     }

}
