class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    private Deposito<Moneda> monVu;

    public Expendedor(int numProductos) {

        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        monVu = new Deposito<>();

        for (int i = 0; i < numProductos; i++) {
            coca.addElemento(new CocaCola(100 + i));
            sprite.addElemento(new Sprite(200 + i));
            fanta.addElemento(new Fanta(300 + i));
        }
        for (int i = 0; i < numProductos; i++) {
            snickers.addElemento(new Snickers());
            super8.addElemento(new Super8());
        }
    }

    public Producto comprarProducto(Moneda m, PrecioProducto opcion)
            throws PagoInsuficienteException, PagoIncorrectoException, NoHayProductoException {
        {
            if (m == null) {
                throw new PagoIncorrectoException();
            }
            if (m.getValor() == 1500){
                monVu.addElemento(m);
                throw new PagoIncorrectoException();
            }
            if (m.getValor() < opcion.getPrecioProducto()) {
                monVu.addElemento(m);
                throw new PagoInsuficienteException();
            }

            int numVueltoMonedas100 = (m.getValor() - opcion.getPrecioProducto()) / 100;
            Producto aux = null;
            switch (opcion) {
                case COCA:
                    aux = coca.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++){
                        monVu.addElemento(new Moneda100());
                    }
                    break;
                case SPRITE:
                    aux = sprite.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++){
                        monVu.addElemento(new Moneda100());
                    }
                    break;
                case FANTA:
                    aux = fanta.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++){
                        monVu.addElemento(new Moneda100());
                    }
                    break;
                case SNICKERS:
                    aux = snickers.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++){
                        monVu.addElemento(new Moneda100());
                    }
                    break;
                case SUPER8:
                    aux = super8.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++){
                        monVu.addElemento(new Moneda100());
                    }
                    break;
                default:
                    monVu.addElemento(m);
                    throw new NoHayProductoException();
            }
            if (aux == null){
                monVu.addElemento(m);
                throw new NoHayProductoException();
            } else {
                return aux;
            }
        }
    }

    public Moneda getVuelto() {
        return monVu.getElemento();
    }
}