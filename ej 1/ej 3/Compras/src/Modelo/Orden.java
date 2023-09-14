package Modelo;
import java.util.Vector;
/**
* Esta clase denominada Orden modela una orden de pedido que está
* conformada por el identificador de la orden y un vector de líneas de
* pedido.
*/
public class Orden {
    private int identificador;
    private Vector<LíneaPedido> itemsPedido;
    private Cliente cliente; // Agregar referencia al cliente

    public Orden(int identificador, Cliente cliente) {
        this.identificador = identificador;
        this.itemsPedido = new Vector<>();
        this.cliente = cliente;
    }
/**
* Método que obtiene el identificador de una orden de pedido
* @return El identificador de una orden de pedido
*/
public int getIdentificador() {
return identificador;
}
/**
* Método que establece el identificador de una orden de pedido
* @param identificador Parámetro que define el identificador de una
* orden de pedido
*/
public void setIdentificador(int identificador) {
this.identificador = identificador;
}
/**
* Método que calcula el total de una orden de pedido
* @return El total de una orden de pedido
*/
public int calcularTotalOrden() {
int totalOrden = 0;
for(int i = 0; i < itemsPedido.size(); i++) { /* Recorre el vector de
líneas de pedido */
// Obtiene cada objeto del vector aplicando casting
LíneaPedido línea = (LíneaPedido) itemsPedido.elementAt(i);
// Va totalizando la orden mediante la suma de los subtotales
totalOrden = totalOrden + línea.calcularSubtotalLíneaPedido();
}
return totalOrden;
}
/**
* Método que convierte a String los datos de una orden de pedido
* @return Un String con los datos de una orden de pedido
*/
public String toString() {
return "Orden [id = " + identificador +"]\n" + "Items del pedido\n" + itemsPedido +
"\nTotal orden = $" + calcularTotalOrden();
}
/**
* Método que permite agregar una línea de pedido a la orden
347Relaciones de asociación, agregación y composición
* @param identificador Parámetro que define el identificador de la
* línea de pedido
* @param cantidad Parámetro que define la cantidad de producto
* solicitado en la línea de pedido
* @param producto Parámetro que define el producto solicitado en
* la línea de pedido
*/
public void añadirItem(int identificador, int cantidad, Producto producto) {
// Crea un línea de pedido
LíneaPedido línea= new LíneaPedido(identificador, cantidad,
producto);
itemsPedido.add(línea); /* Añade la línea de pedido creada al
vector de líneas de pedido */
}
}
