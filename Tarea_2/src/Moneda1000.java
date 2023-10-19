class Moneda1000 extends Moneda{
    public Moneda1000() {
        super();
    }
    @Override
    public int getValor() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Moneda1000 {" +
                "serie = " + serie  + "; " +
                "valor = " + this.getValor() +
                '}';
    }
}
