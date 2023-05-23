package com.aulamatriz.java2bankproject;

import cliente.Cliente;
import java.util.List;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Java2BankProject {

    public static void main(String[] args) {

        Banco bank = new Banco(1, "Prueba W", 800411675, "Carrera 22");

        bank.addCliente(new Cliente("2023-05-01", 1, "Edwin", "Porras", 91422333, (short) 45, "asdfad@asdfgasdf.com", 31683245));
        bank.addCliente(new Cliente("2023-05-01", 1, "Pedro", "Perez", 56489423, (short) 33, "asasdfdfad@asdfgasdf.com", 354064323));
        bank.addCliente(new Cliente("2023-05-01", 1, "Rodrigo", "Rodriguez", 894313, (short) 18, "asdfasdad@asdfgasdf.com", 115522));
        bank.addCliente(new Cliente("2023-05-01", 1, "Sahil", "Saha", 564983, (short) 55, "aifukmsdfad@asdfgasdf.com", 978321));
        bank.addCliente(new Cliente("2023-05-01", 1, "Yogesh", "Palt", 5687333, (short) 40, "afgas4dfsdfad@asdfgasdf.com", 5463213));

        List<Cliente> listaClientes = bank.obtenerClientes();

        for (Cliente lc : listaClientes) {
            switch (lc.getNroDoc()) {
                case 91422333:
                    lc.addProducto(new Producto(Producto.TipoProductos.TARJETADEBITO));
                    lc.addProducto(new Producto(Producto.TipoProductos.CDT));
                    break;
                case 56489423:
                    lc.addProducto(new Producto(Producto.TipoProductos.CREDITOHIPOTECARIO));
                    lc.addProducto(new Producto(Producto.TipoProductos.CDT));
                    break;
                case 894313:
                    lc.addProducto(new Producto(Producto.TipoProductos.CTAAHORROS));
                    lc.addProducto(new Producto(Producto.TipoProductos.TARJETACREDITO));
                    lc.addProducto(new Producto(Producto.TipoProductos.TARJETADEBITO));
                    break;
                case 564983:
                    lc.addProducto(new Producto(Producto.TipoProductos.CTAAHORROS));
                    lc.addProducto(new Producto(Producto.TipoProductos.TARJETADEBITO));
                    break;
                case 5687333:
                    lc.addProducto(new Producto(Producto.TipoProductos.CREDITOLIBREINVERSION));
                    lc.addProducto(new Producto(Producto.TipoProductos.CDT));
                    break;
                default:
            }
        }

        listaClientes.stream()
                .filter(c -> c.getAge() > 30)
                .filter(c -> c.getAge() < 40)
                //                .filter(c -> {
                //                    c.obtenerProductos().stream()
                //                            .filter(a -> a.getTipo())) == Producto.TipoProductos.CDT
                //                }
                .forEach(System.out::print);
    }
}
