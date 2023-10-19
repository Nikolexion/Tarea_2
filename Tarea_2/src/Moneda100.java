class Moneda100 extends Moneda{
    public Moneda100() {
        super();
    }
    @Override
    public int getValor() {
        return 100;
    }

    @Override
    public String toString() {
        return "Moneda100 {" +
                "serie = " + serie  + "; " +
                "valor = " + this.getValor() +
                '}';
    }
}
