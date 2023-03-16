/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerciciosextras;

import java.util.Scanner;

/**
 Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class JavaEjerciciosExtras {

    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   int min, horas, dias, aux, aux1;
   horas=0;
   dias=0;
   aux=0;
   aux1=0;
        System.out.println("Ingrese el tiempo que quiera pasar a días y horas en minutos");
        min = leer.nextInt();
        horas = min/60;
        dias = horas/24;
        aux= horas-(dias*24);
        System.out.println(+min+" es un total de " +dias+" día/s y de "+aux+ " hora/s");
        
   
        
    }
    
}
