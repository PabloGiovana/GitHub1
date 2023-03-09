/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Scanner;

/**
Escriba un programa que lea 20 números. 
* Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
* El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
* Nota: recordar el uso de la sentencia break.
 */
public class Ejercicio9 {
    
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i=0;
        int num;
        int suma=0;
        do {
            System.out.println("Ingrese 20 números");
            num = leer.nextInt();
            i++;
            if (num > 0) {
            suma = num+suma;
            continue;
            }
            if (num == 0){
                System.out.println("Se capturó el número 0");
                break;
            }
        } while(i!=20);
        System.out.println("La suma de los números positivos es "+suma);
    }   
}
