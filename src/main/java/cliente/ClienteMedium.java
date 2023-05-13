package cliente;

/**
 *
 * @author edwin
 */
public interface ClienteMedium extends ClienteClasico{

    public default boolean addProduct() {
        return true;
    }

    public default boolean compraNacional() {
        return true;
    }
    
    public default boolean validacionSueldo(){
        return true;
    }

}
