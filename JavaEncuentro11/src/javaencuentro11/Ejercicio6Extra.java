/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencuentro11;

/**
 *
 * @author Pablo
 */
import java.util.*;

public class Ejercicio6Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
         System.out.println("Ingrese una palabra entre 3 y 5 letras");
         String palabras = scanner.next();
         int tamPalabra = palabras.length();
            int cantPalabras = 0;
            cantPalabras++;
        do {
              System.out.println("Ingrese nuevamente la palabra");
              palabras = scanner.next();

        } while (tamPalabra < 3 && tamPalabra > 5 || cantPalabras < 6);
    }

}

}
