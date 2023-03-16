/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerciciosguia4;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class JavaEjerciciosGuia4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase a convertir");
        frase=leer.nextLine();
        frase.equalsIgnoreCase(frase);
        String fraseC = conversion(frase);
        System.out.println("La frase convertida es "+fraseC);
        
    }

    public static String conversion(String frase) {
       String fraseC;
       String letra;
        String aux;
        aux=frase.substring(0);
        int largoFrase = frase.length();
        for (int i = 0; i == largoFrase; i++) {
            letra= aux

        switch (aux) {
            case "a": 
            fraseC = (fraseC.concat("@"));
 
            case "e":

            case "i":

            case "o":

            case "u":

        }
                }
        return fraseC;
    }
}
