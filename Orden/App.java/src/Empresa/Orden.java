package Empresa;

import java.util.Vector;

public class Orden {
    
private int identificador;
private Vector itemsPedido;
private Cliente cliente;
/**
* @param identificador
*/
public Orden(int identificador , Cliente cliente) {
this.identificador = identificador;
itemsPedido = new Vector(); 
this.cliente = cliente;
}
/**
* @return
*/
public int getIdentificador() {
return identificador;
}

public Cliente getCliente() {
    return cliente;
}
public void setCliente(Cliente cliente) {
    this.cliente = cliente;
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
int totalOrden = 0;
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
return "Cliente" + cliente + "Orden [id = " + identificador +"]\n" + "Items del pedido\n" + itemsPedido +
"\nTotal orden = $" + calcularTotalOrden();
}
/**
* @param identificador 
* @param cantidad 
* @param producto 
*/
public void añadirItem(int identificador, int cantidad, Producto producto) {
LíneaPedido línea= new LíneaPedido();
itemsPedido.add(línea); 
}
}
