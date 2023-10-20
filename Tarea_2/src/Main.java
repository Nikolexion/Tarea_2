import java.util.function.Predicate;

public class Main {
    public static void main(String[] args)
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(6);
        Moneda m = null;
        Comprador c=null;
        try {
            c = new Comprador(m,PrecioProducto.COCA,exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        } catch (PagoIncorrectoException exception) {
            System.out.println("La moneda es invalida");
        }

        //----------------------------------------trata de comprar SIN Moneda-------------------------------------------
        /*
        System.out.println("---------trata de comprar SIN Moneda---------");
        m = null;
        c = new Comprador(m,PrecioProducto.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" PagoIncorrectoException

        c = new Comprador(m,PrecioProducto.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" PagoIncorrectoException

        c = new Comprador(m,PrecioProducto.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" PagoIncorrectoException

        c = new Comprador(m,PrecioProducto.SNICKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" PagoIncorrectoException

        c = new Comprador(m,PrecioProducto.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" PagoIncorrectoException

        */

        //---------------------------------------con dinero JUSTO para el precio----------------------------------------

        System.out.println("---------con dinero JUSTO para el precio---------");
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// sprite $0
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// fanta $0
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.SNICKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// snikers $0
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// super8 $0

        //----------------------------------------con MENOS dinero que el precio----------------------------------------
        /*
        System.out.println("---------con MENOS dinero que el precio---------");
        m = new Moneda500();
        c = new Comprador(m,PrecioProducto.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// Exception in thread "main" PagoInsuficienteException
        m = new Moneda500();
        c = new Comprador(m,PrecioProducto.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// Exception in thread "main" PagoInsuficienteException
        m = new Moneda500();
        c = new Comprador(m,PrecioProducto.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// Exception in thread "main" PagoInsuficienteException
        m = new Moneda100();
        c = new Comprador(m,PrecioProducto.SNICKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// Exception in thread "main" PagoInsuficienteException
        m = new Moneda100();
        c = new Comprador(m,PrecioProducto.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// Exception in thread "main" PagoInsuficienteException

         */

        //----------------------------------------con MAS dinero que el precio------------------------------------------

        System.out.println("---------con MAS dinero que el precio---------");
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// sprite $100
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.FANTA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// fanta $200
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.SNICKERS,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// snikers $300
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());// super8 $400

        //-------------------------------------------Deposito VACIO-----------------------------------------------------

        System.out.println("---------Deposito VACIO---------");
        Expendedor exp1 = new Expendedor(0);
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.COCA,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" NoHayProductoException
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.SPRITE,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" NoHayProductoException
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.FANTA,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" NoHayProductoException
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.SNICKERS,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" NoHayProductoException
        m = new Moneda1000();
        c = new Comprador(m,PrecioProducto.SUPER8,exp1);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto()); // Exception in thread "main" NoHayProductoException

        //-------------------------------------------Prueba de Moneda---------------------------------------------------

        System.out.println("---------Prueba de Moneda compareTo---------");
        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda m4 = new Moneda1500();
        Moneda m5 = new Moneda1500();
        System.out.println("Siendo 1 = mayor; 0 = igual; -1 = menor");
        System.out.println("Moneda 500, Moneda 100" + ": " +m2.compareTo(m1)); // 1
        System.out.println("Moneda 1500, Moneda 1500" + ": " +m4.compareTo(m5)); // 0
        System.out.println("Moneda 100, Moneda 500" + ": " +m1.compareTo(m2)); // -1

        System.out.println("---------Prueba de Moneda toString---------");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println(m4.toString());
    }
}
