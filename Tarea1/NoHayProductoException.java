class NoHayProductoException extends Exception{
    /**
     * @param errorMessage Un mensaje especificando el problema
     */
    public NoHayProductoException(String errorMessage){
        super(errorMessage);
    }
}