package Tarea1;
//esta clase ya no es abstracta pq debe imple,entar consumir (lo mismo para Sprote y Fanta)
public class Cocacola extends Bebida {
    public Cocacola(int serie){
        super(serie);
    }

    @Override
    public String consumir() {
        return "glupglup Cocacola";
    }
}
