/**
 *Clase de Testing para evaluar unitariamente a la clase Comprador y sus métodos en todos los casos.
 * @author lulunkaii
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {
    //-----------------------------------------Compras con dinero suficiente--------------------------------------------

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente la bebida Cocacola y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraCocaDineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.COCA, exp);
        assertEquals("cocacola", comprador.queBebiste());
        assertEquals(100, comprador.cuantoVuelto());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente la bebida Sprite y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraSpriteDineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.SPRITE, exp);
        assertEquals("sprite", comprador.queBebiste());
        assertEquals(200, comprador.cuantoVuelto());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente la bebida Fanta y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraFantaDineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.FANTA, exp);
        assertEquals("fanta", comprador.queBebiste());
        assertEquals(300, comprador.cuantoVuelto());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente el dulce Snickers y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraSnickersDineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.SNICKERS, exp);
        assertEquals("snickers", comprador.queBebiste());
        assertEquals(400, comprador.cuantoVuelto());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente el dulce Super8 y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraSuper8DineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.SUPER8, exp);
        assertEquals("super8", comprador.queBebiste());
        assertEquals(500, comprador.cuantoVuelto());
    }

    //----------------------------------------Compras con dinero insuficiente-------------------------------------------

    /**
     * Test para evaluar primero si se da correctamente PagoInsuficienteException, luego dado tener dinero insuficiente,
     * no retorne CocaCola y devuelva la moneda
     */
    @Test
    public void testCompraCocaDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(6);
            Moneda m = new Moneda100();
            Comprador comprador = new Comprador(m, PrecioProducto.COCA, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente PagoInsuficienteException, luego dado tener dinero insuficiente,
     * no retorne Sprite y devuelva la moneda
     */
    @Test
    public void testCompraSpriteDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(6);
            Moneda m = new Moneda100();
            Comprador comprador = new Comprador(m, PrecioProducto.SPRITE, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente PagoInsuficienteException, luego dado tener dinero insuficiente,
     * no retorne Fanta y devuelva la moneda
     */
    @Test
    public void testCompraFantaDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(6);
            Moneda m = new Moneda100();
            Comprador comprador = new Comprador(m, PrecioProducto.FANTA, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente PagoInsuficienteException, luego dado tener dinero insuficiente,
     * no retorne Snickers y devuelva la moneda
     */
    @Test
    public void testCompraSnickersDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(6);
            Moneda m = new Moneda100();
            Comprador comprador = new Comprador(m, PrecioProducto.SNICKERS, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente PagoInsuficienteException, luego dado tener dinero insuficiente,
     * no retorne Super8 y devuelva la moneda
     */
    @Test
    public void testCompraSuper8DineroInsuficiente(){
    assertThrows(PagoInsuficienteException.class, () -> {
        Expendedor exp = new Expendedor(6);
        Moneda m = new Moneda100();
        Comprador comprador = new Comprador(m, PrecioProducto.SUPER8, exp);
        assertEquals(null,comprador.queBebiste());
        assertEquals(1000,comprador.cuantoVuelto());
    });
}

    //------------------------------------------Compras con moneda inválida---------------------------------------------

    /**
     * Test para evaluar primero si se da correctamente PagoIncorrectoException, luego dado pagar con una moneda
     * inválida, no retorne CocaCola y devuelva la moneda
     */
    @Test
    public void testCompraCocaMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = null;
            Comprador comprador = new Comprador(m, PrecioProducto.COCA, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente PagoIncorrectoException, luego dado pagar con una moneda
     * inválida, no retorne Sprite y devuelva la moneda
     */
    @Test
    public void testCompraSpriteMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda1500();
            Comprador comprador = new Comprador(m, PrecioProducto.SPRITE, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente PagoIncorrectoException, luego dado pagar con una moneda
     * inválida, no retorne Fanta y devuelva la moneda
     */
    @Test
    public void testCompraFantaMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = null;
            Comprador comprador = new Comprador(m, PrecioProducto.FANTA, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente PagoIncorrectoException, luego dado pagar con una moneda
     * inválida, no retorne Snickers y devuelva la moneda
     */
    @Test
    public void testCompraSnickersMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda1500();
            Comprador comprador = new Comprador(m, PrecioProducto.SNICKERS, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente PagoIncorrectoException, luego dado pagar con una moneda
     * inválida, no retorne Super8 y devuelva la moneda
     */
    @Test
    public void testCompraSuper8MonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = null;
            Comprador comprador = new Comprador(m, PrecioProducto.SUPER8, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    //------------------------------------------Compras con depósito vacío----------------------------------------------

    /**
     * Test para evaluar primero si se da correctamente NoHayProductoException, luego dado pagar con una moneda
     * válida, no retorne CocaCola y devuelva la moneda
     */
    @Test
    public void testCompraCocaConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.COCA, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente NoHayProductoException, luego dado pagar con una moneda
     * válida, no retorne Sprite y devuelva la moneda
     */
    @Test
    public void testCompraSpriteConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.SPRITE, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente NoHayProductoException, luego dado pagar con una moneda
     * válida, no retorne Fanta y devuelva la moneda
     */
    @Test
    public void testCompraFantaConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.FANTA, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente NoHayProductoException, luego dado pagar con una moneda
     * válida, no retorne Snickers y devuelva la moneda
     */
    @Test
    public void testCompraSnickersConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.SNICKERS, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }

    /**
     * Test para evaluar primero si se da correctamente NoHayProductoException, luego dado pagar con una moneda
     * válida, no retorne Super8 y devuelva la moneda
     */
    @Test
    public void testCompraSuper8ConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.SUPER8, exp);
            assertEquals(null,comprador.queBebiste());
            assertEquals(1000,comprador.cuantoVuelto());
        });
    }
}
