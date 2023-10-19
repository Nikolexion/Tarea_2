class Expendedor{
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    private Deposito<Moneda> monVu;
    public int precioBebidas;
    public int precioDulces;
    public static final int  COCA = 1;
    public static final int  SPRITE = 2;
    public static final int  FANTA = 3;
    public static final int  SNIKERS = 4;
    public static final int  SUPER8 = 5;
    public Expendedor(int numBebida, int precioBebidas, int numDulces, int precioDulces){
        this.precioBebidas = precioBebidas;
        this.precioDulces = precioDulces;
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        monVu = new Deposito<>();

        for (int i = 0; i < numBebida; i++){
            coca.addElemento(new CocaCola(100 + i));
            sprite.addElemento(new Sprite(200 + i));
            fanta.addElemento(new Fanta(300 + i));
        }
        for (int i = 0; i < numDulces; i++){
            snickers.addElemento(new Snikers());
            super8.addElemento(new Super8());
        }
    }
    public Producto comprarProducto(Moneda m, int cual){
        try {
            if (m != null){
                try {
                    if (m.getValor() >= precioBebidas) {
                        int VueltoBebida = (m.getValor() - precioBebidas) / 100;
                        Producto aux;
                        switch (cual) {
                            case COCA:
                                aux = coca.getElemento();
                                try {
                                    if (aux == null) {
                                        monVu.addElemento(m);
                                        throw new NoHayProductoException("No hay CocaCola");
                                    } else {
                                        for (int i = 0; i < VueltoBebida; i++) {
                                            monVu.addElemento(new Moneda100());
                                        }
                                        return aux;
                                    }
                                } catch (Exception e){
                                    System.out.println(e.getMessage());
                                    return null;
                                }
                            case SPRITE:
                                try {
                                    aux = sprite.getElemento();
                                    if (aux == null) {
                                        monVu.addElemento(m);
                                        throw new NoHayProductoException("No hay Sprite");
                                    } else {
                                        for (int i = 0; i < VueltoBebida; i++) {
                                            monVu.addElemento(new Moneda100());
                                        }
                                        return aux;
                                    }
                                } catch (Exception e){
                                    System.out.println(e.getMessage());
                                    return null;
                                }
                            case FANTA:
                                aux = fanta.getElemento();
                                try {
                                    if (aux == null) {
                                        monVu.addElemento(m);
                                        throw new NoHayProductoException("No hay Fanta");
                                    } else {
                                        for (int i = 0; i < VueltoBebida; i++) {
                                            monVu.addElemento(new Moneda100());
                                        }
                                        return aux;
                                    }
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    return null;
                                }
                            case SNIKERS:
                                break;
                            case SUPER8:
                                break;
                            default:
                                monVu.addElemento(m);
                                throw new NoHayProductoException("No hay un producto con ese número correspondiente");
                        }

                    } if (m.getValor() >= precioDulces){
                        int VueltoDulce = (m.getValor() - precioDulces) / 100;
                        Producto aux;
                        switch (cual){
                            case SNIKERS:
                                aux = snickers.getElemento();
                                try {
                                    if (aux == null) {
                                        monVu.addElemento(m);
                                        throw new NoHayProductoException("No hay Snikers");
                                    } else {
                                        for (int i = 0; i < VueltoDulce; i++) {
                                            monVu.addElemento(new Moneda100());
                                        }
                                        return aux;
                                    }
                                } catch (Exception e){
                                    System.out.println(e.getMessage());
                                    return null;
                                }
                            case SUPER8:
                                aux = super8.getElemento();
                                try {
                                    if (aux == null) {
                                        monVu.addElemento(m);
                                        throw new NoHayProductoException("No hay Super8");
                                    } else {
                                        for (int i = 0; i < VueltoDulce; i++) {
                                            monVu.addElemento(new Moneda100());
                                        }
                                        return aux;
                                    }
                                } catch (Exception e){
                                    System.out.println(e.getMessage());
                                    return null;
                                }
                            default:
                                monVu.addElemento(m);
                                throw new NoHayProductoException("No hay un producto con ese número correspondiente");
                        }

                    } else {
                        monVu.addElemento(m);
                        throw new PagoInsuficienteException("El saldo es menor al precio del producto");
                    }
                } catch (Exception e){
                    System.out.println(e.getMessage());
                    return null;
                }
            } else {
                throw new PagoIncorrectoException("Se ha pagado con una moneda invalida");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }


    }
    public Moneda getVuelto(){
        return monVu.getElemento();
    }
    public int getPrecio() {
        return precioBebidas;
    }
}