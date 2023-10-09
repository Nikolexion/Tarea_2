class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    public int precioBebidas;
    public static final int  COCA = 1;
    public static final int  SPRITE = 2;
    public Expendedor(int numBebida, int precioBebidas){
        this.precioBebidas = precioBebidas;
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();

        for (int i = 0; i < numBebida; i++){
            coca.addBebida(new CocaCola(100 + i));
            sprite.addBebida(new Sprite(200 + i));
        }
    }
    public Bebida comprarBebida(Moneda m, int cual){

        if (m != null){
            if (m.getValor() >= precioBebidas) {
                int nb = (m.getValor() - precioBebidas) / 100;
                Bebida aux;
                switch (cual) {
                    case COCA:
                        aux = coca.getBebida();
                        if (aux == null) {
                            monVu.addMoneda(m);
                            return null;
                        } else {
                            for (int i = 0; i < nb; i++) {
                                monVu.addMoneda(new Moneda100());
                            }
                            return aux;
                        }
                    case SPRITE:
                        aux = sprite.getBebida();
                        if (aux == null) {
                            monVu.addMoneda(m);
                            return null;
                        } else {
                            for (int i = 0; i < nb; i++) {
                                monVu.addMoneda(new Moneda100());
                            }
                            return aux;
                        }
                    default:
                        monVu.addMoneda(m);
                        return null;
                }
            } else {
                monVu.addMoneda(m);
                return null;
            }
        } else {
            return null;
        }

    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
    public int getPrecio() {
        return precioBebidas;
    }
}