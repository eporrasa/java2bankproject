package com.aulamatriz.java2bankproject;

import cliente.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Java2BankProject {

    public static void main(String[] args) {

        Banco bank = new Banco(1, "Prueba W", 800411675, "Carrera 22");

        bank.addCliente(new Cliente("2023-05-01", 1, "Edwin", "Porras", 987654987, (short) 5, "asdfad@asdfgasdf.com", 31683245, "Bucaramanga"));
        bank.addCliente(new Cliente("2023-05-01", 2, "Edwin", "Porras", 91422333, (short) 45, "asdfad@asdfgasdf.com", 31683245, "Bogotá"));
        bank.addCliente(new Cliente("2023-05-01", 3, "Pedro", "Perez", 56489423, (short) 33, "asasdfdfad@asdfgasdf.com", 354064323, "Bogotá"));
        bank.addCliente(new Cliente("2023-05-01", 4, "Rodrigo", "Rodriguez", 894313, (short) 18, "asdfasdad@asdfgasdf.com", 115522, "Cali"));
        bank.addCliente(new Cliente("2023-05-01", 5, "Sahil", "Saha", 564983, (short) 55, "aifukmsdfad@asdfgasdf.com", 978321, "Barranquilla"));
        bank.addCliente(new Cliente("2023-05-01", 6, "Yogesh", "Palt", 5687333, (short) 40, "afgas4dfsdfad@asdfgasdf.com", 5463213, "Bogotá"));

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

        /*Todos los clientes*/
        System.out.println("Todos los Clientes del banco.... " + bank.getName());

        // listaClientes.stream().forEach(System.out::println);
        // imprima todos los clientes
        System.out.println("");
        System.out.println("***** Todos los clientes *****");
        listaClientes.stream().forEach(System.out::println);

        // listar todas las ciudad sin repetir
        System.out.println("");
        System.out.println("***** Ciudades sin repetir *****");
        listaClientes.stream()
                .map(c -> c.getCiudad())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // agrupar los clientes x tipo de producto
        System.out.println("");
        System.out.println("***** Clientes x Producto *****");

        Map<List<Producto>, List<Cliente>> mapProdCliente
                = listaClientes.stream()
                        //Para agrupar por la lista de productos todos los clientes
                        .collect(Collectors.groupingBy(Cliente::obtenerProductos));

        mapProdCliente.forEach((t, u) -> {
            System.out.println("Producto" + t.toString());
            System.out.println("Cliente" + u.toString());
            System.out.println("");
        });

        System.out.println("***** V2 - Clientes x Producto *****");

        List<List<Producto>> ListaProdCliente2
                = listaClientes.stream()
                        //Para agrupar por la lista de productos todos los clientes
                        .map(Cliente::obtenerProductos)
                        .collect(Collectors.toList());

        System.out.println("***** V3 Clientes x Producto *****");

        // Map < TipoProductos, List <Cliente>> mapProdCliente3 = 
//        Map <TipoProductos, List<Producto>> porProducto =
/*
        System.out.println(
                listaClientes.stream()
                        //Para agrupar por la lista de productos todos los clientes
                        .collect(Collectors.flatMapping(c -> c.obtenerProductos().stream(),
                                 Collectors.groupingBy(Producto::getTipo,
                                        Collectors.mapping(o -> o.toString(),
                                                 Collectors.toList())))
                        ));
         */
        Map<String, List<String>> sss
                = listaClientes.stream()
                        //Para agrupar por la lista de productos todos los clientes
                        .collect(Collectors.groupingBy(c -> c.getName(),
                                Collectors.flatMapping(t -> t.obtenerProductos()
                                .stream()
                                .map(m -> m.getTipo().toString()),
                                        Collectors.toList())
                        ));

//        Map<List<String>, String> mapInvertido = sss. 
        Map<String, List<String>> mpa = new TreeMap<>();

        sss.entrySet().stream().forEach(t -> {
            t.getValue().forEach(a -> {
                
                if (mpa.get(a) != null) {
                    mpa.get(a).add(t.getKey());
                } else {
                    List<String> abc = new ArrayList<>();
                    abc.add(t.getKey());
                    mpa.put(a, abc);
                }
            });
        });
        
        
        mpa.forEach((t, u) -> {
            System.out.println(t.toString());
            u.forEach(c -> System.out.println("\t\t" + c));

        });

//        ListaProdCliente2.forEach(System.out::println);
        /*       
        listaClientes.stream()
                .map(c->c.obtenerProductos().)
                .distinct()
                .forEach(System.out::println);
         */
//       BiPredicate<Cliente, Producto.TipoProductos> todosProductoCliente = (p, f) -> p.obtenerProductos().equals(f);
        //      System.out.println(todosProductoCliente.test(t, Producto.TipoProductos.CDT));
        // listado de los tipos de producto que se estan usando
        //      listaClientes.stream().forEach(System.out::println);
    }
}
