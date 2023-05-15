package cliente;

import com.aulamatriz.java2bankproject.Producto;

/**
 *
 * @author edwin
 */
public interface ClienteClasico {

    public default boolean addProduct(Producto prod) {
        try {
            prod.setTipo(Producto.TipoProductos.CTAAHORROS);
        } catch (Exception e) {
            System.out.println("Error Adding Producto - " + e.getMessage());
            return false;
        }
        return true;
    }

    public default boolean compraNacional() {
        return true;
    }

    public default boolean estudioCredito() {
        return true;
    }

}
