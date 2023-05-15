package cliente;

/**
 *
 * @author edwin
 */
public interface ClientePremium extends ClienteMedium{

    @Override
    public default boolean addProduct() {
        return ClienteMedium.super.addProduct(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public default boolean compraNacional() {
        return ClienteMedium.super.compraNacional(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  
    
    public default boolean compraInternacional() {
        return true;
    }


}
