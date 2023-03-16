/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
* Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
* en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class Ejercicio4 {
         public static void main(String[] args) {
             String letra;
             Scanner leer = new Scanner(System.in);
             System.out.println("Ingrese una frase");
             String frase = leer.nextLine();
        letra= frase.substring(0,1);        
        if (letra.equals("a")==true) {
            System.out.println("correcto");
        }else {
            System.out.println("Incorrecto");
        }
             
             
         }
}
