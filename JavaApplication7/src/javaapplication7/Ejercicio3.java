/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;
/**
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
* Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
* en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class Ejercicio3 {
      public static void main(String[] args) {
          int cantLetras;
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese una frase de 8 carácteres de largo");
          String frase = leer.nextLine();
          cantLetras = frase.length();
          
          if ( cantLetras == 8){
              System.out.println("Correcto");
          
              
              
          } else {
              System.out.println("Incorrecto");
          }
     
          
          
          
      }


}