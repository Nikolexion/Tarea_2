public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2,1000,2,500);
        Moneda m = null;
        Comprador c=null;

        //-----Producto que NO vende-----
        System.out.println("---------Producto que NO vende---------");
        m = new Moneda1000();
        c = new Comprador(m,664,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500
        m = new Moneda1000();
        c = new Comprador(m,664,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500
        m = new Moneda1000();
        c = new Comprador(m,664,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500
        m = new Moneda1000();
        c = new Comprador(m,664,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500
        m = new Moneda1000();
        c = new Comprador(m,664,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500

        //-----trata de comprar SIN Moneda-----
        System.out.println("---------trata de comprar SIN Moneda---------");
        m = null;
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0
        m = null;
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0
        m = null;
        c = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0
        m = null;
        c = new Comprador(m,Expendedor.SNIKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0
        m = null;
        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0

        //-----con dinero JUSTO para el precio-----
        System.out.println("---------con dinero JUSTO para el precio---------");
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// cocacola $0
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SNIKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// cocacola $0
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// cocacola $0

        //-----con MENOS dinero que el precio-----
        System.out.println("---------con MENOS dinero que el precio---------");
        m = new Moneda500();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500
        m = new Moneda500();
        c = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500
        m = new Moneda100();
        c = new Comprador(m,Expendedor.SNIKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500
        m = new Moneda100();
        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $500

        // -----con MAS dinero que el precio-----
        System.out.println("---------con MAS dinero que el precio---------");
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SNIKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// sprite $500

        //-----Deposito VACIO-----
        System.out.println("---------Deposito VACIO---------");
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SNIKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500

    }
}
