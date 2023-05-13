package com.aulamatriz.java2bankproject;

import cliente.Cliente;
import java.util.Objects;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Empleado extends Cliente{
    private int id_Empleado;
    private short securityLevel;
    private String contactName;
    private int contactPhone;

    public Empleado(int id_Empleado, short securityLevel, String contactName, int contactPhone, String joinedDate, int id_Persona, String name, String lastName, int nroDoc, short age, String email, int nroMovil) {
        super(joinedDate, id_Persona, name, lastName, nroDoc, age, email, nroMovil);
        this.id_Empleado = id_Empleado;
        this.securityLevel = securityLevel;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    public int getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public short getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(short securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(int contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_Empleado=" + id_Empleado + ", securityLevel=" + securityLevel + ", contactName=" + contactName + ", contactPhone=" + contactPhone + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id_Empleado;
        hash = 53 * hash + this.securityLevel;
        hash = 53 * hash + Objects.hashCode(this.contactName);
        hash = 53 * hash + this.contactPhone;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.id_Empleado != other.id_Empleado) {
            return false;
        }
        if (this.securityLevel != other.securityLevel) {
            return false;
        }
        if (this.contactPhone != other.contactPhone) {
            return false;
        }
        return Objects.equals(this.contactName, other.contactName);
    }
    
}
