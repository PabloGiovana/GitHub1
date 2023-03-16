/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerciciosguia4;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Ejercicio4 {
         public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
             int num;
             System.out.println("Ingrese un número");
             num = leer.nextInt();
             if (primo(num)) {
                 System.out.println("El número es primo");
                 
             }else{
                 System.out.println("El número no es primo");
             }
             
             
             
         }
         public static boolean primo(int num){
             for (int i = 2; i < num; i++) {
                 if (num % i == 0) {
                     return false;
                 } 
         }
              return true;
}
}
