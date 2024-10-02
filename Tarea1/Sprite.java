package Tarea1;

public class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }

    @Override
    public String consumir() {
        return "glupglup Sprite";
    }
}
