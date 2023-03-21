import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Realice un programa que compruebe si una matriz dada es antisimétrica. 
 Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
 Es decir, A es antisimétrica si A = -AT. 
 La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio5 {
public static void main(String[] args) {
    int matriz[][] = {{0, 2, -3}, {-2, 0, 4}, {3, -4, 0}};
    
    // verificar si la matriz es cuadrada
    int filas = matriz.length;
    int columnas = matriz[0].length;
    if (filas != columnas) {
        System.out.println("La matriz no es cuadrada.");
        return;
    }
    
    // verificar si la matriz es antisimétrica
    boolean esAntisimetrica = true;
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            if (matriz[i][j] != -matriz[j][i]) {
                esAntisimetrica = false;
                break;
            }
        }
        if (!esAntisimetrica) {
            break;
        }
    }
    
    if (esAntisimetrica) {
        System.out.println("La matriz es antisimétrica.");
    } else {
        System.out.println("La matriz no es antisimétrica.");
    }
}
}