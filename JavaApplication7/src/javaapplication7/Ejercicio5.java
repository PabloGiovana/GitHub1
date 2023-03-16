/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
Escriba un programa en el cual se ingrese un valor límite positivo,
* y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class Ejercicio5 {
             public static void main(String[] args) {
                 Scanner leer = new Scanner(System.in);
                 System.out.println("Ingrese el valor límite");
                 int limite = leer.nextInt();
                 int num, suma;
                 suma=0;
            do {
                System.out.println("Ingrese un número, dejara de pedir cuando supere el limite");
                num = leer.nextInt();
                suma = suma + num;
            } while (limite > suma);                 
             }
    
}
