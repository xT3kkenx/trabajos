import Modelo.ClienteEmpresa;
import Modelo.ClienteParticular;
import Modelo.Orden;
import Modelo.Producto;
public class App {
/**
* Método main que crea una orden conformada por cuatro
* productos con sus identificadores y cantidad. Luego, se añaden los
* cuatro productos como línea de pedido a la orden y se calcula el
* total de la orden
*/
public static void main(String[] args) throws Exception {
 // Creación de clientes
        ClienteEmpresa clienteEmpresa = new ClienteEmpresa("ADSO", "2616043", "Sena", "231-1234", "Centro de comercio y servcios"); 
        ClienteParticular clienteParticular = new ClienteParticular("Garzon Rojas", "10236545", "Jhonatan Steven", "669-375", "Esmeralda");

        // Creación de órdenes y agregando líneas de pedido
        Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metálica", 1000);
        Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro.", 3000);
        Producto producto3 = new Producto(3, "Cinta pegante", "Cinta adhesiva de color transparente.", 800);
        Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40 cms.", 600);

        Orden ordenEmpresa = new Orden(1, clienteEmpresa);
        ordenEmpresa.añadirItem(1, 5, producto1);
        ordenEmpresa.añadirItem(2, 3, producto2);

        Orden ordenParticular = new Orden(2, clienteParticular);
        ordenParticular.añadirItem(1, 2, producto1);
        ordenParticular.añadirItem(3, 1, producto3);
        ordenParticular.añadirItem(4, 4, producto4);

        // Calcular y mostrar el total de las órdenes
        System.out.println("Orden de Empresa:\n" + ordenEmpresa);
        System.out.println("Orden de Particular:\n" + ordenParticular);
    }
}