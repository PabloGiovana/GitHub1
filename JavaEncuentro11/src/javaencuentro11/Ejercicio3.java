/*
Crear una función rellene un vector con números aleatorios,
pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */

package javaencuentro11;

/**
 *
 * @author Pablo
 */
import java.util.*;
public class Ejercicio3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el tamaño del vector: ");
    int num = scanner.nextInt();
    int[] vector1 = new int[num];
   
   rellenarVector(vector1);
mostrarVector(vector1);


}
public static void rellenarVector (int[] vector1) {
    for (int i = 0; i < vector1.length ; i++) {
        vector1[i] = (int)(Math.random()*200)+1;
        
        
    }
    }
    public static void mostrarVector (int[] vector1) {
    for (int i = 0; i < vector1.length ; i++) {
                  System.out.println("["+ vector1[i] +"]"); 
    }
    
    
}
}
        


