
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerB = new Scanner(System.in);
        System.out.println("De cuánto desea que sea el tamaño de su vector");
        int num = leer.nextInt();
        int numB;
        int cont = 0;
        int index = -1;

        int[] vector = new int[num];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;

        }
        System.out.println("Ingrese un número a buscar");
        numB = leerB.nextInt();
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
            if (vector[i] == numB) {
            indices.add(i);
            cont++;
            }
        }

        if (indices.isEmpty()) {
            System.out.println("El número " + numB + " no se encontró en el vector.");
        } else {
            System.out.println("El número " + numB + " se encontró en las posiciones: " + indices);
        }
        System.out.println("El número se repitió " + cont + " veces");

    }

}
}
