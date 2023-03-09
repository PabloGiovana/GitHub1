/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.encuentro4.ejercicico7.java;

import java.util.Scanner;


public class Guia3Encuentro4Ejercicico7Java {

   
    public static void main(String[] args) {
         Scanner tipoMotor = new Scanner(System.in); 
        int numero;
        
        System.out.println("ingrese un valor entre 1 y 4");
        numero=tipoMotor.nextInt();
      
        switch (numero) {
        
        case 1:
        System.out.println( "La bomba es una bomba de agua");
        break;
        
        case 2:
        System.out.println("La bomba es una bomba de gasolina");
        break;
        
        case 3:
        System.out.println( "La bomba es un hormigon");
        break;
        
        case 4:
        System.out.println (" La bomba es una bomba de pasta alimenticia");
        break;
        
        default:
       System.out.println ( "No existe un valor válido para tipo de bomba");
       
        
    }     
    }
    
}
