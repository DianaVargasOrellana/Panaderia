import panaderia.Cliente;
import panaderia.Factura;
import panaderia.Pan;
import panaderia.Pedido;

import java.util.ArrayList;

public class Main {
    public static void  main(String[] args){
        Pan panMarraqueta = new Pan("Marraqueta", 1); //se puede mejorar con herencia
        Pedido pedidoPan = new Pedido(panMarraqueta, 5);
        ArrayList<Pedido> pedido = new ArrayList<Pedido>();
        pedido.add(pedidoPan);
        Cliente cliente1 = new Cliente("Diana Vargas",3150476);
        Factura factura = new Factura(cliente1, pedido);
        factura.imprimirFactura();
    }
}
