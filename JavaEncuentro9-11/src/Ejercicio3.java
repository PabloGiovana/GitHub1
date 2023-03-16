
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
Recorrer un vector de N enteros 
* contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio3 {
//    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese tamaño del arreglo");
//        int num = leer.nextInt();
//        int undig,dosdig,tresdig,cuatrodig,cincodig;
//        undig=0;
//        dosdig=0;
//        tresdig=0;
//        cuatrodig=0;
//        cincodig=0;
//        
//     int[] vector = new int[num];   
//        for (int i = 0; i < vector.length; i++) {
//         vector[i] = (int)(Math.random()*100000);
//            if (vector[i]<10) {
//                undig++;
//                            } else
//        
//                if (vector[i]>9 && vector[i] <100) {
//                    dosdig++;
//                }else
//                
//                if (vector[i]>99 && vector[i] <1000) {
//                    tresdig++;
//                }else
//                if (vector[i]>999 && vector[i] < 10000) {
//                    cuatrodig++;
//                }else
//                if (vector[i]>9999 && vector[i] < 100000) {
//                    cincodig++;
//                }
//        }
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println("["+ vector[i] +"]");
//            
//        }
//        System.out.println("La cantidad de números de un digito es de "+undig);
//        System.out.println("La cantidad de números de dos digitos es de "+dosdig);
//        System.out.println("La cantidad de números de tres digitos es de "+tresdig);
//        System.out.println("La cantidad de números de cuatro digitos es de "+cuatrodig);
//        System.out.println("La cantidad de números de cinco digitos es de "+cincodig);
//    }
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese tamaño del arreglo");
    int num = leer.nextInt();
    int[] vector = new int[num];
    int[] digitCounts = new int[6]; // use an array to keep track of the count for each digit

    for (int i = 0; i < vector.length; i++) {
        vector[i] = (int)(Math.random()*100000);
        int numDigits = countDigits(vector[i]); // call the countDigits method to get the number of digits
        digitCounts[numDigits]++; // increment the count for the appropriate number of digits
        System.out.println("[" + vector[i] + "]");
    }

    for (int i = 1; i < digitCounts.length; i++) {
        System.out.println("La cantidad de números de " + i + " digito(s) es de " + digitCounts[i]);
    }
}

public static int countDigits(int num) {
    if (num < 10) {
        return 1;
    } else if (num < 100) {
        return 2;
    } else if (num < 1000) {
        return 3;
    } else if (num < 10000) {
        return 4;
    } else {
        return 5;
    }
}
}
