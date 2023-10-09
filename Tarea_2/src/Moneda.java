abstract class Moneda {
    protected int serie;
    public Moneda() {

    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
}