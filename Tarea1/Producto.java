package Tarea1;

public abstract class Producto {
    //Los productos solos se les entregara serie pq el precio estara en los enum
    protected int serie;
    public Producto(int serie){
        this.serie=serie;
    }
    //getter de serie
    public int getSerie(){
        return serie;
    }
    //este metodo se debe implementar segun si es bebida o dulce (es como el beber() del pa3p)
    public abstract String consumir();


}
