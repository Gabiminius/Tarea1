class PagoIncorrectoException extends Exception{
    /**
     * @param errorMessage Un mensaje especificando el problema
     */
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}
