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
public class Ejercicio2 {
        public static void main(String[] args) {
            
            persona();
            
        }
        
        public static void persona(){
            Scanner leer = new Scanner(System.in);
            Scanner rta = new Scanner(System.in);
            Scanner leerN = new Scanner(System.in);
            String respuesta;
            do {
            System.out.println("Ingrese nombre");
            String nombre=leerN.nextLine();
            System.out.println("Ingrese edad");
            int edad = leer.nextInt();
            System.out.println("Nombre: "+nombre+" Edad: "+edad);
            if (edad>=18){
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("No es mayor de edad");
            }
            System.out.println("¿Quiere seguir viendo personas?");
            respuesta=rta.nextLine();
            
            } while (!respuesta.equalsIgnoreCase("No"));
         
        }
}
