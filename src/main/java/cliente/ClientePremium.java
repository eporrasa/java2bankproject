package cliente;

/**
 *
 * @author edwin
 */
public interface ClientePremium extends ClienteMedium{

    public default boolean addProduct() {
        return true;
    }

    public default boolean compraInternacional() {
        return true;
    }

    public default boolean compraNacional() {
        return true;
    }

}
