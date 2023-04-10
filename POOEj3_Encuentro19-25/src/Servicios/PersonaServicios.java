package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();

        System.out.print("Ingrese su nombre: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese su edad: ");
        p1.setEdad(leer.nextInt());
        System.out.print("Ingrese su sexo(H = Hombre, M = Mujer, O = Otro): ");
        p1.setSexo(leer.next());

        if (!p1.getSexo().equalsIgnoreCase("H") && !p1.getSexo().equalsIgnoreCase("M") && !p1.getSexo().equalsIgnoreCase("O")) {
            do {
                System.out.print("Ingrese alguna de las opciones indicadas anteriormente: ");
                p1.setSexo(leer.nextLine());
            } while (!p1.getSexo().equalsIgnoreCase("H") && !p1.getSexo().equalsIgnoreCase("M") && !p1.getSexo().equalsIgnoreCase("O"));
        }
        System.out.print("Ingrese su peso:KG ");
        p1.setPeso(leer.nextDouble());
        System.out.print("Ingrese su altura:MTS ");
        p1.setAltura(leer.nextDouble());
        return p1;

    }

    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorDeEdad(Persona p1) {
        if (p1.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        }
        return false;
    }

    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
     */
    public float calcularIMC(Persona p1) {
        double pesoIdeal = (p1.getPeso() / (p1.getAltura() * p1.getAltura()));
        if (pesoIdeal < 20) {
            System.out.println("Esta por debajo de su peso ideal");
            return -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            System.out.println("Se encuentra en su peso ideal");
            return 0;

        } else {
            System.out.println("Esta por encima de su peso ideal");
            return 1;
        }
    }

}
