package Main;

import Entidades.Persona;
import Servicios.PersonaServicios;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonaServicios perServ = new PersonaServicios();

        Persona p1 = perServ.crearPersona();
        perServ.esMayorDeEdad(p1);
        perServ.calcularIMC(p1);

        Persona p2 = perServ.crearPersona();
        perServ.esMayorDeEdad(p2);
        perServ.calcularIMC(p2);

        Persona p3 = perServ.crearPersona();
        perServ.esMayorDeEdad(p3);
        perServ.calcularIMC(p3);

        Persona p4 = perServ.crearPersona();
        perServ.esMayorDeEdad(p4);
        perServ.calcularIMC(p4);

        boolean[] mayoresDeEdad = {perServ.esMayorDeEdad(p1), perServ.esMayorDeEdad(p2), perServ.esMayorDeEdad(p3), perServ.esMayorDeEdad(p4)};
        float[] resultadosIMC = {perServ.calcularIMC(p1), perServ.calcularIMC(p2), perServ.calcularIMC(p3), perServ.calcularIMC(p4)};
        // Calculamos el porcentaje de personas por debajo, en su peso ideal o por encima del peso ideal
        int debajo = 0;
        int pesoIdeal = 0;
        int encima = 0;

     for (float resultado : resultadosIMC) {
    if (resultado < 20) {
        debajo++;
    } else if (resultado > 20 && resultado <= 25) {
        pesoIdeal++;
    } else {
        encima++;
    }
}

double porcentajeDebajo = ((double) debajo / resultadosIMC.length) * 100;
double porcentajePesoIdeal = ((double) pesoIdeal / resultadosIMC.length) * 100;
double porcentajeEncima = ((double) encima / resultadosIMC.length) * 100;


        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + porcentajeDebajo + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas por encima de su peso ideal: " + porcentajeEncima + "%");

        // Calculamos el porcentaje de personas mayores y menores de edad
        int mayores = 0;
        int menores = 0;

        for (boolean mayorDeEdad : mayoresDeEdad) {
            if (mayorDeEdad) {
                mayores++;
            } else {
                menores++;
            }
        }

        double porcentajeMayores = ((double) mayores / mayoresDeEdad.length) * 100;
        double porcentajeMenores = ((double) menores / mayoresDeEdad.length) * 100;
        
        System.out.println("El porcentaje de personas mayores de edad es de "+porcentajeMayores);
          System.out.println("El porcentaje de personas mayores de edad es de "+porcentajeMenores);
        
    }
}


