public class PagoInsuficienteException extends Exception{
    public static final long serialVersionUID =700L;

    public PagoInsuficienteException(String message) {
        super(message);
    }
}