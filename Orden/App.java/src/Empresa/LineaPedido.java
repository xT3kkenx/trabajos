package Empresa;

public class LineaPedido {
    private int identificador; 
    private int cantidad;
    private Producto producto; 
    /**
    * @param identificador
    * @param cantidad 
    * @param producto 
    */
    public LineaPedido(int identificador, int cantidad, Producto producto) {
    this.identificador = identificador;
    this.cantidad = cantidad;
    this.producto = producto;
    }
    /**
    @return 
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
    public int getCantidad() {
    return cantidad;
    }
    /**
    * @param cantidad¿
    */
    public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
    }
    /**
    * @return 
    */
    public Producto getProducto() {
    return producto;
    }
    /**
    * @param producto
    */
    public void setProducto(Producto producto) {
    this.producto = producto;
    }
    /**
    * @return
    */
    public int calcularSubtotalLíneaPedido() {
    return cantidad * producto.getPrecio();
    }
    /**
    * @return 
    */
    public String toString() {
    return "Línea de Pedido [id = " + identificador + ", Cantidad = " +
    cantidad + ", Producto = " + producto + "]\n";
    } 
}
