package Entidades;

public class Cafetera {

    int capacidadMáxima;
    int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMáxima, int cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

}
