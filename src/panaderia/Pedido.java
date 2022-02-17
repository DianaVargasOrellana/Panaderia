package panaderia;

public class Pedido {
    private int cantidad;
    private Producto producto;

    public Pedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularPrecioPedido() {
        return producto.getPrecio() * cantidad;

    }
}