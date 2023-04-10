/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author Pablo
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego(); // Creamos un objeto de Juego

        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.println("¿Desea jugar? (s/n)");
            String respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }

            juego.iniciar_juego(); // Utilizamos el mismo objeto para todos los juegos
        }
            // Mostramos las rachas de cada jugador al final del programa
        System.out.println("Racha del jugador 1: " + juego.getGanadosJugador1());
        System.out.println("Racha del jugador 2: " + juego.getGanadosJugador2());
    }
}
