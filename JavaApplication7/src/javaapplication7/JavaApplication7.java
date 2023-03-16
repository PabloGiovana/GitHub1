/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class JavaApplication7 {

    /**
Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para verificar si es par");
        double num1 = leer.nextDouble();
        if (num1 % 2==0) {
            System.out.println("Su número es par");
        } else {
            System.out.println("Su número es impar");
        }
        
        
    }
    
}
