import java.util.ArrayList;

class Deposito {
    private ArrayList<Producto> al;

    public Deposito() {
        al = new ArrayList();
    }

    public void addProducto(Producto producto) {
        al.add(producto);
    }

    public Producto getProducto() {
        if (al.size() == 0) {
            return null;
        } else {
            return al.remove(0);
        }
    }
}
