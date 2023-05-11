package com.aulamatriz.java2bankproject;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Banco {
    private short id_Banco;
    private String name;
    private int nit;
    private String address;

    public short getId_Banco() {
        return id_Banco;
    }

    public void setId_Banco(short id_Banco) {
        this.id_Banco = id_Banco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Banco{" + "id_Banco=" + id_Banco + ", name=" + name + ", nit=" + nit + ", address=" + address + '}';
    }
    
    
}
