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
public class Ejercicio4Extra {
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
        // Crear la matriz de notas
        double[][] notas = new double[10][4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }
        
        // Calcular el promedio de cada alumno y almacenarlo en un arreglo
        double[] promedios = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            double promedio = (notas[i][0]*0.1 + notas[i][1]*0.15 + notas[i][2]*0.25 + notas[i][3]*0.5) / 1;
            promedios[i] = promedio;
        }
        
        // Contar la cantidad de aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;
        for (double promedio : promedios) {
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        // Mostrar los resultados por pantalla
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
        
        sc.close();
    }
}

