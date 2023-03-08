/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio5 {

    /**
  Escribir un programa que lea un número entero por teclado y muestre por pantalla
  * el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
     */
           public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese un número entero");
          int numEntero = leer.nextInt();
         System.out.println("El doble de "+numEntero+ " es "+numEntero*2);
          System.out.println("El triple de "+numEntero+ " es "+numEntero*3);
       System.out.println("La raíz cuadrada de "+numEntero+ " es "+Math.sqrt(numEntero));


                            }

                        }
