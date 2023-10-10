abstract class Bebida extends Producto{
    private int serie;
    public Bebida(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return this.serie;
    }
    public abstract String comer();
}