package com.aulamatriz.java2bankproject;

import java.util.Objects;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Productos {
    private short productID;
    private String productName;
    private String productNameShort;
    private String startDate;
    private boolean snActive = true;
    private String unactiveDate = "";

    public Productos(short productID, String productName, String productNameShort, String startDate) {
        this.productID = productID;
        this.productName = productName;
        this.productNameShort = productNameShort;
        this.startDate = startDate;
    }

    public short getProductID() {
        return productID;
    }

    public void setProductID(short productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNameShort() {
        return productNameShort;
    }

    public void setProductNameShort(String productNameShort) {
        this.productNameShort = productNameShort;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
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
        return "Productos{" + "productID=" + productID + ", productName=" + productName + ", productNameShort=" + productNameShort + ", startDate=" + startDate + ", snActive=" + snActive + ", unactiveDate=" + unactiveDate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.productID;
        hash = 47 * hash + Objects.hashCode(this.productName);
        hash = 47 * hash + Objects.hashCode(this.productNameShort);
        hash = 47 * hash + Objects.hashCode(this.startDate);
        hash = 47 * hash + (this.snActive ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.unactiveDate);
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
        final Productos other = (Productos) obj;
        if (this.productID != other.productID) {
            return false;
        }
        if (this.snActive != other.snActive) {
            return false;
        }
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (!Objects.equals(this.productNameShort, other.productNameShort)) {
            return false;
        }
        if (!Objects.equals(this.startDate, other.startDate)) {
            return false;
        }
        return Objects.equals(this.unactiveDate, other.unactiveDate);
    }
    
}
