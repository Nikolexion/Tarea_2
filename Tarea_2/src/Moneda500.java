class Moneda500 extends Moneda{
    public Moneda500() {
        super();
    }
    @Override
    public int getValor() {
        return 500;
    }

    @Override
    public String toString() {
        return "Moneda500 {" +
                "serie = " + serie  + "; " +
                "valor = " + this.getValor() +
                '}';
    }
}