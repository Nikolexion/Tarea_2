abstract class Moneda implements Comparable<Moneda> {
    protected int serie;
    public Moneda() {

    }
    public Moneda getSerie(){
        return this;
    }

    public abstract int getValor();
    @Override
    public String toString() {
        return "{" +
                " serie (puntero) = " + super.toString() + "; " +
                "valor = " + this.getValor() +
                '}';
    }

    @Override
    public int compareTo(Moneda moneda) {
        return Integer.compare(this.getValor(), moneda.getValor());
    }
}