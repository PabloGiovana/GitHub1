
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * En este caso la matriz es antisimétrica. Un cuadrado mágico 3 x 3 es una
 * matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus
 * columnas y sus diagonales son idénticas. Crear un programa que permita
 * introducir un cuadrado por teclado y determine si este cuadrado es mágico o
 * no. El programa deberá comprobar que los números introducidos son correctos,
 * es decir, están entre el 1 y el 9.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                System.out.println("Ingrese un número del 1-9");
                matriz[i][j] = scanner.nextInt();
                } while (matriz[i][j] > 9 || matriz[i][j] < 1);
            }
        }
  // calculate row sums
    boolean isValid = true;
    for (int i = 0; i < 3; i++) {
        int rowSum = 0;
        for (int j = 0; j < 3; j++) {
            rowSum += matriz[i][j];
        }
        System.out.println("Suma de la fila " + (i+1) + ": " + rowSum);
        if (rowSum != 15) {
            isValid = false;
        }
    }
    
    // calculate column sums
    for (int j = 0; j < 3; j++) {
        int colSum = 0;
        for (int i = 0; i < 3; i++) {
            colSum += matriz[i][j];
        }
        System.out.println("Suma de la columna " + (j+1) + ": " + colSum);
        if (colSum != 15) {
            isValid = false;
        }
    }
    
    // calculate diagonal sums
    int diagonal1Sum = 0;
    int diagonal2Sum = 0;
    for (int i = 0; i < 3; i++) {
        diagonal1Sum += matriz[i][i];
        diagonal2Sum += matriz[i][2-i];
    }
    System.out.println("Suma de la diagonal 1: " + diagonal1Sum);
    if (diagonal1Sum != 15) {
        isValid = false;
    }
    System.out.println("Suma de la diagonal 2: " + diagonal2Sum);
    if (diagonal2Sum != 15) {
        isValid = false;
    }
    
    // check if all sums are valid
    if (isValid) {
        System.out.println("Es un cubo mágico");
    } else {
        System.out.println("No es un cubo mágico");
    }
}

}


