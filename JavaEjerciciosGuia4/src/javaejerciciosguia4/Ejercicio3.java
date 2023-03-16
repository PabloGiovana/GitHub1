/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerciciosguia4;

import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
public class Ejercicio3 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         Scanner leerM = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de euros a cambiar");
         double euroCant = leer.nextDouble();
         System.out.println("Ingrese la divisa a cambiar");
         String moneda = leerM.nextLine();
         cambioDiv(euroCant, moneda);
         
         
     }
     public static void cambioDiv(double euroCant, String moneda){
         double libra, dolar, yen;
         if (moneda.equalsIgnoreCase("Libra")) {
             libra=(euroCant*0.86);  
             System.out.println("El cambio de " +euroCant+ " euros da un total de "+libra+" libras");
         }
                  if (moneda.equalsIgnoreCase("Dolar")) {
             dolar=(euroCant*1.28611);  
             System.out.println("El cambio de " +euroCant+ " euros da un total de "+dolar+" dolares");
         }
                  if (moneda.equalsIgnoreCase("Yen")) {
             yen=(euroCant*129.852);  
             System.out.println("El cambio de " +euroCant+ " euros da un total de "+yen+" yenes");
         }
         
         
         
         
     }
     
}
