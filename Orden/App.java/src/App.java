import Empresa.Empresa;
import Empresa.Orden;
import Empresa.Producto;

public class App {
    public static void main(String[] args) throws Exception {
        Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metálica",1000);
        Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro.", 3000);
        Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40 cms.",600);
        Empresa empresa = new Empresa(2515515, "Jhon", 2522555, "calle 20");
        Orden orden = new Orden(1, empresa);
        orden.añadirItem(1, 5, producto1);
        orden.añadirItem(2, 3, producto2);
        orden.añadirItem(3, 2, producto1);
        orden.añadirItem(4, 4, producto4);
        orden.calcularTotalOrden();
        System.out.println(orden);
        
    }
}
