/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Ejercicio10 {
    
      public static void main(String[] args) {
          
         int num = 0;
             Scanner leer = new Scanner(System.in);
          for (int i = 0; i < 4; i++) {
              
              System.out.println("ingrese un numero entre 1 y 20");
              num = leer.nextInt();
                      
               System.out.print(num + " ");
              for (int j = 0; j < num; j++) {
      
                  System.out.print("*");
                  
              }
              System.out.println(" ");
          }
      }

}