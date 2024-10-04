package Tarea1; /**
 * @author Gabriela Escalona
 * @author Valentina Serón
 * @version version 2, 03 de octubre 2024
 * */


class Expendedor {

    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Moneda> coin;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;


    public Expendedor(int numProductos){
        fanta = new Deposito<Producto>();
        coca = new Deposito<Producto>();
        sprite = new Deposito<Producto>();
        coin = new Deposito<Moneda>();
        snickers = new Deposito<Producto>();
        super8 = new Deposito<Producto>();

        for(int i = 0; i < numProductos; i++){
            Bebida b1 = new Cocacola(100+i);
            Bebida b2 = new Sprite(200+i);
            Bebida b3 = new Fanta(300+i);
            Dulce d1 = new Snickers(400+i);
            Dulce d2 = new Super8(500+i);

            coca.addProducto(b1);
            sprite.addProducto(b2);
            fanta.addProducto(b3);
            snickers.addProducto(d1);
            super8.addProducto(d2);
        }
    }

    public Producto comprarProducto(Moneda m, int cual) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        Producto b = null;
        if (m == null){
            throw new PagoIncorrectoException("Debe instanciar en algun valor la moneda (moneda null).\n");
        } else {
            Seleccionador producto = Seleccionador.fromPosicion(cual);
            if(producto == null){
                coin.addProducto(m);
                throw new NoHayProductoException("No hay producto en el depósito.\n");
            }else {
                switch (producto) {
                    /**
                     * En caso que el producto seleccionado sea una cocacola, primero se validará que la cantidad de dinero sea suficiente para pagar el
                     * producto, luego se verificará que exista stock del mismo. Una vez pasados estos filtros se calcula el vuelto en monedas de a 100 y se
                     * llena el depósito de vuelto con la cantidad necesaria, y finalmente se entrega la cocacola. Esto es análogo para los demás productos
                     */
                    case COCACOLA:
                        if (producto.COCACOLA.getPrecio() > m.getValor()) {
                            coin.addProducto(m);
                            throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                        } else if (producto.COCACOLA.getPrecio() == m.getValor()) {
                            b = coca.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            return b;
                        } else {
                            b = coca.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            int n = (m.getValor() - producto.getPrecio()) / 100;
                            for (int i = 0; i < n; i++) {
                                coin.addProducto((new Moneda100()));
                            }
                            return b;
                        }
                    case SPRITE:
                        if (producto.SPRITE.getPrecio() > m.getValor()) {
                            coin.addProducto(m);
                            throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                        } else if (Seleccionador.SPRITE.getPrecio() == m.getValor()) {
                            b = sprite.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            return b;
                        } else {
                            b = sprite.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            int n = (m.getValor() - producto.getPrecio()) / 100;
                            for (int i = 0; i < n; i++) {
                                coin.addProducto(new Moneda100());
                            }
                            return b;
                        }
                    case FANTA:
                        if (producto.FANTA.getPrecio() > m.getValor()) {
                            coin.addProducto(m);
                            throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                        } else if (producto.FANTA.getPrecio() == m.getValor()) {
                            b = fanta.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            return b;
                        } else {
                            b = fanta.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            int n = (m.getValor() - producto.getPrecio()) / 100;
                            for (int i = 0; i < n; i++) {
                                coin.addProducto(new Moneda100());
                            }
                            return b;
                        }
                    case SNICKERS:
                        if (producto.SNICKERS.getPrecio() > m.getValor()) {
                            coin.addProducto(m);
                            throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                        } else if (producto.SNICKERS.getPrecio() == m.getValor()) {
                            b = snickers.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            return b;
                        } else {
                            b = snickers.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            int n = (m.getValor() - producto.getPrecio()) / 100;
                            for (int i = 0; i < n; i++) {
                                coin.addProducto(new Moneda100());
                            }
                            return b;
                        }
                    case SUPER8:
                        if (producto.SUPER8.getPrecio() > m.getValor()) {
                            coin.addProducto(m);
                            throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                        } else if (producto.SUPER8.getPrecio() == m.getValor()) {
                            b = super8.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            return b;
                        } else {
                            b = super8.getProducto();
                            if (b == null) {
                                coin.addProducto(m);
                                throw new NoHayProductoException("No hay producto en el deposito.\n");
                            }
                            int n = (m.getValor() - producto.getPrecio()) / 100;
                            for (int i = 0; i < n; i++) {
                                coin.addProducto(new Moneda100());
                            }
                            return b;
                        }
                }
            }
        }
        return b;
    }
    /**
     * @return retorna una moneda del deposito de monedas.
     */
    public Moneda getVuelto(){
        Moneda m = coin.getProducto();
        return m;
    }
}

