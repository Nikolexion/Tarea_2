import java.util.ArrayList;

class Deposito <T> {
    private ArrayList<T>  al;

    public Deposito() {
        al = new ArrayList();
    }

    public void addElemento(T elemento) {
        al.add(elemento);
    }

    public T getElemento() {
        if (al.size() == 0) {
            return null;
        } else {
            return al.remove(0);
        }
    }
}
