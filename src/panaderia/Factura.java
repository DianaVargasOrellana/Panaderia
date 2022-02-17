package panaderia;

import java.util.ArrayList;

public class Factura {
    private Cliente cliente;
    private ArrayList<Pedido> pedido;
    //private int cantidad;
    public Factura(Cliente cliente, ArrayList<Pedido> pedido ){
        this.cliente = cliente;
        this.pedido = pedido;
    }

    public void imprimirFactura(){
        System.out.println("---------FACTURA---------");
        System.out.println("Nit: " + cliente.getNit());
        System.out.println("Señor(es): " + cliente.getNombreC());
        System.out.println("-------------------------");
        System.out.println("Cant -- Detalle:        -----------------------------        P.Unit -- Subtotal");
        for (Pedido p: pedido){
            System.out.println(p.getCantidad() + " --     " + p.getProducto().nombre + "    --       " +p.getProducto().precio + "--" + p.calcularPrecioPedido()  );
        }
        int calcularTotal = CalcularTotal();
        System.out.println("Total Bs. " + calcularTotal);
    }

    private int CalcularTotal() {
        int total = 0;
        for (Pedido p : pedido){
            total += p.calcularPrecioPedido();
        }
        return  total;
    }
}
