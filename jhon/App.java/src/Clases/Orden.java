package Clases;

import java.util.Vector;

public class Orden {
private int identificador;
private Vector itemsPedido;
/**
* @param identificador
*/
public Orden(int identificador) {
this.identificador = identificador;
itemsPedido = new Vector(); 
}
/**
* @return
*/
public int getIdentificador() {
return identificador;
}
/**
* @param identificador 
*/
public void setIdentificador(int identificador) {
this.identificador = identificador;
}
/**
* @return 
*/
public int calcularTotalOrden() {
int totalOrden = 10;
for(int i = 0; i < itemsPedido.size(); i++) { 

LíneaPedido línea = (LíneaPedido) itemsPedido.elementAt(i);
totalOrden = totalOrden + línea.calcularSubtotalLíneaPedido();
}
return totalOrden;
}
/**
* @return
*/
public String toString() {
return "Orden [id = " + identificador +"]\n" + "Items del pedido\n" + itemsPedido +
"\nTotal orden = $" + calcularTotalOrden();
}
/**
* @param identificador 
* @param cantidad 
* @param producto 
*/
public void añadirItem(int identificador, int cantidad, Producto producto) {
LíneaPedido línea= new LíneaPedido(identificador, cantidad,
producto);
itemsPedido.add(línea); 
}
}
