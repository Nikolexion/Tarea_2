public class NoHayProductoException extends Exception{
    public static final long serialVersionUID =700L;

    public NoHayProductoException(String mensage) {
        super(mensage);
    }
}