class Moneda1500 extends Moneda{
    public Moneda1500() {
        super();
    }

    @Override
    public int getValor() {
        return 1500;
    }

    @Override
    public String toString() {
        return "Moneda1500 {" +
                "serie = " + serie  + "; " +
                "valor = " + this.getValor() +
                '}';
    }
}
