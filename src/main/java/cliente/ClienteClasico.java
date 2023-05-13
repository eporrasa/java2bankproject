package cliente;

/**
 *
 * @author edwin
 */
public interface ClienteClasico {

    public default boolean addProduct() {
        return true;
    }

    public default boolean compraNacional() {
        return true;
    }
    
    public default boolean estudioCredito(){
        return true;
    }
    
}
