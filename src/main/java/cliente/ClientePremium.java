package cliente;

/**
 *
 * @author edwin
 */
public interface ClientePremium extends ClienteMedium{

    @Override
    public default boolean compraNacional() {
        return ClienteMedium.super.compraNacional(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  
    
    public default boolean compraInternacional() {
        return true;
    }


}
