package com.aulamatriz.java2bankproject;

import java.util.Objects;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Persona {
    private int id_Persona;
    private String name;
    private String lastName;
    private int nroDoc;
    private short age;
    private String email;
    private int nroMovil;

    public Persona(int id_Persona, String name, String lastName, int nroDoc, short age, String email, int nroMovil) {
        this.id_Persona = id_Persona;
        this.name = name;
        this.lastName = lastName;
        this.nroDoc = nroDoc;
        this.age = age;
        this.email = email;
        this.nroMovil = nroMovil;
    }

    public int getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(int nroDoc) {
        this.nroDoc = nroDoc;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNroMovil() {
        return nroMovil;
    }

    public void setNroMovil(int nroMovil) {
        this.nroMovil = nroMovil;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_Persona=" + id_Persona + ", name=" + name + ", lastName=" + lastName + ", nroDoc=" + nroDoc + ", age=" + age + ", email=" + email + ", nroMovil=" + nroMovil + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id_Persona;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.lastName);
        hash = 67 * hash + this.nroDoc;
        hash = 67 * hash + this.age;
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + this.nroMovil;
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
        final Persona other = (Persona) obj;
        if (this.id_Persona != other.id_Persona) {
            return false;
        }
        if (this.nroDoc != other.nroDoc) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.nroMovil != other.nroMovil) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }

    
}
