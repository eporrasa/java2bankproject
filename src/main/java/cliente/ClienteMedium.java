package cliente;

/**
 *
 * @author edwin
 */
public interface ClienteMedium extends ClienteClasico{

    @Override
    public default boolean compraNacional() {
        return ClienteClasico.super.compraNacional(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    public default boolean validacionSueldo(){
        return true;
    }

}
