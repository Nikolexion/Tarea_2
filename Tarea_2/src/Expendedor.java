class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito snickers;
    private Deposito super8;
    private DepositoM monVu;
    public int precioBebidas;
    public int precioDulces;
    public static final int  COCA = 1;
    public static final int  SPRITE = 2;
    public static final int  FANTA = 3;
    public Expendedor(int numBebida, int precioBebidas, int numDulces, int precioDulces){
        this.precioBebidas = precioBebidas;
        this.precioDulces = precioDulces;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        snickers = new Deposito();
        super8 = new Deposito();
        monVu = new DepositoM();

        for (int i = 0; i < numBebida; i++){
            coca.addProducto(new CocaCola(100 + i));
            sprite.addProducto(new Sprite(200 + i));
            fanta.addProducto(new Fanta(300 + i));
        }
        for (int i = 0; i < numDulces; i++){
            snickers.addProducto(new Snikers());
            super8.addProducto(new Super8());
        }
    }
    public Producto comprarProducto(Moneda m, int cual){

        if (m != null){
            if (m.getValor() >= precioBebidas) {
                int nb = (m.getValor() - precioBebidas) / 100;
                Producto aux;
                switch (cual) {
                    case COCA:
                        aux = coca.getProducto();
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
                        aux = sprite.getProducto();
                        if (aux == null) {
                            monVu.addMoneda(m);
                            return null;
                        } else {
                            for (int i = 0; i < nb; i++) {
                                monVu.addMoneda(new Moneda100());
                            }
                            return aux;
                        }
                    case FANTA:
                        aux = fanta.getProducto();
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