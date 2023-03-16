/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import static java.util.Objects.equals;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correcta, incorrecta;
        correcta = 0;
        incorrecta = 0;
        String frase;
        int longitud;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        while (!frase.equals("&&&&&")) {
            longitud = frase.length();
            if (frase.substring(0,1).equalsIgnoreCase("x") && (frase.endsWith("o")) && (longitud == 5)) {
                    
                           correcta++;
           
        }else {
                incorrecta++;
                }
            
                    System.out.println("Ingrese una frase");
        frase = leer.nextLine();

        }

        System.out.println("La cantidad de lecturas correctas son " + correcta);
        System.out.println("La cantidad de lecturas incorrectas son " + incorrecta);
    }
}
