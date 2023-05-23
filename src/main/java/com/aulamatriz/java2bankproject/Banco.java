package com.aulamatriz.java2bankproject;

import cliente.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Banco {

    private int id_Banco;
    private String name;
    private int nit;
    private String address;
    private List<Cliente> listClientes;

    public Banco(int id_Banco, String name, int nit, String address) {
        this.id_Banco = id_Banco;
        this.name = name;
        this.nit = nit;
        this.address = address;
        this.listClientes = new ArrayList<>();
    }

    public int getId_Banco() {
        return id_Banco;
    }

    public String getName() {
        return name;
    }

    public int getNit() {
        return nit;
    }

    public String getAddress() {
        return address;
    }

    public void addCliente(Cliente c) {
        this.listClientes.add(c);
    }

    public List<Cliente> obtenerClientes() {
        return this.listClientes;
    }

    @Override
    public String toString() {
        return "Banco{" + "id_Banco=" + id_Banco + ", name=" + name + ", nit=" + nit + ", address=" + address + '}';
    }

}
