package Ej3;


import java.util.*;
import java.util.Scanner;

public class Juego {

    private int num;
    private int intentosNecesarios;
    private int ganadosJugador1;
    private int ganadosJugador2;
    private int rachaJugador1;
    private int rachaJugador2;

    public Juego() {
    }

    public Juego(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIntentosNecesarios() {
        return intentosNecesarios;
    }

    public int getGanadosJugador1() {
        return ganadosJugador1;
    }

    public int getGanadosJugador2() {
        return ganadosJugador2;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1: Ingrese el número oculto");
        this.num = leer.nextInt();
        System.out.println("Jugador 2: Adivine el número oculto, recuerda que solo tienes 5 intentos");
        int num2 = leer.nextInt();
        int intentos = 1;
        int prueba = 3;

        if (num == num2) {
            System.out.println("Acertaste, el número oculto era " + num);
            ganadosJugador2++;
            rachaJugador2++;
            rachaJugador1 = 0;
            System.out.println("Intentos utilizados: " + intentos);
        } else {
            while (num != num2 && intentos <= 5) {
                System.out.println("Jugador 2: Error, intenta de nuevo");
                num2 = leer.nextInt();
                if (num == num2) {
                    System.out.println("Acertaste, el número oculto era " + num);
                    ganadosJugador2++;
                    rachaJugador2++;
                    rachaJugador1 = 0;
                    System.out.println("Intentos utilizados: " + intentos);
                } else {
                    System.out.println("Intentos restantes: " + prueba--);
                    intentos++;
                }
            }
        }

        if (intentos > 5) {
            System.out.println("Agotaste tus intentos, el número oculto era " + num);
            rachaJugador1++;
            rachaJugador2 = 0;
        } else {
            intentosNecesarios += intentos;
            ganadosJugador1++;
            rachaJugador1++;
            rachaJugador2 = 0;
        }

    }
}