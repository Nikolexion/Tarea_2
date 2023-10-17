public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5,1000,5,500);
        Moneda m = null;
        Comprador c=null;

        //-----Producto que NO vende-----
        System.out.println("---------Producto que NO vende---------");
        m = new Moneda1000();
        c = new Comprador(m,664,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1000
        m = new Moneda1000();
        c = new Comprador(m,104,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1000
        m = new Moneda1000();
        c = new Comprador(m,554,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1000
        m = new Moneda1000();
        c = new Comprador(m,662,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1000
        m = new Moneda1000();
        c = new Comprador(m,0,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1000

        //-----trata de comprar SIN Moneda-----
        System.out.println("---------trata de comprar SIN Moneda---------");
        m = null;
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0

        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0

        c = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0

        c = new Comprador(m,Expendedor.SNIKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0

        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $0

        //-----con dinero JUSTO para el precio-----
        System.out.println("---------con dinero JUSTO para el precio---------");
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// sprite $0
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// fanta $0
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SNIKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// snikers $0
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// super8 $0

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
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $100
        m = new Moneda100();
        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $100

        //----------------------------------------con MAS dinero que el precio------------------------------------------

        System.out.println("---------con MAS dinero que el precio---------");
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// cocacola $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// fanta $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SNIKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// snikers 1000
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// super8 1000

        //-------------------------------------------Deposito VACIO-----------------------------------------------------

        System.out.println("---------Deposito VACIO---------");
        Expendedor exp1 = new Expendedor(0,1000,0,500);
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.COCA,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.FANTA,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SNIKERS,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SUPER8,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // null $1500

    }
}
