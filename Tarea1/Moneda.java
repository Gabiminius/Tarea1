package Tarea1;

public abstract class Moneda implements Comparable<Moneda> {
    public Moneda(){

    }
    public abstract int getValor();

    @Override
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }
}

