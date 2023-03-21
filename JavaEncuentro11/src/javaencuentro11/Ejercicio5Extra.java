/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaencuentro11;

/**
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
import java.util.*;
public class Ejercicio5Extra {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de filas de la matriz: ");
    int n = scanner.nextInt();
    System.out.print("Ingrese la cantidad de columnas: ");
    int m = scanner.nextInt();
     int suma = 0;
int[][] matriz = new int[n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matriz[i][j] = (int)(Math.random()*1000)+1;
       
            suma += matriz[i][j];
        }
        
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print("["+ matriz[i][j] +"]");
            
        }
        System.out.println("");
    }
    System.out.println("La suma de sus elementos es " +suma);

}

}
