package Tarea1; /**
 * @author Gabriela Escalona
 * @author Valentina Serón
 * @version version 2, 03 de octubre 2024
 * */


class Comprador {
    private String sonido;
    private int vuelto = 0;

    /**
     * Comprador representará a un comprador que cuenta con una moneda para pagar, una  elección de producto y un expendedor donde realizará su compra
     * @param m Es la moneda ingresada
     * @param cualProducto Se usa para la elección del producto deseado, 1 para cocacola, 2 para sprite, 3 para fanta, 4 para snickers y 5 para super8
     * @param exp Es el expendedor donde se realizará compra.
     * @throws NoHayProductoException En caso que no haya stock o que el producto no exista.
     * @throws PagoInsuficienteException En caso que la moneda sea insuficiente para pagar el producto deseado.
     * @throws PagoIncorrectoException En caso que la moneda no se haya instanciado correctamente.
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Producto b1 = exp.comprarProducto(m, cualProducto);
        /**
         * Este ciclo se utilizará para que el comprador pueda retirar su vuelto
         */
        while (true) {
            Moneda a = exp.getVuelto();
            if (a == null) {
                break;
            } else {
                vuelto += a.getValor();
            }
        }

        if (b1 != null) {
            sonido = b1.consumir();
        }else{
            sonido = null;
        }
    }

    /**
     *
     * @return Retorna el vuelto correspondiente a la compra efectuada
     */
    public int cuantoVuelto(){
        return vuelto;
    }

    /**
     *
     * @return Hace saber cuál producto ha comprado el comprador
     */
    public String queConsumiste(){
        return sonido;
    }

}

