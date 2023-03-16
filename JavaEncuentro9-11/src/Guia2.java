
import java.util.Scanner;

/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.
 */

/**
 *
 * @author Pablo
 */
public class Guia2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
            
        }
             for (int i = 99; i >= 0; i--) {
            System.out.println("["+ vector[i]+ "]");
        }
    
            
    }
}
