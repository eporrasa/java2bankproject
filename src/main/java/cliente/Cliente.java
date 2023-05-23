package cliente;

import java.util.List;
import java.util.Objects;
import com.aulamatriz.java2bankproject.Producto;
import java.util.ArrayList;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Cliente extends Persona{ // implements ClienteClasico, ClienteMedium, ClientePremium {

    private String joinedDate;
    private boolean snActive = true;
    private String unactiveDate = "";
    private List<Producto> listaProductos;

    public Cliente(String joinedDate, int id_Persona, String name, String lastName, int nroDoc, short age, String email, double nroMovil) {
        super(id_Persona, name, lastName, nroDoc, age, email, nroMovil);
        this.joinedDate = joinedDate;
        this.listaProductos = new ArrayList<>();
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
    
    public void addProducto(Producto p){
        this.listaProductos.add(p);
    }
    
    public List<Producto> obtenerProductos(){
        return this.listaProductos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + getName() + " - Productos: " + obtenerProductos() + '}';
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
