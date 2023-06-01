package cliente;

import java.util.List;
import java.util.Objects;
import com.aulamatriz.java2bankproject.Producto;
import java.util.ArrayList;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Cliente extends Persona { // implements ClienteClasico, ClienteMedium, ClientePremium {

    private String joinedDate;
    private boolean snActive = true;
    private String unactiveDate = "";
    private List<Producto> listaProductos;

    public Cliente(String joinedDate, int id_Persona, String name, String lastName, 
            int nroDoc, short age, String email, double nroMovil, String ciudad) {
        super(id_Persona, name, lastName, nroDoc, age, email, nroMovil, ciudad);
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

    public void addProducto(Producto p) {
//        try {
        if (this.getAge() >= 18) {
            this.listaProductos.add(p);
        }
        /*                else {
                throw new ClienteNoSeAdiciona("No se puede adicionar el cliente");
            }
        } catch (ClienteNoSeAdiciona e) {
            System.out.println(e.getMessage());
        }
         */
    }

    public List<Producto> obtenerProductos() {
        return this.listaProductos;
    }

    public String obtenerProductosToString() {
        String sProductos;

        sProductos = "\nCantidad de Productos: " + this.listaProductos.size();

        if (this.listaProductos.size() > 0) {
            if (this.listaProductos.size() == 1) {
                sProductos += "\nProducto: ";
            } else {
                sProductos += "\nProductos: ";
            }
            int i = 1;
            for (Producto listaProducto : listaProductos) {
                sProductos += "\n " + i + "- " + listaProducto.getTipo().toString();
                i++;
            }
        }
        return sProductos;
    }

    @Override
    public String toString() {
        return "Cliente: " + "Nombre=" + getName() + " Apellido: " + getLastName()
                + ", Edad = " + getAge()
                + ", Ciudad = " + getCiudad();
    }

    public String clientesConSusProductos() {
        return "Cliente: " + "Nombre=" + getName() + " Apellido: " + getLastName()
                + ", Edad = " + getAge()
                + obtenerProductosToString() + "\n";
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
