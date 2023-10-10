class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Producto b = exp.comprarProducto(m, cualBebida);
        if (m != null){
            if (b == null){
                sonido = null;
            } else {
                sonido = b.comer();

            }
            Moneda aux;
            aux = exp.getVuelto();
            while (aux != null){
                vuelto += aux.getValor();
                aux = exp.getVuelto();
            }
        } else {
            sonido = null;
            this.vuelto = 0;
        }
    }
    public int cuantoVuelto(){
        return this.vuelto;
    }
    public String queBebiste(){
        return sonido;
    }
}