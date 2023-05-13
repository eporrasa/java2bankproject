package com.aulamatriz.java2bankproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producto {

    public enum TipoProductos {
        TARJETACREDITO(1, "Tarjeta de Crédito"),
        CTAAHORROS(2, "Cuenta de Ahorros"),
        CREDITOHIPOTECARIO(3, "Credito Hipotecario"),
        TARJETADEBITO(4, "Tarjeta Débito"),
        CDT(5, "CDT"),
        CREDITOLIBREINVERSION(6, "Credito Libre Inversión");
        private int tipo;
        private String descripcion;

        TipoProductos(int numero, String txtDescription) {
            this.tipo = numero;
            this.descripcion = txtDescription;
        }

        @Override
        public String toString() {
            return "TipoProductos{" + "tipo=" + tipo + ", descripcion=" + descripcion + '}';
        }
    }

    private TipoProductos tipo;

    public Producto(TipoProductos tipoProducto) {
        this.tipo = tipoProducto;
        switch (tipoProducto) {
            case TARJETACREDITO:
                break;
            case TARJETADEBITO:
                break;
            case CDT:
                break;
            case CTAAHORROS:
                break;
            case CREDITOHIPOTECARIO:
                break;
            case CREDITOLIBREINVERSION:
                break;
            default:
                throw new AssertionError();
        }

        try {
            this.snInsertToDb();
        } catch (SQLException sqlEx) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, sqlEx);
        } catch (Exception ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean snInsertToDb() throws SQLException, Exception {
        try {
            InputStream file = new FileInputStream("banco.txt");
            
            System.out.println("Se ha abierto banco.txt");
            int data = file.read();
            
        } catch(FileNotFoundException file){
            System.out.print("Error 1 - " + file.getClass().getName() + " - ");
            System.out.print(file.getMessage());
            
        }catch(IOException file){
            System.out.print("Error 2 - " + file.getClass().getName() + " - ");
            System.out.print(file.getMessage());
            
        }
       return false;
        //throw new Exception();
    }

    public TipoProductos getTipo() {
        return tipo;
    }

    public void setTipo(TipoProductos tipo) {
        this.tipo = tipo;
    }

}
