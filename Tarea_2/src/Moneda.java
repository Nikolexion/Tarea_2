abstract class Moneda implements Comparable<Moneda> {
    protected int serie;
    public Moneda() {

    }
    public Moneda getSerie(){
        return this;
    }

    public abstract int getValor();
    public abstract String toString();

    @Override
    public int compareTo(Moneda moneda) {
        return Integer.compare(this.getValor(), moneda.getValor());
    }
}