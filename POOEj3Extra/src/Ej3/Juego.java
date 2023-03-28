package Ej3;


import java.util.*;
public class Juego {

    private int num;

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

   public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1 : Ingrese el numero oculto");
        this.num = leer.nextInt();
        System.out.println("Jugador 2 : Adivine el numero oculto, recorda que solo tenes 5 intentos");
        int num2 = leer.nextInt();
        int intentos = 1;
        int prueba =3;

        if (num == num2) {
            System.out.println("Acertaste, el numero oculto era " + num);
        } else {
            while (num != num2 && intentos <= 5) {

                System.out.println("Jugador 2 : Error, intente de nuevo");
                num2 = leer.nextInt();
                if (num == num2) {
                    System.out.println("Acertaste, el numero oculto era " + num);

                }
                System.out.println("Intentos restantes" +prueba--);
               intentos++;

            }

           
        }

        }

    }
