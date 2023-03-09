/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int num1, num2 ;
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número");
        num2= leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
        System.out.println("Los dos números son mayores a 25");
        }
        else if  ( num1 <= 25 && num2<= 25) {
        System.out.println("Ninguno es mayor a 25" );
        }
        else if (num1 > 25 ){
            System.out.println(+num1+" es mayor a 25");
    }
        else if (num2 > 25 ) {
       System.out.println(+num2+" es mayor a 25");
                     
                     
                     }
            
        }
    }
        
     
    

