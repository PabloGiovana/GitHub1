/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Scanner;

/**
Escriba un programa que valide si una nota está entre 0 y 10,
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
public class Ejercicio8 {
        public static void main(String[] args) {
            
    Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese su nota");
            int nota = leer.nextInt();

            while(nota < 0 || nota > 10){
            System.out.println("La nota ingresada es inválida, ingresela nuevamente");   
            nota=leer.nextInt();
            if (nota >0 && nota < 10){
                System.out.println("La nota es válida");
            }
            }    
        }
}
