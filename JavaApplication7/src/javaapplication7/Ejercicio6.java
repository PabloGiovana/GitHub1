/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
* El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
* El programa deberá ejecutarse hasta que se elija la opción 5. 
* Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
* ¿Está seguro que desea salir del programa (S/N)? 
* Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class Ejercicio6 {
                 public static void main(String[] args) {
                     Scanner leer = new Scanner(System.in);
                    
                     System.out.println("Ingrese dos números positivos");
                     int num1 = leer.nextInt();
                     int num2 = leer.nextInt();
                     double op=0;
                     String respuesta;
                 
   
                  int opcion =0;
                  do {
                 System.out.println("1: Sumar");
                  System.out.println("2: Restar");
                  System.out.println("3: Dividir");
                  System.out.println("4: Multiplicar");
                  System.out.println("5: Salir");
                  opcion = leer.nextInt();
                     switch (opcion) {
                         case 1:
                             op = num1+num2;
                             System.out.println("El resultado de la suma es "+op);
                             
                          break;

                         case 2:
                             op = num1-num2;
                             System.out.println("El resultado de la resta es "+op);
                             break;
                             
                         case 3:
                             op= num1/num2;
                             System.out.println("El resultado de la division es "+op);
                             break;
                         case 4:
                             op= num1*num2;
                             System.out.println("El resultado de la multiplicacion es "+op);
                             break;
                         
                         case 5:
                             Scanner resp = new Scanner(System.in);
                             System.out.println("Desea salir?Si/No(S/N)");
                             respuesta = resp.nextLine();
                             switch (respuesta) {
                                 case "S":
                                     System.exit(0);
                                 case "N":
                                 
                                 
                             }
                            /* System.out.println("¿Desea salir? Si/No(S/N)");
                             respuesta = leer.nextLine();
                             if (respuesta == "S") {
                             System.out.println("Gracias por usar el programa");
                             opcion=6;
                               }else{
                             }*/
                             break;
                             
                     }
                  } while (opcion !=6);

                             
                     
                     
                     
                     
                 }
}
