import java.util.ArrayList;

class Deposito {
    private ArrayList<Bebida> al;

    public Deposito() {
        al = new ArrayList();
    }

    public void addBebida(Bebida bebida) {
        al.add(bebida);
    }

    public Bebida getBebida() {
        if (al.size() == 0) {
            return null;
        } else {
            return al.remove(0);
        }
    }
}
