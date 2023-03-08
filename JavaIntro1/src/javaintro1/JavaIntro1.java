/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro1;

import java.util.Scanner;

/**
 * @author Pablo
 */
public class JavaIntro1 {

 public static void main(String[] args) {
/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma */
int num1;
int num2;
int suma;
Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese dos números");
     num1 = leer.nextInt();
     num2 = leer.nextInt();
suma = num1+num2;
     System.out.println("El resultado de " +num1+ " más el número " +num2+ " es " +suma);
 

     
 }
}
