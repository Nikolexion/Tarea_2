public enum PrecioProducto {
    COCA(1000),
    SPRITE(900),
    FANTA(800),
    SNICKERS(700),
    SUPER8(600);

    private int precio;

    PrecioProducto(int precio){
        this.precio = precio;
    }
    public int getPrecioProducto(){
        return precio;
    }
}
