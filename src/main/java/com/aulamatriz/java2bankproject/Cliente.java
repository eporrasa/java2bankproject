package com.aulamatriz.java2bankproject;

import java.util.Objects;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Cliente extends Persona {

    private String joinedDate;
    private boolean snActive = true;
    private String unactiveDate = "";

    public Cliente(String joinedDate, int id_Persona, String name, String lastName, int nroDoc, short age, String email, int nroMovil) {
        super(id_Persona, name, lastName, nroDoc, age, email, nroMovil);
        this.joinedDate = joinedDate;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    public boolean isSnActive() {
        return snActive;
    }

    public void setSnActive(boolean snActive) {
        this.snActive = snActive;
    }

    public String getUnactiveDate() {
        return unactiveDate;
    }

    public void setUnactiveDate(String unactiveDate) {
        this.unactiveDate = unactiveDate;
    }

    @Override
    public String toString() {
        return "Cliente{" + "joinedDate=" + joinedDate + ", snActive=" + snActive + ", unactiveDate=" + unactiveDate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.joinedDate);
        hash = 71 * hash + (this.snActive ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.unactiveDate);
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
        final Cliente other = (Cliente) obj;
        if (this.snActive != other.snActive) {
            return false;
        }
        if (!Objects.equals(this.joinedDate, other.joinedDate)) {
            return false;
        }
        return Objects.equals(this.unactiveDate, other.unactiveDate);
    }


}
