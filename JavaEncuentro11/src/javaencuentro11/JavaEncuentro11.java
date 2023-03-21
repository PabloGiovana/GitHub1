/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencuentro11;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class JavaEncuentro11 {

    /**
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia
     * entre los elementos).
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la dimensión de los vectores: ");
        int n = input.nextInt();
        
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        
        System.out.println("Ingrese los elementos del vector v1:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            v1[i] = input.nextInt();
        }
        
        System.out.println("Ingrese los elementos del vector v2:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            v2[i] = input.nextInt();
        }
        
        boolean sonIguales = true;
        for (int i = 0; i < n; i++) {
            if (v1[i] != v2[i]) {
                sonIguales = false;
                break;
            }
        }
        
        if (sonIguales) {
            System.out.println("Los vectores v1 y v2 son iguales.");
        } else {
            System.out.println("Los vectores v1 y v2 no son iguales.");
        }
    }
}
}