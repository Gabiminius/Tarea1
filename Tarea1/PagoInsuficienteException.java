class PagoInsuficienteException extends Exception{
    /**
     * @param errorMessage Un mensaje especificando el problema
     */
    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}